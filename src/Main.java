import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> symbols= new ArrayList<>();
        String picture="";
        ASCIIArtGenerator w=new ASCIIArtGenerator();
        try {
            symbols= w.printTextArt("Java 1 4 java", 14, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_DIALOG,"+");

         for(int i=0;i<symbols.size();i++) {
             picture = picture + "\n" + symbols.get(i);
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( picture);
    }
}
