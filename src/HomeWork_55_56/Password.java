package HomeWork_55_56;

public class Password {
    public static void main(String[] args) {
        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};
        for (String pass : passwords) {
            if (pass.length() < 8 || pass.length() > 19) {
                System.out.println("Пароль " + pass + " должен быть длиной от 8 до 20 символов");

            } else if (pass.contains(" ")) {
                System.out.println("Пароль " + pass +" не должен иметь пробелов");

             } else if (pass.toLowerCase().equals(pass)) {
            System.out.println("Пароль " + pass +" должен иметь минимум одну букву в верхнем регистре");

            } else if (pass.toUpperCase().equals(pass)) {
                System.out.println("Пароль " + pass +" должен иметь минимум одну букву в нижнем регистре");

            } else if (pass.replaceAll("\\d","").length()==(pass.length())) {
                System.out.println("Пароль " + pass + " должен иметь минимум одну цифру");

            }else {
                System.out.println("Пароль " + pass + " подходит");
            }
        }
   }
}
