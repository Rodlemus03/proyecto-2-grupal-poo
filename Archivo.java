import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;


public class Archivo {
    private File archivo;

    public Archivo (String nombreArchivo){
        archivo = new File(nombreArchivo);
        if(!archivo.exists()){

        
        try {
            archivo.createNewFile();
            escribirArchivo("Paciente,enfermedad,medicamento");
        } catch (IOException e) {
            // El archivo ya existe o está en uso
            e.printStackTrace();
        }}
    }
    
    
    /** 
     * @param linea
     */
    public void escribirArchivo(String linea){
        try {
            String path="registro.csv";
            FileWriter fw=new FileWriter(path,true);
            fw.write("\n"+linea);
            fw.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> leerArchivo(){
        Scanner miLector;
        ArrayList<String> lineas = new ArrayList<String>();
        try {
            miLector = new Scanner(archivo);        
            while (miLector.hasNextLine()){
                lineas.add(miLector.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lineas;
    }
    
    /** 
     * @return String
     */
    public String leerArchivoString(){
        String texto = "";
        try {
            Scanner miLector = new Scanner(archivo);
            while (miLector.hasNextLine()){
                texto = texto + miLector.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return texto;
    }

    public void eliminarArchivo(){
        archivo.delete();
    }
}