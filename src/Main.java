import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the line to draw");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        PrintASSCIart.print(inputString);
    }
}
