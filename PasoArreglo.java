public class PasoArreglo {

                                    //pasa por referencia
    public static void modificarMatriz(int matriz[]){
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]*=2;
        }
        
        
    }
    
    public static void modificarElemento(int elemento){
    
        elemento*=2;
        System.out.println("elemento modificado"+elemento);
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int matriz[]={1,2,3,4,5};
        
        System.out.println("Matriz original: ");
        
        for(int i : matriz){    System.out.printf(" %d", i);    }
        System.out.println();
        PasoArreglo.modificarMatriz(matriz);
        System.out.println("Matriz modificada: ");
        for(int i : matriz){    System.out.printf(" %d", i);    }
        System.out.println();
        
        System.out.println("Valor elemento pos 4: "+ matriz[4]);
        PasoArreglo.modificarElemento(matriz[4]);
         System.out.println("Valor elemento despues modificado: "+ matriz[4]);
    }
    
}
