/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2aula13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lukra
 */
public class Questao2aula13 {

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
            try {
                System.out.println("Digite um nome: ");
                nome = sc.next();
                if(nome.equals("*")) continue;
                System.out.println("Digite o telefone: ");
                telefone = sc.nextInt();
                nomeTelefone.put(nome, telefone );            
                System.out.println(nomeTelefone);
            }catch(Exception e ) {
                System.err.println("Voce Digitou um letras no lugar de números !!! ");
            }
        }         
        while (true) {
            System.out.println("Digite 1 se você quer pesquisar pelo nome inteiro");
            System.out.println("Digite 2 se você quer pesquisar pela letra");
            pesquisa = sc.nextInt();
            switch (pesquisa) {
                case 1:
                    System.out.println("Digite o nome da pessoa que você quer procurar: ");
                    nome = sc.next();
                    System.out.println("Telefone: " + nomeTelefone.get(nome));
                    break ;
                case 2:
                    System.out.println("Digite a letra sobre o perfil que quer encontrar");
                    String lnome = sc.next();
                    nomeTelefone.entrySet().forEach((key) -> {
                        if(key.getKey().startsWith(lnome)){
                            System.out.println(String.format("Nome e Telefones: %s", key));
                        }
                    });
                    break;
                default:
                    System.out.println("Valor informado invalido!!!");
                    break;
            }
            break;
        }
    }    
} 