/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1aula14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author lukra
 */
public class Questao1aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> inteiro = new HashSet<>();        
        Scanner a = new Scanner(System.in);
        int num1;
        while(true) {
            try {
                System.out.println("Digite um numero inteiro: ");
                num1 = a.nextInt();
                inteiro.add(num1);               
            }catch(Exception e) {              
                break;
            }            
        }
        int total = 0;
        total = inteiro.stream().reduce(total, Integer::sum);        
        Stream<Integer> valores = inteiro.stream();
        System.out.println("Numeros da Lista: ");
        valores.forEach(e -> System.out.println(e));
        System.out.println("Soma dos valores: " + total);
    }
    
}
