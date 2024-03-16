import java.util.Scanner;

public class stringD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        String firstWord = words[0];
        System.out.println(firstWord);
    }
}
//    Напишите программу, которая выводит первое слово переданной её символьной
//строки. Слово – это последовательность непробельных символов, ограниченная
//        пробелами или концами строки.