/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernumeros;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lukra
 */
public class LerNumeros {
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
        Iterator<Integer> ordenaRetorna = inteiro.iterator();
        if(!inteiro.isEmpty()) {
            System.out.println("Lista ordenada: ");
            while(ordenaRetorna.hasNext()) {
                System.out.println(ordenaRetorna.next());             
            }
        }else {
            System.out.println("Lista vazia!!");
        }        
    }    
}
