public class Arreglos {

    public void AgregarArregloComoParametro(String [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }

    public char[] RegresarArregloDesdeUnMetodo(){
        return new char[] {'A', 'V', 'E', 'N', 'G', 'E', 'R', 'S'};
    }
}
