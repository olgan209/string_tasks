import java.util.Scanner;

public class stringG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int count = words.length;

        System.out.println(count);
    }
}
//    Напишите программу, которая считает количество слов в символьной строке.
//        Словом называется последовательность символов, отличных от пробела,
//        которая ограничена пробелами или границами строки.