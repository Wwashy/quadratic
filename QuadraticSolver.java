import java.util.Scanner;

public class QuadraticSolver{
	public static void main(String[]args){
		Scanner rc=new Scanner(System.in);

		System.out.println("Enter the value of a: \n");
		double a = rc.nextDouble();
		System.out.println("Enter the value of b: \n");
		double b = rc.nextDouble();
		System.out.println("Enter the value of c: \n");
		double c = rc.nextDouble();


//		double x1,x2;
		double A = b*b;
		double B= 4*a*c;
		double C=2*a;
		double rootAB= Math.sqrt(A-B);

		double x1=(-b+rootAB)/C;
		double x2=(-b-rootAB)/C;
		
		System.out.println("A "+A);
		System.out.println("B "+B);
		System.out.println("C "+C);
		System.out.println("rootAB "+rootAB);

		System.out.println("Root1 is: "+ x1 +"\n Root2 is: "+ x2);
	}
}