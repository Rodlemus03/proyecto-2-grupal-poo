public class Medicamentos {
    private String nombre="";
    private Enfermedad enfermedad;

    //Constructor
    /*
     * No lleva mas parametros para que el sistema calcule tratamiento a partir de poca informacion.
     */
    public Medicamentos(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }
    //Metodo para averiguar el tipo correcto de medicamento
    public String AveriguaMedicamento(){
        String nombreEnfermedad=enfermedad.getNombre();
        String medicamento="";
        if(nombreEnfermedad.equalsIgnoreCase("Covid-19")){
            medicamento="Ivermectina";
        }else if(nombreEnfermedad.equalsIgnoreCase("Jaqueca")){
            medicamento="Dihidroergotamina";
        }else if(nombreEnfermedad.equalsIgnoreCase("Malestar estomacal")){
            medicamento="Suero y antiácido";
        }else if(nombreEnfermedad.equalsIgnoreCase("Cansancio")){
            medicamento="Descanso e infusiones de té";
        }else if(nombreEnfermedad.equalsIgnoreCase("Malestar general")){
            medicamento="Paracetamol";
        }else if(nombreEnfermedad.equalsIgnoreCase("Asma")){
            medicamento="Salbutamol";
        }else if(nombreEnfermedad.equalsIgnoreCase("Alergia de garganta")){
            medicamento="Loratadina y Fexofenadina ";
        }else if(nombreEnfermedad.equalsIgnoreCase("Vaso roto")){
            medicamento="Aspirina";
        }else if(nombreEnfermedad.equalsIgnoreCase("Artritis")){
            medicamento="naproxeno sódico y paracetamol";
        }else if(nombreEnfermedad.equalsIgnoreCase("Bronquitis")){
            medicamento="Budesonida";
        }else if(nombreEnfermedad.equalsIgnoreCase("Sinusitis")){
            medicamento="Corticosteroides y Fenilerfrina clohridrato";
        }else if(nombreEnfermedad.equalsIgnoreCase("Cancer de pulmon")){
            medicamento="Pembrolizumab de inmunoterapia ";
        }else if(nombreEnfermedad.equalsIgnoreCase("Parasitos")){
            medicamento="Mebendazol ";
        }else if(nombreEnfermedad.equalsIgnoreCase("Falta de descanso")){
            medicamento="Melatonina y descanso";
        }else if(nombreEnfermedad.equalsIgnoreCase("Deshidratacion")){
            medicamento="Suero, agua y bebidas con electrolitros";
        }else if(nombreEnfermedad.equalsIgnoreCase("Baja presion")){
            medicamento="Agua y un trozo de chocolate";
        }else{
            medicamento="No se encuentran motivos para darle medicina, sigue tomando agua, vitaminas y minerales";
        }
        return medicamento;
    }
    //Gets{
    public String getNombre(){return this.nombre;}
    public Enfermedad getEnfermedad(){return this.enfermedad;}
    //Sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEnfermedad(Enfermedad enfermedad){this.enfermedad=enfermedad;}
    //toString
    public String toString(){
        String cadena="";
        cadena+="\nNombre: "+this.nombre;
        cadena+="\nCombate: "+this.enfermedad.getNombre();
        return cadena;
    }
}
