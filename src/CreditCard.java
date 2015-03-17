import java.util.Scanner;


public class CreditCard {
	private String cardNumber;
	public CreditCard(String cardNumber) {
		this.cardNumber=cardNumber;
	}




	public static boolean checkCard(String cardNumber){
		boolean alternateDigit = false;

		//check the last digit to see if valid
		int sum = 0;
		for (int x = cardNumber.length()-1;x>=0;x--){
			int number = Integer.parseInt(cardNumber.substring(x,x+1));
			System.out.println("credit card digit:" + number);
			if (alternateDigit){
				number=number*2;
				if (number>=10){
					number = (number%10) +1;
				}	

			}
			sum = sum + number;
			alternateDigit = !alternateDigit;
		}
		if (sum%10==0){

			return (true);
		}
		else{
			return(false);
		}
	}}
