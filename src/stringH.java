import java.util.Scanner;

public class stringH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().trim().toLowerCase();

        if(POlindrom(sentence)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    static boolean POlindrom(String sentence){
        StringBuilder reversed = new StringBuilder(sentence).reverse();
        return sentence.contentEquals(reversed);
    }
}
//    Напишите программу, которая определяет, является ли введённое слово
//        (без пробелов) палиндромом, то есть верно ли, что оно читается
//        одинаково слева направо и справа налево.

//    входные данные
//        kazak
//        выходные данные
//        YES
//        входные данные
//        banan
//        выходные данные
//        NO