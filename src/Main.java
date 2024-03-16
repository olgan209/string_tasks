import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str1 = new String("Jтva");
        String str2 = "Java";

        //вытащить букву под опр индексом
        System.out.println(str1.charAt(1));

        //
        System.out.println(str1.codePointAt(0));

        //сравнивает строки. происходит вычитание символов
        System.out.println(str1.compareTo(str2));

        //не учитывается регистр букв(не смотрят больщая или маленькая буквы) в предыдущем смотрят
        System.out.println(str1.compareToIgnoreCase(str2));

        //слияние двух строк
        System.out.println(str1.concat(str2));

        //
        System.out.println(str1.equals(str2));
    }
}
// a b c d e f g h i j k l m n o p q r s t u v w x y z