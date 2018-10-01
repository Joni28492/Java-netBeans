import java.util.Scanner;
/**
 *
 * @author Alumno36
 */
public class Aerolinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean avion[]= new boolean[10];
        int eleccion = 0;
        Scanner sc=new Scanner(System.in);
        //inicializamos avion vacio
        for (int i = 0; i < avion.length; i++) {
            avion[i]=false;
        }
        
        for (int i = 0; i < avion.length; i++) {
            
            System.out.println("¿Primera o Segunda clase?");
            eleccion = sc.nextInt(); 
            
            
            
            switch(eleccion){
            
                case 1:
                    //primera clase
                    for (int j = 0; j < avion.length/2; j++) {
                        if(!avion[j]){
                            avion[j]=true;
                            System.out.println("Asiento"+j+"de primera clase ocupado");
                            j=avion.length;
                        }
                        else if(avion[j] && j==avion.length/2-1)
                            System.out.println("primera clase llena");
                    }
                    
                    
                    break;
            
            
                case 2:
                       //segunda clase
                    for (int j = avion.length/2; j < avion.length; j++) {
                        if(!avion[j]){
                            avion[j]=true;
                            System.out.println("Asiento"+j+"de segunda clase ocupado");
                            j=avion.length;
                        }
                        else if(avion[j] && j==avion.length-1)
                            System.out.println("segunda clase llena");
                    }
                    
                    
                    break;
                    
                    
            }//fin switch   
          
            
            System.out.println();
            System.out.println("------------------");
            System.out.println("Asientos ocupados");
            System.out.println("------------------");
            System.out.println();
            
            for (int j = 0; j < avion.length; j++) {
                
                System.out.print("asiento "+j);
                if(j<avion.length/2-1){
                    System.out.println(" de primera clase: ");
                }
                else{
                    System.out.println(" de segunda clase: ");
                }
                
                if(avion[j])
                    System.out.println("Ocupado");
                else
                    System.out.println("Libre");
            }
        }//fin for
        
        System.out.println("AVIÓN LLENO!");

        
        
        
    }
    
}
