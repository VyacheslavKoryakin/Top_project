package HomeWorkOOP;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Андре", "Нортон");

        Book book1 = new Book(author1, "Саргассы в космосе", 1956);

        Author author2 = new Author("Рэй", "Бредбери");

        Book book2 = new Book(author2, "И грянул гром", 1952);


        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1);
        System.out.println(book2);

        book1.setTitle("Война и мир");
        book1.setYear(1868);
        book2.setAuthor(new Author("Александр", "Дюма"));

        System.out.println(book1.getAuthor() + " " + book1.getTitle() + " " + book1.getYear());
        System.out.println(book2.getAuthor() + " " + book2.getTitle() + " " + book2.getYear());

    }
}
