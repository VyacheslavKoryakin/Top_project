package HomeWork_59_60;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {

    private static Map<Integer, Book> books = new HashMap<>();

    public Library() {
    }


    public void addBookToLibrary(Integer id, Book book) {

        books.put(id, book);

    }

    public Book getBook(Integer id) {
        return books.get(id);

    }

    public int contBooks() {
        return books.size();
    }

    public  int countAvailableBook(boolean isAvailable){
       List<Book> newBook= books.values().stream()
               .filter(b->b.isAvailable()==isAvailable)
               .toList();
       return newBook.size();

    }

    public Map<Boolean, List<Book>> getAvailableBook() {

        return books.values().stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
    }

    public List<Book> getFilteredBook(String author, Book book) {
        return books.values().stream()
                .filter(b -> b.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<String> getSortedAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }
    public Map<String, List<Book>> getBookByAuthor() {

        return books.values().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }
}
