import java.util.*;
import java.math.*;
import java.text.*;

public class calcbasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");


        String tipo = scanner.next();

    switch (tipo) {
        case "sum":
            double nUma = scanner.nextDouble();
            double nDoisa = scanner.nextDouble();
            double resultadoa = nUma + nDoisa;
            System.out.println(resultadoa);
            break;

        case "sub":
            double nUms = scanner.nextDouble();
            double nDoiss = scanner.nextDouble();
            double resultados = nUms - nDoiss;
            System.out.println(resultados);
            break;

        case "mult":
            double nUmM = scanner.nextDouble();
            double nDoisM = scanner.nextDouble();
            double resultadom = nUmM * nDoisM;
            System.out.println(resultadom);
            break;

        case "div":
            double nUmD = scanner.nextDouble();
            double nDoisD = scanner.nextDouble();
            if (nUmD != 0 && nDoisD != 0) {
                double resultadod = nUmD / nDoisD;
                System.out.printf(df.format(resultadod));
            } else {
                System.out.println("Divisão por zero");
            }
            break;

        case "abs":
            double termoAbs = scanner.nextDouble();
            System.out.println(Math.abs(termoAbs));
            break;
            default:
                System.out.println("Operador inválido");
}

}
    }