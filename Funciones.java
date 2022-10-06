public class Funciones {
    /*
     * Funcion para mostrar todos los elementos de una lista
     * @param: recibe como parametro la lista
     */
    public void mostrarLista(String[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.println(i+1+"----"+lista[i]);
        }
    }
    /*
     * Funcion para limpiar una lista
     */
    public String[] limpiarLista(String[] lista){
        int contador=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]!=null){
                contador++;
            }
        }
        int contador2=0;
        String[] listaNueva=new String[contador];
        for(int i=0;i<lista.length;i++){
            if(lista[i]!=null){
                listaNueva[contador2]=lista[i];
                contador2++;
            }
        }
        return listaNueva;
    }

}
