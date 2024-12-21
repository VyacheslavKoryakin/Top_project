package HomeWork_59_60;

import java.util.ArrayList;
import java.util.List;

import static HomeWork_59_60.Library.*;

public class Main {
    Book book;
    Library library;

    public static void main(String[] args) {
        Book book1 = new Book("Богатый папа, бедный папа", "Роберт Кийосаки", true);
        Book book2 = new Book("Зеленая миля", "Стивен Кинг", true);
        Book book3 = new Book("Буря мечей", "Джорж Мартин", false);
        Book book4 = new Book("Властелин колец", "Джорж Толкиен", true);
        Book book5 = new Book("Крестный отец", "Марио Пьюзо", false);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for (int i = 0; i < books.size(); i++) {
            addBookToLibrary(i + 1, books.get(i));
        }



        System.out.println();
        System.out.println(getBook(2));
        System.out.println(getBook(5));
        System.out.println(contBooks() + " книг в библиотеке");
        System.out.println(countAvailableBook(true)+" доступных книг в библиотеке");
        System.out.println(countAvailableBook(false)+" не доступных книг в библиотеке");
        for (Book book : books) {


            System.out.println(getFilteredBook(book.getAuthor(),book));
        }

        System.out.println(getSortedAuthors());
    }
}
