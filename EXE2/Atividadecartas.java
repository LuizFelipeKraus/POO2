/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecartas;

import java.util.ArrayList;

public class Atividadecartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baralho chamadaBaralho = new Baralho();
        chamadaBaralho.impressao();
        chamadaBaralho.tirarCartasBaralho(52);        
        chamadaBaralho.embaralharCartas();
        
        //Outra forma
        Cartas primeiraCarta = new Cartas ("5", "paus");
        Cartas segundaCarta = new Cartas("10", "copas");
        ArrayList<Cartas> cartas = new ArrayList<>();
        cartas.add(primeiraCarta);
        cartas.add(segundaCarta);
        Baralho instanciarBaralho = new Baralho(cartas);
        instanciarBaralho.impressao();
        instanciarBaralho.tirarCartasBaralho(2);
       
    }
    
}
