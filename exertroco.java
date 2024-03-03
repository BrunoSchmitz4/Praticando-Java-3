import java.util.*;

public class exertroco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stalnome = scan.nextLine();
        int valpagar = scan.nextInt();
        int valefetpgo = scan.nextInt();
        int diferenca = valefetpgo - valpagar;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        
        while(diferenca > 0) {
            while (diferenca >= 50) {
                diferenca -= 50;
                cinquenta += 1;
            }
            while (diferenca >= 20) {
                diferenca -= 20;
                vinte += 1;
            }
            while (diferenca >= 10) {
                diferenca -= 10;
                dez += 1;
            }
            while (diferenca >= 5) {
                diferenca -= 5;
                cinco += 1;
            }
            while (diferenca >= 2) {
                diferenca -= 2;
                dois += 1;
            }
            while (diferenca >= 1) {
                diferenca -= 1;
                um += 1;
            }
        }
        System.out.println(stalnome);
            System.out.println(cinquenta + "x50");
            System.out.println(vinte + "x20");
            System.out.println(dez + "x10");
            System.out.println(cinco + "x5");
            System.out.println(dois + "x2");
            System.out.println(um + "x1");

    }

}