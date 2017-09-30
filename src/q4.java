import java.text.DecimalFormat;
import java.util.Scanner;

public class q4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int cases, hoursworked, totalhours, avghours;
		cases = totalhours = avghours = 0;
		
		double basepay, totalpay, avgbase, avgtotal, basetotal, realtotal, realpay;
		avgbase= avgtotal = basetotal= realtotal = 0;
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");      
		
		do {			
			// Reading from System.in
			System.out.print("Base Pay:");
			double pay = in.nextDouble();
			System.out.print("Hours Worked:");
			int hours = in.nextInt();
			basepay = pay;
			hoursworked = hours;
			
			if((basepay == 0) && (hoursworked == 0)) {
				avgbase = Double.valueOf(df.format(avgbase));
				avgtotal = Double.valueOf(df.format(avgtotal));
				System.out.println("Averages");
				System.out.println("Base Pay:$"+avgbase+" Total Pay:$"+avgtotal+" Hours Worked:"+avghours);
			}
			else {
				//req 3
				if(basepay< 8.0) {
					System.out.println("Recheck Base Payment!");
				}
				else {
					cases++;
					basetotal += basepay;
					avgbase = basetotal/(double)cases;
					totalhours += hoursworked;
					avghours = totalhours/cases;
					
					if(hoursworked <= 40) {
						totalpay = hoursworked * basepay;
						realtotal += totalpay;
					}
					//req 1 & 2
					else {
						totalpay = 40 * basepay;
						totalpay += (hoursworked - 40) * basepay *1.5;
						
						//req 4
						if(hoursworked<= 70) {
							realtotal+= totalpay;
						}
						else
							System.out.println("Supervisor’s Approval Required!");
					}
					
					
					//req 5
					if((hoursworked>=5) && (totalpay < 100))
						totalpay = 100;
					if(totalpay>1000)
						totalpay = 1000;
					
					realpay = totalpay/(double)hoursworked;
					realpay = Double.valueOf(df.format(realpay));
					System.out.println("Real Pay:$" + realpay);
					
					avgtotal = realtotal/(double)cases;
				}
				
			}
			
		}
		while( (basepay != 0) && (hoursworked != 0) );
		in.close();
	}

}
