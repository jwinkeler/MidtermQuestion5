import java.util.Scanner;



public class ValidateCard {

	public void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your credit card number:");
		String cardNumber = input.toString();
	if (CreditCard.checkCard(cardNumber)==false){
		System.out.println("This is an invalid credit card number.");
	}
	else
		System.out.println("This is a valid credit card number!");
	}
	
}
