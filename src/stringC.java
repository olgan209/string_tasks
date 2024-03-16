import java.util.Scanner;

public class stringC {
    public static void main(String[] main) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String replaced = replacement(x);
        System.out.println(replaced);
        System.out.println(counter(replaced));
    }

    public static String replacement(String x){
        StringBuilder rep = new StringBuilder();
        for (char y: x.toCharArray()) {
            if(y == 'a'){
                rep.append("b");
            } else if (y == 'b') {
                rep.append("a");
            } else if (y == 'A') {
                rep.append("B");
            } else if (y == 'B') {
                rep.append("A");
            } else{
                rep.append(y);
            }
        }
        return rep.toString();
    }

    static int counter(String replaced) {
        int count = 0;
        for (char t : replaced.toCharArray()) {
            if (t == 'a' || t == 'b' || t == 'A' || t == 'B') {
                count++;
            }
        }
        return count;
    }
}
//    Напишите программу, которая заменяет в символьной строке все буквы a
//        на буквы b , буквы A на буквы B , буквы b на буквы a и буквы B на буквы A .
//        входные данные
//        aabbccAABBCC
//        выходные данные
//        bbaaccBBAACC
//        8