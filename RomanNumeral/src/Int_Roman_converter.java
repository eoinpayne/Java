import java.util.Scanner;

public class Int_Roman_converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	@SuppressWarnings("resource")
	Scanner myScanner = new Scanner(System.in);
	int num = myScanner.nextInt();
	String new_roman = "";
		while (num != 0){
			if (num >= 1000){
				new_roman = new_roman + "M";
				num = num - 1000;
			}
			else if (num >= 900){
				new_roman = new_roman + "C";
				num = num - 900;
			}
			
			else if (num >= 500){
				new_roman = new_roman + "D";
				num = num - 500;
			}
			else if (num >= 400){
				new_roman = new_roman + "CD";
				num = num - 400;
			}
			else if (num >= 100){
				new_roman = new_roman + "C";
				num = num - 100;
			}
			else if (num >= 90){
				new_roman = new_roman + "XC";
				num = num - 90;
			}
			else if (num >= 50){
				new_roman = new_roman + "D";
				num = num - 50;
			}
			else if (num >= 40){
				new_roman = new_roman + "XL";
				num = num - 40;
			}
			else if (num >= 10){
				new_roman = new_roman + "X";
				num = num - 10;
			}
			else if (num >= 9){
				new_roman = new_roman + "IX";
				num = num - 9;
			}
			else if (num >= 5){
				new_roman = new_roman + "V";
				num = num - 5;
			}
			else if (num >= 4){
				new_roman = new_roman + "IV";
				num = num - 4;
			}
			else if (num >= 1){
				new_roman = new_roman + "I";
				num = num - 1;
			}			
		}
		System.out.println(new_roman);
		
	
			

}
}
