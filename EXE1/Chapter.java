
package exe1;

public class Chapter {
    private int number;
    private Book livro;
    private String name;

    public Chapter(int number, Book livro,String name) {
        this.number = number;
        this.livro = livro;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
