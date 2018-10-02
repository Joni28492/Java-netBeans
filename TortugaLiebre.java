/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Alumno36
 */
public class TortugaLiebre extends JApplet{
    
     public static void inicializarMatriz(boolean matriz[]){
     
         matriz[0]=true;
         for (int i = 1; i < matriz.length; i++) {
             matriz[i]=false;
         }
     }
     
     public static void mostrarMatriz(boolean tortuga[], boolean liebre[]){
         
         System.out.println("POSICIONES ACTUALES");
         System.out.println("-------------------");
         
         for (int i = 0; i < tortuga.length; i++) {
             if(!tortuga[i])
                 System.out.print("*");
             else
                 System.out.print("T");
         }
         
         System.out.println();
          System.out.println();
          for (int i = 0; i < liebre.length; i++) {
             if(!liebre[i])
                 System.out.print("*");
             else
                 System.out.print("L");
         }
         System.out.println();
          System.out.println();
     }
         //pasar las posiciones como arrays pa que pille las referencias, sino hace copia int[2]posiciones 0 pa tortuga 1 pa liebre
     public static void asignarPosicion(boolean tortuga[], boolean liebre[], int[]posiciones){
     
         
         if(posiciones[0]<0)
             posiciones[0]=0;
         
         
         //modificamos la tortuga
         for (int i = 0; i <= posiciones[0]; i++) {
             
             if(tortuga[i]){
                 tortuga[i]=false;
                 
             }
             
             if(i==posiciones[0]){
                 tortuga[i]=true;
             }
             
         }
         if(posiciones[1]<0)
             posiciones[1]=0;
          //modificamos la liebre
         for (int i = 0; i <= posiciones[1]; i++) {
             
             if(liebre[i]){
                 liebre[i]=false;
                 
             }
             
             if(i==posiciones[1]){
                 liebre[i]=true;
             }
             
         }
     
     
     
     
     
     }
     /**
      *detectamos el choque de la tortuga y la liebre
      */
     public static boolean detectarChoque(boolean tortuga[], boolean liebre[]){
     
     
            for (int i = 0; i < tortuga.length; i++) {
             
                if(tortuga[i] && liebre[i]){
                    return true;
                }
            }
     
     
            return false;
     
     }
    /**
     * devolvemos numero aleatorio
     */
     public static int devolverAleatorio(int num){
         
         Random numeroAleatorio=new Random();
         
         num=1+numeroAleatorio.nextInt(10);
         return num;
     
     }
     
     
     //movimientos tortuga
     public static int pasoPesadoRapido(){System.out.println("Paso pesado rapido +3"); return 3;}
     public static int resbalon(){System.out.println("resbalon -6"); return -6;}
     public static int pasePesadoLento(){System.out.println("paso pesado lento +1"); return 1;}
     
     //movimientos liebre
     public static int dormir(){System.out.println("dormir 0"); return 0;}
     public static int granSalto(){System.out.println("gran salto +9"); return 9;}
     public static int granResbalon(){System.out.println("gran resbalon -12"); return -12;}
     public static int pequenioSalto(){System.out.println("pequenio salto +1"); return 1;}
     public static int pequenioResbalon(){System.out.println("pequenio resbalon -2"); return -2;}
    
     public static void movimiento(boolean tortuga[], boolean liebre[], int num, int  posiciones[]){
           
        //movimientos para la tortuga
       num=devolverAleatorio(num);
        System.out.println(num);
       if(num>0 && num<6){   posiciones[0]+=pasoPesadoRapido();   }
       if(num>5 && num<8){  posiciones[0]+=resbalon();   }
       if(num>7 && num<11){ posiciones[0]+=pasePesadoLento();   }
       if(posiciones[0]<0){   posiciones[0]=0;  }
       if(posiciones[0]>tortuga.length-1){    posiciones[0]=tortuga.length-1;   }
       
       //movimientos para la liebre
       num=devolverAleatorio(num);
       System.out.println(num);
       if(num>0 && num<3){  posiciones[1]+=dormir();   }
       if(num>3 && num<5){  posiciones[1]+=granSalto(); }
       if(num>5 && num<7){ posiciones[1]+=granResbalon(); }
       if(num>7 && num<10){    posiciones[1]+=pequenioSalto(); }
       if(num==10){    posiciones[1]+=pequenioResbalon(); }
       if(posiciones[1]<0){    posiciones[1]=0;   }
       if(posiciones[1]>liebre.length-1){  posiciones[1]=liebre.length-1; }

               
       asignarPosicion(tortuga,liebre,posiciones);
       
         System.out.println("Pos tortuga "+(posiciones[0]-1)+" Pos Liebre "+(posiciones[1]-1));
       
    }
    
    public static void botonEspera(){
        Scanner sc=new Scanner(System.in);
        int boton=0;
        
        System.out.println("continuar?");
        boton=sc.nextInt();
        
        
    }
     
    public static void main(String[] args) {
        // TODO code application logic here

        
        int posiciones[]={0,0};
        boolean tortuga[]=new boolean[30];
        boolean liebre[]=new boolean[30];
        
        int numero=0;
        //inicializacion
        inicializarMatriz(tortuga);
        inicializarMatriz(liebre);
        mostrarMatriz(tortuga, liebre);
        
        //movimientos
        do{
            botonEspera();
            numero=devolverAleatorio(numero);
            movimiento( tortuga,  liebre,  numero, posiciones);
            mostrarMatriz(tortuga, liebre);
        
        
        }while(posiciones[0]!=tortuga.length-1 && posiciones[1]!=liebre.length-1);
        
        
        //resultado
        if(posiciones[0]==tortuga.length-1 && posiciones[1]==liebre.length-1){
            System.out.println("EMPATE!!!");
        }
        
        else if(posiciones[0]==tortuga.length-1){
            System.out.println("La tortuga ha ganado la carrera");
        }
        
        else{
            System.out.println("La Liebre ha ganado la carrera");
        }
        
        
        
        
       
       
    }
    
}
