public class Paciente {
    private String nombre;
    private String[] sintomas;

        //Constructor
        public Paciente(String nombre, String[] sintomas){
            this.nombre=nombre;
            this.sintomas=sintomas;
        }
        //gets
        public String getNombre(){return this.nombre;}
        public String[] getSintomas(){return this.sintomas;}
        //sets 
        public void setNombre(String nombre){this.nombre=nombre;}
        public void setSintomas(String[] sintomas){this.sintomas=sintomas;}
        //ToString
        public String toString(){
            String cadena="",sint="";
            for(int i=0;i<sintomas.length;i++){
                sint+=sintomas[i]+", ";
            }
            cadena+="\nNombre: "+this.nombre;
            cadena+="\nSintomas: "+sint;
            
            return cadena;
        }
        /*
         * METODO PARA AVERIGUAR EL TIPO DE ENFERMEDAD QUE TIENE
         */
        public String averiguarEnfermedad(String[] sintomas){
            String enferme="";
            Enfermedad enfermedad=new Enfermedad(sintomas);
            enferme=enfermedad.averiguarEnfermedad();
            return enferme;
        }
    
       

}
