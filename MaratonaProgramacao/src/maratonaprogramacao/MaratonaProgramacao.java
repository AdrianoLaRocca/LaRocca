/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaprogramacao;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class MaratonaProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int x = entrada.nextInt();
        System.out.println("Digite o segundo valor");
        int y = entrada.nextInt();
        
        int z = x + y;
        
        System.out.println("A soma dos valores é = " + z);*/
     
        Scanner entrada = new Scanner(System.in);
        double x = entrada.nextDouble();
        double y = x * x;
        double z = 3.14159;
        
        double area = z * y;
        
        System.out.println("A="+area);
                 
        
        
    }
    
}
