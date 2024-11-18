/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio_1 {

    /**
     * 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
     * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int med=0;
        
        System.out.println("Digite o valor minimo da peça");
        min = scan.nextInt();
        System.out.println("Digite o valor maximo da peça");
        max = scan.nextInt();
        med= (max + min)/2;
        System.out.println("O valor medio é de R$ " + med);
    }

}
