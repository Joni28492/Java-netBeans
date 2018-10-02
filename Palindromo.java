import java.util.Scanner;

public class Palindromo {

    /**
     * @param args the command line arguments
     */
    
    public static int palindromo(char cadena[]){
        
        for (int i = 0; i < cadena.length; i++) {
            
            if(cadena[i]!=cadena[cadena.length-i-1]){
                return 0;
            }
            
        }
        return 1;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char cadena[];
        Scanner sc=new Scanner(System.in);
        String palabra;
        
        System.out.println("Introduce palabra");
        palabra=sc.nextLine();
        
        cadena=palabra.toCharArray();
        
        
        if(palindromo(cadena)==1){
            System.out.println("Es palindromo");
        
        }
        
        else{
            System.out.println("no es palindromo");
        }
        
    }
    
}
