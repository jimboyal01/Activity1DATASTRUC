/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

/**
 *
 * @author Rhodz
 */
public class math {
    
    int num1;
    int num2;
    
    
    public math(int num1, int num2) {
        
        this.num1 = num1;
        this.num2 = num2;
        
        addition(num1, num2);
        subtraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        modulus(num1, num2);
    }
    public void addition(int num1, int num2) {
        int addition = num1 + num2;
        System.out.println("Addition: "+addition);
    }
    public void subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        System.out.println("Subtraction: "+subtraction);
    }
    public void multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        System.out.println("Multiplication: "+multiplication);
    }
    public void division(int num1, int num2) {
        double division = num1 / num2;
        System.out.println("Division: "+division);
    }
    public void modulus(int num1, int num2) {
        double modulus = num1 % num2;
        System.out.println("Remainder: "+modulus);
    }
}
