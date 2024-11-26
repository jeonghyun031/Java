import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
