import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFileWeAreCreating = "C:\\Users\\Admin\\Desktop\\Example replace.txt"; //создаем строковую переменную, в
        //которую пишем адрес и имя файла, который хотим создать и записать туда данные
        replaceSystemOut(pathToFileWeAreCreating); //вызываем метод для подменны команды вывода в консоль System.out - на
        //команду записи в файл System.out
    }

    public static void replaceSystemOut(String pathToFile) throws FileNotFoundException { //метод для подменны команды вывода
        // в консоль System.out - на команду записи в файл System.out
        PrintStream printStream = new PrintStream(new File(pathToFile)); //создаем обьект класса PrintStream, который в свою
        // очередь отвечает за вывод данных и указываем в нем путь - место куда мы будем выводить данные

        PrintStream ourIDEAConsole = System.out; //в переменную типа PrintStream сохраним оригинал для отображения данных (т.е.
        //для отображения в консоли)

        System.setOut(printStream); //с помощью setOut, устанавливаем новый адрес вывода данных
        System.out.println("This line writing to the file..."); //выполняем процесс вывода (как обычно мы это делаем для
        //вывода в консоль)

        System.setOut(ourIDEAConsole); //с помощью setOut, возвращаем базовый адрес вывода данных (в консоль IDEA)
        System.out.println("This line writing to the console..."); //пробуем выполнить
    }
}