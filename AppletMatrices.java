import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Alumno36
 */





public class AppletMatrices extends JApplet {

    public static  boolean buscarDuplicado(int matriz[], int num){

        for (int i = 0; i < matriz.length; i++) {
            
            if(num==matriz[i])
                return false;
            
        }
        
        return true;      
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int num;
        
        
        for (int i = 0; i < matriz.length; i++) {
           
            do {                
                System.out.println("Introduce nota: ");
                num=sc.nextInt();
                
                if(buscarDuplicado(matriz,num)){
                
                    matriz[i]=num;
                    
                }
                else{
                    i--;
                }
                
            } while (num<10 || num>100);  
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("numero: "+matriz[i]);
            
        }
        
    }



    
}
