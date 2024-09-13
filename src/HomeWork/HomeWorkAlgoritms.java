package HomeWork;


import java.util.*;

public class HomeWorkAlgoritms {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести тип кофе:\n 1-сублимированный\n 2-молотый");
        int coffeTypeNumber = sc.nextInt();
        if (coffeTypeNumber > 2) {
            coffeTypeNumber = 2;
        }
        if (coffeTypeNumber < 1) {
            coffeTypeNumber = 1;
        }
        String coffeType = switch (coffeTypeNumber) {
            case 1 -> "сублимированный";

            default -> "молотый";
        };
        if (coffeType.equals("сублимированный")) {
            System.out.println("Засыпать в чашку и залить кипятком");
        } else {
            System.out.println("Намолоть кофе, заварить в турке, перелить в чашку");
        }


        System.out.println("\n");





        Random ramdom = new Random();
        int weaterInfo = ramdom.nextInt(0, 2);
        int weaterTemperature = ramdom.nextInt(0, 30);
        boolean isSunDay = (weaterInfo == 1) ? true : false;
        if (weaterTemperature > 25 && isSunDay) {
            System.out.println("Пойти на пляж");
        } else {
            System.out.println("пойти на работу");
        }


        System.out.println("\n");




        String[] tomatName = {"сливовые", "черри", "другой тип"};
        int tomatWeigt = 0;
        for (int i = 0; i < tomatName.length; i++) {
            if (tomatName[i].equals("черри")) {
                System.out.println("Это нужный сорт");
                System.out.println("Положить в карзину");
                for (int w = 0; tomatWeigt <= 1000; w++) {
                    tomatWeigt += 200;
                    System.out.println("Вес помидор в корзине равен: " + tomatWeigt);
                    if (tomatWeigt >= 1000) {
                        System.out.println("Купить помидоры");
                        break;
                    }
                }
                break;
            }else {
                System.out.println("Это не тот сорт, продолжить выбор");
            }
       }


        System.out.println("\n");


        Scanner scDate = new Scanner(System.in);
        System.out.println("Какой сегодня день недели?");
        String date = scDate.nextLine().toLowerCase();
        if(date.equals("понедельник") || date.equals("среда") || date.equals("пятница")){
            System.out.println("пойти в спортзал");
        }else {
            System.out.println("лечь спать");
        }


        System.out.println("\n");



        String[] tyresType = {"летние", "зимние"};
        int[] tyresSize = {14, 15, 17, 21};
        for (int n = 0; n < tyresType.length; n++)
            if (tyresType[n].equals("зимние")) {
                System.out.println("шины зимние- подходят");
                for (int s = 0; s < tyresSize.length; s++)
                    if (tyresSize[s] == 17) {
                        System.out.println("размер 17- подходят");
                        System.out.println("покупаю");
                        break;
                    } else {
                        System.out.println("размер " + tyresSize[s] + " не подходит");
                    }
            } else {
                System.out.println(tyresType[n] + " шины не подходят");
            }


        System.out.println("\n");


        Scanner scCandidateAge = new Scanner(System.in);
        Scanner scCandidateSpeciality = new Scanner(System.in);
        Random answer = new Random();
        System.out.println("введите возраст кандидата");
        int jobCandidateAge = scCandidateAge.nextInt();
        int canditateScores = 0;
        if (17 < jobCandidateAge && jobCandidateAge < 60) {
            System.out.println("ведите специальность кондидата");
            String jobCandidateSpecialty = scCandidateSpeciality.nextLine();
            if (jobCandidateSpecialty.equals("программист")) {
                for (int a = 0; a <= 10; a++) {
                    System.out.println("задать вопрос");
                    boolean goodAnswer = answer.nextBoolean();
                    if (goodAnswer) {
                        canditateScores++;
                    }
                    System.out.println("правильных ответов " + canditateScores);
                }
                if (canditateScores >= 6) {
                    System.out.println("Принять на работу");
                } else {
                    System.out.println("отказать в трудоустройстве");
                }
            } else {
                System.out.println("отказать в трудоустройстве");
            }
        } else {
            System.out.println("отказать в трудоустройстве");
        }

    }
}


