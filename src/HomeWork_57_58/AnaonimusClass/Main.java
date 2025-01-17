package HomeWork_57_58.AnaonimusClass;


public class Main {
    public static void main(String[] args) {

        Printer printer = message -> System.out.println(message);
        printer.print("Принтер отработал");


        Printer lambdaPrinter = (lP) -> System.out.println(lP);
        lambdaPrinter.print("Лямбда принтер отработал");

        Printer lambdaPrinter2 = (message) -> {
            System.out.println(message);
            System.out.println("Длина сообщения: \"" + message + "\" " + message.length());
        };
        lambdaPrinter2.print("Второй лямбда принтер отработал");
    }
}

