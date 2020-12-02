import java.util.ArrayList;
import java.util.Scanner;

public class PrintASSCIart  {
    public  static void print(String inputString ) {
        ArrayList<ArrayList<String>> listASSCIСharacters = new ArrayList<>();
        char[] letters = inputString.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            ASCIIArtGenerator w = new ASCIIArtGenerator();
            try {
                ArrayList<String> symbols = w.printTextArt(String.valueOf(letters[i]), 14, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_DIALOG, "+");
                listASSCIСharacters.add(symbols);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int j = 0;
        String rezultASSCI = "";
        while (listASSCIСharacters.get(0).size() != j) {
            for (int i = 0; i < listASSCIСharacters.size(); i++) {
                rezultASSCI = rezultASSCI + listASSCIСharacters.get(i).get(j);
            }
            rezultASSCI = rezultASSCI + "\n";
            j++;
        }
        System.out.println(rezultASSCI);
    }
}


