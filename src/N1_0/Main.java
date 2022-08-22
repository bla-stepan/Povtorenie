package N1_0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        for (int i=0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (j == 2) {
//                    System.out.println("#A# i: " + i + " j: " + j + " break (end j loop). Will not see #C#");
//                    break;
//                }
//                if (j == 1) {
//                    System.out.println("#B# i: " + i + " j: " + j + " continue (j++).Will not see #C#");
//                    continue;
//                }
//                System.out.println("#C# i: " + i + " j: " + j);
//            }
//        }
        //joyByDelimeted(" ", "привет меня, зовут степан");
        repeatString("1555", 3);
    }

    public static void joyByDelimeted(String delimeted, String... args) {
//        String str="";
//        for (int i = 0; i < args.length; i++) {
//            str = str+args[i]+delimeted;
//        }
//        System.out.println(str);
        System.out.println(String.join(delimeted, args));
    }

    //написать метод для повторения строки заданное количество раз
    public static void repeatString(String str, int tines) {
        //решение через stringBuilder
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < tines; i++) {
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);

        //Решение через метод repeat класса String
        System.out.println(str.repeat(tines));
        System.out.println(new StringBuilder(str).reverse());


    }

    //проверить строку на наличие хотябы одной цифры
    public static boolean containsOnliDigits(String str) {
        //первый вариант решения
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
        //еще решение
        for (Character sinbol : str.toCharArray()) {
            if (!Character.isDigit(sinbol)) {
                return false;
            }
        }
        return true;
    }
}


