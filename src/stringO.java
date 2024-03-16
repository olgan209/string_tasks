import java.util.Scanner;

public class stringO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String extension = scanner.nextLine();

        int dotIndex = fileName.lastIndexOf(".");

        StringBuilder newFileName = new StringBuilder(fileName);
        if(dotIndex != -1){
            newFileName.insert(dotIndex, "." + extension);
        }
        else{
            newFileName.append(".").append(extension);
        }

        System.out.println(newFileName);
    }
}
//    Входные данные
//    Первая строка содержит имя файла, которое нужно изменить. Во второй строке записано нужное расширение.
//
//        Выходные данные
//        Программа должна вывести изменённое имя файла с заданным расширением.
//
//        Примеры
//        входные данные
//        qwerty
//        exe
//        выходные данные
//        qwerty.exe
//        входные данные
//        qwetry.old.pas
//        html
//        выходные данные
//        qwetry.old.html