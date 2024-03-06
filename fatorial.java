import java.util.*;
import java.math.*;
import java.text.*;

public class fatorial {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.0");
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        long fat = 1;
        
        if(num == 0) {
            fat = 1;
        } else {
            while(num >= 1) {
                fat *= num;
                num -= 1;
            }    
        }
        
        System.out.println(fat);
    }
}