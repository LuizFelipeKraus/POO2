
package exe1;

public class Book {
    private String ISBN;
    private int numCapitulos;
    private Author autor;
    private Chapter capitulo[];

    public String getISBN() {
        return ISBN;
    }


    public Book(String ISBN, Author autor, int numCapitulos) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.numCapitulos = numCapitulos;
        this.capitulo = new Chapter[numCapitulos];
    }
    public void setCapitulo(int number,String titulo){
        this.capitulo[number] = new Chapter(number,this,titulo);
    }
    public void printBook(){
        System.out.println("BOOK NAME: "  + this.ISBN);
        System.out.println("NAME AUTHOR: " + this.autor.getName());
        for(int i = 0 ; i < this.numCapitulos;i++){
            System.out.println("NUMBER CHAPTER: " + i + "\t" +this.capitulo[i].getName());
        }
    }
}
