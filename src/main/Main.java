/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Math.math;
import java.util.Scanner;
import Distance.distance;

/**
 *
 * @author Rhodz
 */
public class Main {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        //Calcualtor ni siya
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();
        math chae = new math(num1, num2);  //<--- Calculator Package ni siya
        
        //Distance ni siya
        System.out.print("Enter X1: ");
        double x1 = scn.nextDouble();
        System.out.print("Enter X2: ");
        double x2 = scn.nextDouble();
        System.out.print("Enter Y1: ");
        double y1 = scn.nextDouble();
        System.out.print("Enter Y2: ");
        double y2 = scn.nextDouble();
        System.out.print("Enter RADIUS: ");
        double rad = scn.nextDouble();
        
        distance tzu = new distance(x1, x2, y1, y2, rad); //<--- Distance Package ni siya
        
    }
    
}
