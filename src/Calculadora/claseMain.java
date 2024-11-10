/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;
import java.util.Scanner;
/**
 *
 * @author Kevin Russo Emiliany
 */
public class claseMain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Insertar_datos is = new Insertar_datos();
        
        Scanner leer = new Scanner(System.in);
        
        String opcion = "si";

        while(opcion == "si"){
            
            System.out.println("El resultado es: "+is.calcular());
        
            System.out.println("_________________________________|");
            
            System.out.println("Desea seguir con la calculadora?\n"
                    + "Si\nNo\n_________________________________|");
            opcion = leer.next();
            
            System.out.println("_________________________________|");
            
            while(opcion != "si" && opcion != "NO"){
                
                System.out.println("___________________________________________________________|");
                
                System.out.println("La opcion marcada es incorrecta, por favor buelva a elegir");
                
                System.out.println("Desea seguir con la calculadora?\n"
                    + "Si\n2No\n_________________________________|");
                opcion = leer.next();
                
            }
            
        }
    }
    
}
