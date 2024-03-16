import java.util.Scanner;

public class look {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем имя файла и нужное расширение
        String fileName = scanner.nextLine();
        String extension = scanner.nextLine();

        // Создаем объект StringBuilder для построения измененного имени файла
        StringBuilder newFileName = new StringBuilder();

        // Ищем последнюю точку в имени файла, чтобы вставить расширение перед ней
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex != -1) {
            // Если точка найдена, вставляем расширение перед ней
            newFileName.append(fileName.substring(0, dotIndex))
                    .append(".")
                    .append(extension)
                    .append(fileName.substring(dotIndex));
        } else {
            // Если точка не найдена, добавляем расширение в конец имени файла
            newFileName.append(fileName)
                    .append(".")
                    .append(extension);
        }

        // Выводим измененное имя файла
        System.out.println(newFileName);
    }
}
