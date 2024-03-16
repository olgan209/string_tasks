import java.util.Scanner;
public class stringA {
    public static void main(String[] main){
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String replacement = x.replace("a", "b");
        System.out.println(replacement);
        char[] charStr = x.toCharArray();
        int count = 0;
        for (int i = 0; i < charStr.length; i++) {
            if(charStr[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
//    Напишите программу, которая заменяет в символьной строке все буквы a на буквы b (латинские, строчные).
//        входные данные
//        aabbccabadef
//        выходные данные
//        bbbbccbbbdef
//        4