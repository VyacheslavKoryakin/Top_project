package HomeWorkOOP;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Андре");
        author1.setSurname("Нортон");

        Book book1 = new Book();
        book1.setAuthor(author1);
        book1.setTitle("Саргассы в космосе");
        book1.setYear(1956);

        Author author2 = new Author();
        author2.setName("Рэй");
        author2.setSurname("Бредбери");

        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setTitle("И грянул гром");
        book2.setYear(1952);


        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
    }
}
