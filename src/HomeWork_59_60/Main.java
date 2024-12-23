package HomeWork_59_60;

import java.util.ArrayList;
import java.util.List;

import static HomeWork_59_60.Library.*;

public class Main {
    Book book;


    public static void main(String[] args) {
        Book book1 = new Book("Богатый папа, бедный папа", "Роберт Кийосаки", true);
        Book book2 = new Book("Зеленая миля", "Стивен Кинг", true);
        Book book3 = new Book("Буря мечей", "Джорж Мартин", false);
        Book book4 = new Book("Властелин колец", "Джорж Толкиен", true);
        Book book5 = new Book("Крестный отец", "Марио Пьюзо", false);
        Book book6 = new Book("Сияние", "Стивен Кинг", true);
        Book book7 = new Book("Песнь льда и пламени", "Джорж Мартин", true);

        Library library = new Library();

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        for (int i = 0; i < books.size(); i++) {
            library.addBookToLibrary(i + 1, books.get(i));
        }


        System.out.println();
        System.out.println(library.getBook(2));
        System.out.println(library.getBook(5));
        System.out.println();
        System.out.println(library.contBooks() + " книг в библиотеке");
        System.out.println();
        System.out.println(library.countAvailableBook(true) + " доступных книг в библиотеке");
        System.out.println();
        System.out.println(library.countAvailableBook(false) + " не доступных книг в библиотеке");
        System.out.println();
        for (Book book : books) {
            System.out.println(library.getFilteredBook(book.getAuthor(), book));
        }
        System.out.println();
        System.out.println(library.getSortedAuthors());
        System.out.println();
        System.out.println(library.getAvailableBook());
        System.out.println();
        System.out.println(library.getBookByAuthor());


    }
}
