
public class MortgageCalc {
	
	public static double CalcMortgageFuction(double PA,double MI,double LM){
		double monthlyPayment = ( PA*((Math.pow(MI*(1+MI),LM))/(Math.pow(1+MI,LM)-1)));
	return monthlyPayment;
			}

	public static void main(String[] args) {

double PA = 100000.0;   	//principle amount
double YI = 6.0/100.0; 		//yearly interest
double MI = (YI/12.0);	//monthly interest
double LY = 6.0;			//length of loan in years
double LM = LY * 12.0; 	//length of loan in months


double toPay = CalcMortgageFuction(PA, MI, LM);
System.out.println(toPay);





 }
}