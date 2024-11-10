/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;
import java.util.Scanner;
/**
 *
 * @author Kevin Russo Emiliany
 */
public class Insertar_datos {
    
    Operaciones op = new Operaciones();
    
    Double n1, n2;
    String operador;
    
    public Double calcular(){
        
        Scanner lectura = new Scanner(System.in);
        
        Double resultado = 0.0;
        
        System.out.print("Digite un numero: ");
        n1 = lectura.nextDouble();
        
        System.out.println("_________________________________|\n"
                + "Seleccione una opcion: \n"
                + "suma\n"
                + "resta\n"
                + "multiplicacion\n"
                + "division"
                + "\n_________________________________|");
        operador = lectura.next();
        
        while(operador == "suma" || operador == "resta" || operador == "multiplicacion" || operador == "division"){
            
            
            
            
        
        
        System.out.print("_________________________________|\n"
                + "Digite un numero: ");
        n2 = lectura.nextDouble();

        System.out.println("_________________________________|");

        
                
        switch(operador){
            
            case "suma": resultado = op.suma(n1, n2);
                break;
            
            case "resta": resultado = op.resta(n1, n2);
                break;
            
            case "multiplicacion": resultado = op.multiplicacion(n1, n2);
                break;
                
            case "division": resultado = op.division(n1, n2);
                break;
            
            default: System.out.println("El operador ingresado no es correcto");
                break;
        }
        }
        return resultado;
        
    }
    
}
