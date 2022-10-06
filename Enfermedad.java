
public class Enfermedad {
    public String nombre="Sin enfermedad";
    public String[] sintomas;

    //Constructor
    /*
     * El constructor solamente recibe los sintomas, ya que el punto es que a partir de eso diga la enfermedad que es. 
     */
    public Enfermedad(String[] sintomas){
        this.sintomas=sintomas;
    }
    /*
     * METODO PARA DECIFRAR ENFERMEDADES 
     */
    public String averiguarEnfermedad(){
        //Espacio para las comparaciones entre los sintomas
        Boolean tos=false;
        Boolean mocos=false;
        Boolean dolorGarganta=false;
        Boolean dolorCuerpo=false;
        Boolean diarrea=false;
        Boolean nausea=false;
        Boolean sangreGarganta=false;
        Boolean dolorEstomago=false;
        Boolean faltaEnergia=false;
        Boolean faltaAire=false;
        Boolean fatiga=false;
        Boolean dolorCabeza=false;
        Boolean dolorManos=false;
        Boolean temperaturaAlta=false;
        Boolean hemorragia=false;
        String enf="Sin enfermedad";
        for(int i=0;i<sintomas.length;i++){
            if(sintomas[i].equalsIgnoreCase("Tos")){tos=true;}
            else if(sintomas[i].equalsIgnoreCase("Mocos")){mocos=true;}
            else if(sintomas[i].equalsIgnoreCase("Dolor de garganta")){dolorGarganta=true;}
            else if(sintomas[i].equalsIgnoreCase("Dolor de cuerpo")){dolorCuerpo=true;}
            else if(sintomas[i].equalsIgnoreCase("Diarrea")){diarrea=true;}
            else if(sintomas[i].equalsIgnoreCase("Nausea")){nausea=true;}
            else if(sintomas[i].equalsIgnoreCase("Sangre en la garganta")){sangreGarganta=true;}
            else if(sintomas[i].equalsIgnoreCase("Dolor de estomago")){dolorEstomago=true;}
            else if(sintomas[i].equalsIgnoreCase("Falta de energia")){faltaEnergia=true;}
            else if(sintomas[i].equalsIgnoreCase("Falta de aire")){faltaAire=true;}
            else if(sintomas[i].equalsIgnoreCase("Fatiga")){fatiga=true;}
            else if(sintomas[i].equalsIgnoreCase("Dolor de cabeza")){dolorCabeza=true;}
            else if(sintomas[i].equalsIgnoreCase("Dolor de manos")){dolorManos=true;}
            else if(sintomas[i].equalsIgnoreCase("Temperatura alta")){temperaturaAlta=true;}
            else if(sintomas[i].equalsIgnoreCase("Hemorragia")){hemorragia=true;}
        }
        //YA DETECTA QUE SINTOMAS TIENEN, SI EL SINTOMA ES TRUE, SIGNIFICA QUE LO TIENE ENTONCES HAY QUE COMPARAR LOS TRUES PARA TENER COMBINACIONES DE SINTOMAS PARA VER QUE ENFERMEDAD ES
        //Por ejemplo
        if(tos&&mocos&&temperaturaAlta&&dolorCuerpo){
            enf="Covid-19";
        }else if(dolorCabeza){
            enf="Jaqueaca";
        }else if(dolorEstomago){
            enf="Malestar estomacal";
        }else if(fatiga){
            enf="Cansancio";
        }else if(dolorCuerpo){
            enf="Malestar general";
        }else if(faltaAire&&fatiga){
            enf="Asma";
        }else if(tos){
            enf="Alergia de garganta";
        }else if(hemorragia){
            enf="Vaso roto";
        }else if(dolorManos){
            enf="Artritis";
        }else if(nausea&&dolorCabeza&&dolorCuerpo){
            enf="Embarazo";
        }else if(tos&&dolorCuerpo&&dolorGarganta&&dolorCabeza&&faltaAire){
            enf="Bronquitis";
        }else if(mocos&&dolorCabeza&&tos&&dolorGarganta){
            enf="Sinusitis";
        }else if(dolorCuerpo&&sangreGarganta&&dolorCabeza&&faltaEnergia&&fatiga){
            enf="Cancer de pulmon";
        }else if(temperaturaAlta&&diarrea&&dolorCabeza&&dolorCuerpo){
            enf="Parasitos";
        }else if(fatiga&&dolorCabeza&&dolorCuerpo){
            enf="Falta de descanso";
        }else if(dolorCabeza&&fatiga&&dolorEstomago){
            enf="Deshidratacion";
        }else if(dolorCabeza&&fatiga&&faltaAire){
            enf="Baja presion";
        }else{
            enf="No pudimos encontrar tu enfermedad";
        }
        



        this.nombre=enf;
        return this.nombre;

    }


    //Gets
    public String getNombre(){return this.nombre;}
    public String getSintomas(){return this.nombre;}
    //Sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setSintomas(String[]sintomas){this.sintomas=sintomas;}
    //toString
    public String toString(){
        String cadena="",sint="";
        for(int i=0;i<sintomas.length;i++){
            sint+=i+", ";
        }
        cadena+="\nNombre: "+this.nombre;
        cadena+="\nSintomas: "+sint;

        return cadena;


    }
}
