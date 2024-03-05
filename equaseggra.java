import java.util.*;
import java.text.*;
import java.math.*;

public class equaseggra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double del = b * b - 4 * a * c;

        if (del > 0){
            double x1 = (-b + Math.sqrt(del)) / (2 * a);
            double x2 = (-b - Math.sqrt(del)) / (2 * a);
            System.out.printf("%.2f;%.2f", x1, x2);

        }

        else if (del == 0) {
            double x = -b / (2 * a);
            System.out.printf("%.2f", x);
        }
        else{
            System.out.println("Sem raiz real");
        }
    }
}