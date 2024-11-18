/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
2) Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat dmt = new DecimalFormat("0.00");
        
        double dolar_cot;
        double valor;
        double convercao;
        System.out.println("Cotação do dolar:");
        dolar_cot = scan.nextDouble();
        
        System.out.println("Digite o valor em reias:");
        valor =scan.nextDouble();
        
        convercao =  valor/dolar_cot;
        
        
        System.out.printf("Com o dolar a R$%.2f, o valor de R$%.2f será de USD%.2f", dolar_cot, valor, convercao);
        
        
        
    }
}
