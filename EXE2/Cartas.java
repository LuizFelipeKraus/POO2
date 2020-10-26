
package atividadecartas;

public class Cartas {
    private String carta;
    private String naipe; 

    public Cartas(String carta, String naipe) {
        this.setCarta(carta);
        this.setNaipe(naipe);
    }
    
    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
         if(carta.equalsIgnoreCase("as") || carta.equalsIgnoreCase("valete") 
                || carta.equalsIgnoreCase("dama") || carta.equalsIgnoreCase("rei")
                || carta.equals("2") || carta.equals("3") || carta.equals("4") 
                || carta.equals("5") || carta.equals("6") || carta.equals("7")
                || carta.equals("8") || carta.equals("9") || carta.equals("10")){
        this.carta = carta;
        }else
            throw new RuntimeException ("Carta errado");
    }
    


    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
         if(naipe.equalsIgnoreCase("copas") || naipe.equalsIgnoreCase("ouros") 
                || naipe.equalsIgnoreCase("espadas") || naipe.equalsIgnoreCase("paus")){
        this.naipe = naipe;
        }else{
            throw new RuntimeException ("Naipe errado");
        }
    }

    public String imprime() {
        return "\n" + carta + " de "+ naipe + "\n" ;
    }
}
