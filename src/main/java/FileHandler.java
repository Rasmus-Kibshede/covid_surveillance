import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private String filePath = "data/11_noegletal_pr_region_pr_aldersgruppe.csv";
    private ArrayList<Covid19Data> data = new ArrayList<>();

    public void loadData() {
        try {

            File file = new File(filePath);
            Scanner scan = new Scanner(file, StandardCharsets.ISO_8859_1);

            scan.nextLine();
            while (scan.hasNextLine()) {

                String[] words = scan.nextLine().split(";");
                data.add(new Covid19Data(words[0],
                        words[1],
                        Integer.parseInt(words[2]),
                        Integer.parseInt(words[3]),
                        Integer.parseInt(words[4]),
                        Integer.parseInt(words[5]),
                        words[6]));
            }

            scan.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Covid19Data> getData() {
        return data;
    }

    public String showData() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Covid19Data covid19Data : data) {
            stringBuilder.append(covid19Data);
            stringBuilder.append("\n");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
