import java.util.Scanner;
/**
 * CinemaWithScanner21
 */
public class CinemaWithScanner21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int row;
        int column;
        String name;
        String next;
        String [][]audience = new String[4][2];
        while (true) {
            System.out.print("Enter a name: ");
            name = input21.nextLine();
            System.out.print("Enter a row number: ");
            row = input21.nextInt();
            System.out.print("Enter column number: ");
            column = input21.nextInt();
            input21.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = input21.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
      

    }
}