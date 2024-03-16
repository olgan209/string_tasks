import java.util.Scanner;
public class stringF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String longest = null;
        int max = Integer.MIN_VALUE;
        for (String word: words) {
            if(word.length() > max){
                max = word.length();
                longest = word;
            }
        }
        System.out.println(longest);
        System.out.println(max);

    }
}
//    Напишите программу, которая выводит самое длинное слово переданной
//        её символьной строки. Слово – это последовательность непробельных
//        символов, ограниченная пробелами или концами строки.
//
//        входные данные
//        abra cadabra fibra
//        выходные данные
//        cadabra
//        7