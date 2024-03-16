import java.util.Scanner;

public class stringL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        if(words.length == 3){
            String sname = words[0];
            String name = words[1];
            String fname = words[2];
            remove(name, fname, sname);
        }
        else{
            System.out.println("Unavailable name");
        }

    }

    static void remove(String name, String fname, String sname){
        StringBuilder re = new StringBuilder(name).delete(1, 16);
        StringBuilder ren = new StringBuilder(fname).delete(1, 16);
        System.out.println(re + "." + ren + ". " + sname);
    }
}
//    Входные данные
//    Входная строка содержит фамилию, имя и отчество, разделённые одиночными пробелами.
//
//        Выходные данные
//        Программа должна вывести в одной строке сначала инициалы, а потом (через пробел) – фамилию.
//
//        Примеры
//        входные данные
//        Knuth Donald Ervin
//        выходные данные
//        D.E. Knuth