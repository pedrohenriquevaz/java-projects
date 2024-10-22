package lista_while;

import java.text.DecimalFormat;

public class farenheit {
	public static void main(String[] args) {
		int farenheint = 0;
		double centigrados = 0;
		DecimalFormat df = new DecimalFormat("#0.00");
		
		while(farenheint < 150) {
			centigrados = 0;
			farenheint++;
			centigrados = ((5f/9f) * (farenheint-32));
			System.out.println(farenheint + " °F = " + df.format(centigrados) + " °C");
		}		
	}

}
