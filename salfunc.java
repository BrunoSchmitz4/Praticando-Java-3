import java.util.*;
import java.text.*;
import java.math.*;

public class salfunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        String name = scan.nextLine();
        double hour = scan.nextDouble();
        double receberPHour = scan.nextDouble();
        int filhos = scan.nextInt();
        double salario = hour * receberPHour;
        double bonus =  (((filhos * 3) + 100) * salario)/100;

        System.out.println(name + ": " + (String.format("%.2f", bonus)));
    }

}