public class Medicamentos {
    private String nombre="";
    private Enfermedad enfermedad;
    private String CompuestoPrincipal="";

    //Constructor
    /*
     * No lleva mas parametros para que el sistema calcule tratamiento a partir de poca informacion.
     */
    public Medicamentos(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }
    //Gets{
    public String getNombre(){return this.nombre;}
    public Enfermedad getEnfermedad(){return this.enfermedad;}
    public String getCompuesto(){return this.CompuestoPrincipal;}
    //Sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEnfermedad(Enfermedad enfermedad){this.enfermedad=enfermedad;}
    public void setCompuesto(String compuesto){this.CompuestoPrincipal=compuesto;}
    //toString
    public String toString(){
        String cadena="";
        cadena+="\nNombre: "+this.nombre;
        cadena+="\nCompuesto: "+this.CompuestoPrincipal;
        cadena+="\nCombate: "+this.enfermedad.getNombre();
        return cadena;
    }
}
