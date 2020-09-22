
package exe1;

public class Javaatividade1 {

 
    public static void main(String[] args) {
        Library b1 = new Library("Books Machado De Assis");
        Author a1 = new Author("Machado De Assis");
        Book l1 = new Book("Esaú e Jacó",a1,2);
        l1.setCapitulo(0, "Coisas Futuras");
        l1.setCapitulo(1, "Melhor de descer de que subir");
        l1.printBook();
        System.out.println();
        b1.addBook(l1);
        System.out.println();
        Author a2 = new Author("Machado de Assis");
        Book l2 = new Book("O Alienista",a2,2);
        l2.setCapitulo(0, "De como Itaguaí ganhou uma casa de orates");
        l2.setCapitulo(1, "Torrente de loucos");
        l2.printBook();
        System.out.println();
        b1.addBook(l2);
        System.out.println();
        b1.DisplayBook();
    }
    
}
