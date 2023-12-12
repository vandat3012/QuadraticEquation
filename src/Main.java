import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = scanner.nextDouble();
        System.out.println("enter b");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Equation has \nroot1 = " + quadraticEquation.getRoot1() + "\nroot2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Equation has root1 = root2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}