
import java.util.Scanner;

public class Scannerint
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                int a = scanner.nextInt();
                int num = a*3;
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Scannerint myScanner = new Scannerint();
        myScanner.run();
    }
}
