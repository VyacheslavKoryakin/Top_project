package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkConditionalOperators {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека от 2-х лет");
        int age = sc.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно посещать садик");

        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно посещать школу");

        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему следует учиться в университете");

        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора идти на работу");

        } else {
            System.out.println("вы ввели некорректный возраст");
        }
        System.out.println("\n");





        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите имя сотрудника:\n Диана \n Андрей \n Мирия");
        String employeeName = scanner.nextLine();
        int employeeSalary = 0;
        if (employeeName.equals("Диана") || employeeName.equals("Андрей") || employeeName.equals("Мария")) {
            employeeSalary = switch (employeeName) {
                case "Диана" -> 66_600;
                case "Андрей" -> 77_000;
                default -> 88_880;
            };
            int newSalary = (employeeSalary / 100 * 15) + employeeSalary;
            int revenue = employeeSalary * 12;
            int newRevenue = newSalary * 12;
            int differentBetweenRevenue = newRevenue - revenue;
            System.out.println(employeeName + " теперь получает " + newSalary + " рублей");
            System.out.println("Годовой доход вырос на " + differentBetweenRevenue + " рублей");
        } else {
            System.out.println("Такого сотрудника нет в базе");
        }

        System.out.println("\n");

        Random random = new Random();
        int monthNumber = random.nextInt(1,13);
        String month = switch (monthNumber){
          case  1,2,12 -> "Winter";
          case 3,4,5 -> "Spring";
          case 6,7,8 -> "Summer";
            default ->"Autumn";
        };
        System.out.println(month);
    }
}