
public class MortgageCalculatorTest {

	public static double CalcMortgageFuction(double PA,double MI,double LM){
//		double monthlyPayment = ( PA*((Math.pow(MI*(1+MI),LM))/(Math.pow(1+MI,LM)-1)));
//	return monthlyPayment;
		double MIone = (1+MI);	
	double monthlyPayment = PA*(Math.pow(MI*MIone,LM))/((Math.pow(MIone,LM))-1);			
	return monthlyPayment;
			}

	public static void main(String[] args) {

double PA = 100000.0;   	//principle amount
double YI = 6.0; 		//yearly interest
double MI = ((YI/12.0)/100);	//monthly interest
double LY = 15.0;			//length of loan in years
double LM = LY * 12.0; 	//length of loan in months


double MIone = (1+MI);	
//double monthlyPayment = PA*(Math.pow(MI*MIone,LM))/((Math.pow(MIone,LM))-1);
//double monthlyPayment = PA* (((MI * (1+MI))*LM)/(((1+MI)*LM)-1));
//double monthlyPayment = (PA * (MI) * (1+MI) * (12*6)/
//((1+MI)*12*6-1));
double monthlyPayment = (PA * MI) / (1 - Math.pow(1 + MI, -LM));



//double toPay = CalcMortgageFuction(PA, MI, LM);
System.out.println(monthlyPayment);





 }
}


