package methods;

public class Introduction {

	public static void main(String[] args) {
		
		System.out.println(Interest(100,5,5));
		System.out.println(Interest(100,2.5,5.5));
		

	}
	
	
	
	static int Interest(int p, int t, int r)
	{
		int interest = (p*t*r) / 100;
		return interest;
	}
	
	static double Interest(double p, double t, double r)
	{
		double interest = (p*t*r) / 100;
		return interest;
	}
}
