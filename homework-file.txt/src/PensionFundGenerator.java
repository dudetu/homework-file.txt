import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionFundGenerator {
    private static final Random random = new Random();

    public static void main(String[] args) throws IOException {
        List<PensionFund> pensionFunds = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("resources/fund.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            PensionFund pensionFund = new PensionFund();
            pensionFund.setName(line);
            pensionFund.setSize(random.nextDouble() * 1000000);
            pensionFund.setFoundingDate(LocalDate.of(random.nextInt(100) + 1900,
                    random.nextInt(12) + 1,
                    random.nextInt(28) + 1));
            // другие поля можно заполнить случайным образом
            pensionFunds.add(pensionFund);
        }
        reader.close();

        // теперь у вас есть список фондов, созданных из файла fund.txt
    }
}
