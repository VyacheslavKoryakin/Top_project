package HomeWorkOOP;

import HomeWorkOOP.*;


public class Book {


    private Author author;
    private String title;
    private Integer year;


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

    public String getInfo() {
        return title + " " + author.getInfo() + " " + year;
    }
}

