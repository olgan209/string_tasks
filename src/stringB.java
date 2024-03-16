import java.util.Scanner;
public class stringB {
    public static void main(String[] main) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String replacement = x.replace("a", "b");
        String replacement1 = replacement.replace("A", "B");
        System.out.println(replacement1);
        char[] charStr = x.toCharArray();
        int count = 0;
        for (int i = 0; i < charStr.length; i++) {
            if(charStr[i] == 'a'){
                count++;
            }
            if(charStr[i] == 'A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
//    Напишите программу, которая заменяет в символьной строке все буквы a на буквы b , a буквы A на буквы B .
//        входные данные
//        aabbccAABBCC
//        выходные данные
//        bbbbccBBBBCC
//        4