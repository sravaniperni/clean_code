
public class CostEstimation {
	double calculateEstimate(double area, int material_standard, int automatic)
	 {
	  double total_cost;
	  if(automatic == 0)
	  {
	   if(material_standard ==1)
	   {
	    total_cost=1200*area;
	   }
	   else if(material_standard == 2)
	   {
	    total_cost = 1500*area;
	   }
	   else
	   {
	    total_cost = 1800*area;
	   }
	  }
	  else
	  {
	   total_cost = 2500*area;
	  }
	 return total_cost;
	 }
	} 
