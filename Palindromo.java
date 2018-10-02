/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno36
 */
import java.util.Scanner;

public class Palindromo {

    /**
     * @param args the command line arguments
     */
    
    public static boolean palindromo(char cadena[]){
        
        for (int i = 0; i < cadena.length/2; i++) {
            
            if(cadena[i]!=cadena[cadena.length-i-1]){
                return false;
            }
            
        }
        return true;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char cadena[];
        Scanner sc=new Scanner(System.in);
        String palabra;
        
        System.out.println("Introduce palabra");
        palabra=sc.nextLine();
        
        cadena=palabra.toCharArray();
        
        
        if(palindromo(cadena)){
            System.out.println("Es palindromo");
        
        }
        
        else{
            System.out.println("no es palindromo");
        }
        
    }
    
}
