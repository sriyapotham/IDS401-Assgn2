import java.util.Scanner;

class q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  // Reading from System.in
		System.out.println("Line 1");
		System.out.print("Y Int:");
		double int1 = in.nextDouble();
		System.out.print("Slope:");
		double b1= in.nextDouble();
		System.out.println("Line 2");
		System.out.print("Y Int:");
		double int2 = in.nextDouble();
		System.out.print("Slope:");
		double b2= in.nextDouble();
		in.close();
		
		if(b1 == b2) {
			double sep = Math.abs(int1-int2);
			if((int1 ==int2) || (sep<= .001)) 
				System.out.print("Overlap");
			else
				System.out.print("No intersect");
		}
		else {
			Double x, y;
			x = (int2-int1)/(b1-b2);
			y = b2*x + int2;
			
			System.out.println("The lines intersect at x="+x+" and y=" +y);
		}
		
	}
	

}
