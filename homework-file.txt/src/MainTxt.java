import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MainTxt{
    public static void main(String[] args) {


//уровень сложности: настройка файла data.txt. Запишите его в стихотворение
// любого автора, которого вы любите.
// Теперь создайте программу, которая считывает два числа (начало, окончание)
// с консолью - начальные и конечные номера строк. Задача сохранить в файле resize_data.txt только
// те строки из предполагаемого файла (оттуда надо сначала прочитать данные), которые охватываются
// между началом и окончанием. Например. если в тексте: У лукоморья зелёный дубый; Златая цепь на
// дубе том: И днём и ночью кот учёный Всё идёт по цепи кругом; Идёт впереди — песнь заводит,
// Налево — сказку говорит. Там чудеса: там леший бродит, Выбрать строку, при старте=2, финише=4,
// то в файле сохранить: Златая цепь на дубе том: И днём и ночью кот учёный Всё идёт по цепи кругом;


        String inputFile = "resources/data.txt";// путь и файл
        String outputFile = "resources/resize_data.txt";// путь и файл
        int startLine = 1;//номер строки начальной
        int endLine = 2; // намер строки последней

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line = reader.readLine();
            int lineNumber = 1;

            while (line != null) {
                if (lineNumber >= startLine && lineNumber <= endLine) {
                    writer.write(line);
                    writer.newLine();
                }
                lineNumber++;
                line = reader.readLine();
            }

            reader.close();
            writer.close();

            System.out.println("Вывод записывается в " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
