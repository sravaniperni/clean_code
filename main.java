import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception  {
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		  Scanner scanner = new Scanner(System.in);
		  output.println("Enter:\n1 for normal standard materials \n2 for above normal standard materials\n3 for high standard materials");
		  int material_standard=scanner.nextInt();
		  output.println("Enter:\n0 for not a automated house\n1 for fully automated house");
		  int automatic =scanner.nextInt();
		  output.println("Total area of house");
		  double area=scanner.nextDouble();
		  CostEstimation costestimation= new CostEstimation();
		  output.println(costestimation.calculateEstimate(area,material_standard,automatic));

		  output.println("Enter principle amount, rate, time for calculating interest:");
	      double principle_amount=scanner.nextDouble();
	      double rate=scanner.nextDouble();
	      double time=scanner.nextDouble();

		  Interest interest=new Interest();
		  output.println("Simple Interest="+interest.simpleInterest(rate,principle_amount,time));
	      output.println("Compound Interest="+interest.compoundInterest(principle_amount,rate,time));
	      output.close();
	      scanner.close();
	 }


}