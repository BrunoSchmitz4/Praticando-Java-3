import java.util.*;
import java.text.*;
import java.math.*;

public class exer14volumecaixadagua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		double raio = scan.nextFloat();
		double altu = scan.nextFloat();
		double vol = Math.PI * (raio * raio) * altu;
		
		System.out.println(String.format("%.2f", vol));
	}

}
