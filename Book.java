public class Book extends Product {
    private String author;
    private String genre;

    public Book(int id, String name, double price, String author, String genre) {
        super(id, name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.printf("ID: %d | Book: %s | Author: %s | Genre: %s | Price: $%.2f\n",
            getId(), getName(), author, genre, getPrice());
    }

    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    public void setAuthor(String author) { 
        if (author != null && !author.trim().isEmpty()) this.author = author; 
    }

    public void setGenre(String genre) { 
        if (genre != null && !genre.trim().isEmpty()) this.genre = genre; 
    }
}