package HomeWorkOOP;


public class Book {


    private Author author;
    private String title;
    private Integer year;

    public Book() {

    }

    public Book(Author author, String title, Integer year) {
        this.author = author;
        this.year = year;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }


    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author.toString() +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

