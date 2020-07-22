public class Interest {
	double simpleInterest(double rate, double principle_amount, double time)
	 {
	  return (principle_amount*rate*time)/100;
	 }
	 double compoundInterest(double principle_amount, double rate, double time)
	 {
	  return principle_amount*(Math.pow((1+(rate/100)),(time)))-principle_amount;
	 }
}