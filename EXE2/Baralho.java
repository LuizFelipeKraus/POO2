
package atividadecartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private final ArrayList<Cartas> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        iniciarBaralho();
    }
   
    public Baralho(ArrayList<Cartas> cartas){
        this.cartas = cartas;
    }
    private void iniciarBaralho() {
        String carta[] = {"As","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String naipe[] = {"Espadas","Copas","Ouros","Paus"};
        try{
            for(int i = 0; i < 13; i++){
                for(int j = 0; j < 4; j++){
                    adicionaCarta(carta[i], naipe[j]);
                }
            }
        }catch(Exception e){
            System.out.println("Erro:" + e);     
        }
    }

    public void adicionaCarta(String carta, String naipe) {
        Cartas novaCarta = new Cartas(carta, naipe);
        cartas.add(novaCarta);
    }
    
    public void embaralharCartas(){ 
         try{
            int quantidade = 52;
            List<Integer> baralhoAleatorio = new ArrayList<>();
            int sorteio;
            System.out.println("----------- Baralho Aleatório ----------");
            do {
                boolean adicionarLista = true;
                sorteio = (int) (Math.random() * 52); 
                for (int i : baralhoAleatorio){
                    if (i == sorteio) {
                        adicionarLista = false;
                        break;
                    }
                }
                if (adicionarLista) { baralhoAleatorio.add(sorteio); }
            }while (baralhoAleatorio.size() < quantidade);
                for (int x : baralhoAleatorio) {
                        System.out.println(cartas.get(x).imprime());
                }
            System.out.println("----------------------------------------");
         }catch(Exception c){
             System.out.println("Erro: " + c.getMessage());
         }
    }
    
    public void tirarCartasBaralho(int quantidadeCartas){
        try{
            Random gerador = new Random();
            System.out.println("------------ Carta retirada ------------" + cartas.get(gerador.nextInt(quantidadeCartas)).imprime() );
            System.out.println("----------------------------------------");
        }catch(Exception e){
            System.out.println("Desculpe a carta pedida não foi encontrada veja se "
                    + "a declaração de quantidade está certo com a quantidade de cartas");
        }
    }
    
    public void impressao() {
        System.out.println("-----------Começo do Baralho------------");
         try{
            for(int i = 0; i<52;i++){
                System.out.println(cartas.get(i).imprime());
            }
         }catch(Exception e){
            System.out.println("Erro quantidade invalida de cartas " );     
        }        
        System.out.println("------------Final do Baralho------------");
    }
}
