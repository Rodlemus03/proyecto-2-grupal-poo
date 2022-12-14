import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DECLARACION DE OBJETOS VACIOS
        String[] sintomas = new String[20];
        Paciente paciente = new Paciente("nombre", sintomas);
        Funciones funciones=new Funciones();
        Scanner teclado = new Scanner(System.in);
        Archivo archivo=new Archivo("registro.csv");
        
        int eleccion=0;
        System.out.println("1. Administrador ");
        System.out.println("2. Paciente ");
        eleccion=teclado.nextInt();
        if(eleccion==1){
            System.out.println(archivo.leerArchivoString());
        }else if(eleccion==2){

        // DECLARACION DE VARIABLES GENERALES
        String[] sintomasMostrar = new String[] {
        "Tos", 
        "Mocos", 
        "Dolor de garganta",
        "Dolor de cuerpo",
        "Diarrea",
        "Nausea", 
        "Sangre en la garganta", 
        "Dolor de estomago", 
        "Falta de energia", 
        "Falta de aire", 
        "Fatiga",
        "Dolor de cabeza", 
        "Dolor de manos", 
        "Temperatura alta", 
        "Hemorragia"};
        String nombre, respuesta = "y";
        int contador = 0, numeroSintoma;
        String[] sintomasLimpio;

        System.out.println("BIENVENIDO AL SISTEMA PARA DIAGNOSTICAR ENFERMEDADES");
        System.out.println("Ingresa tu nombre ");
        nombre = teclado.next();
        paciente.setNombre(nombre);
        while(respuesta.equalsIgnoreCase("y")){
            funciones.mostrarLista(sintomasMostrar);
            System.out.println("Ingresa el numero del sintoma que tienes ");
            numeroSintoma=teclado.nextInt()-1;
            if(numeroSintoma>=0 && numeroSintoma<=15){
                sintomas[contador]=sintomasMostrar[numeroSintoma];
                System.out.println("Tienes mas sintomas? ");
                respuesta=teclado.next();
                contador++;
            }else{
                System.out.println("Ingresa un sintoma correcto porfavor");
            }
        }
        sintomasLimpio=funciones.limpiarLista(sintomas);
        funciones.mostrarLista(sintomasLimpio);
        paciente.setSintomas(sintomasLimpio);
        System.out.println(paciente.toString());
        System.out.println("DIAGNOSTICO ");
        System.out.println("Su enfermedad es: ");
        System.out.println(paciente.averiguarEnfermedad(sintomasLimpio));
        Medicamentos medicamento=new Medicamentos(paciente.getEnfermedad());
        String medicina=medicamento.AveriguaMedicamento();
        System.out.println("MEDICAMENTO RECOMENDADO: ");
        System.out.println(medicina);
        String linea=paciente.getNombre()+","+paciente.getEnfermedad().getNombre()+","+medicina;
        archivo.escribirArchivo(linea);
    }else{
        System.out.println("Ingresa un valor correcto porfavor");
    }
       

    }
}