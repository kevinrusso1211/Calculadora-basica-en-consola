/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Kevin Russo Emiliany
 */
public class Operaciones {
    
    public Double suma, resta, multiplicacion, division;
    
    public Double suma(Double n1, Double n2){
        
        suma = n1 + n2;
        
        return suma;
        
    }
    
    public Double resta(Double n1, Double n2){
        
        resta = n1 - n2;
        
        return resta;
        
    }
    
    public Double multiplicacion(Double n1, Double n2){
        
        multiplicacion = n1 * n2;
        
        return multiplicacion;
        
    }
    
    public Double division(Double n1, Double n2){
        
        division = n1 / n2;
        
        return division;
        
    }
    
}
