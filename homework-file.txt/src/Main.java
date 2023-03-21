
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) throws IOException {


        /*
        Создайте файл data.txt. Запишите в него стихотворение любого автора, которого вы любите.
        Теперь создайте программу, которая считывает два числа (start, finish) с консоли - начальные и конечные номера строк.
        Задача сохранить в файл resize_data.txt только те строки из первоначального файла (оттуда надо сначала прочитать данные),
        номера которых располагаются между start и finish. */


                String path = "resources/data.txt";
                String outputPath = "resources/resize_data.txt";

                Scanner scanner = new Scanner(System.in);

                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

                System.out.print("Введите start:");
                int start = scanner.nextInt();
                System.out.print("Введите finish:");
                int finish = scanner.nextInt();

                List<String> strings = new ArrayList<>();

                String line = "";
                while (line != null) {
                    strings.add(line);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();

                for (String s : strings) {
                    System.out.println(s);
                }
                System.out.println("-----------");


                for (int i = 0; i < strings.size(); i++) {
                    if (i >= start && i <= finish) {
                        System.out.println(strings.get(i));
                        bufferedWriter.write(strings.get(i));
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.close();
            }
        }
















