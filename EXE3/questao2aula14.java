/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2aula14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author lukra
 */
public class Questao2aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String nome = "";
        int telefone;  
        int pesquisa;
        Map<String,Integer> nomeTelefone = new HashMap<>();
        while(!nome.equals("*")) {
            System.out.println("Digite um nome: ");
            nome = sc.next();
            if(nome.equals("*")) continue;
            System.out.println("Digite o telefone: ");
            telefone = sc.nextInt();
            nomeTelefone.put(nome, telefone );            
            System.out.println(nomeTelefone);
        }     
        System.out.println("Digite a letra sobre o perfil que quer encontrar");
        String lnome = sc.next();
        Map<String,Integer> result = nomeTelefone.entrySet()
        .stream()
        .filter(map -> map.getKey().startsWith(lnome))
        .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())); 
         System.out.println(result);
              
        }
}
    

