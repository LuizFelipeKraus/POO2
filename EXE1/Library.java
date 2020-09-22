
package exe1;

public class Library {
    private String Name;
    private Book Livro[];
    private int numberBook;

    public Library(String Name) {
        this.Name = Name;
        this.Livro = new Book[10];
        this.numberBook = 0;
    }
    public void addBook(Book livro){
        this.Livro[this.numberBook] = livro;
        this.numberBook ++;
    }
    public int getNumberBook(){
        return this.numberBook;
    }
    public void DisplayBook(){
        System.out.println("LIBRARY: " + this.Name);
        System.out.println("BOOK");
        for(int i = 0 ; i < this.numberBook ; i++){
            System.out.println("BOOK : " + i + "\n" + "TITLE: " + this.Livro[i].getISBN());
        }
    }
}
