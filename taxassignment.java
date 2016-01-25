import java.util.Objects;
import java.util.Scanner;

public class taxAmount {
	public static void main(String[] args) {
		        
		        // Declare all your variables at the top
		        double purchaseAmount;
		        String stateOfResidence;

		        // You only need to create the scanner object only once.
		        Scanner input = new Scanner(System.in);

		        // Taking in the user input for the purchase amount
		        System.out.println("Enter purchase amount: ");
		        purchaseAmount = input.nextDouble();

		        // Taking in the user input for the State
		        System.out.println("Enter state of residence: ");
		        stateOfResidence = input.next();

		        // Closing the scanner. Just memorize this step for now!
		        input.close();

		        // The most important call of the main function.
		        System.out.println("Your tax amount on a purchase of " + calcTaxRateForPurchase(purchaseAmount, stateOfResidence)); 
		    }
		    
		    public double calcTaxRateForPurchase(double purchaseAmount, String state) {
		        double rate;
		        if (Objects.equals(state, "CA")) {
		            rate = .075;
		        } else if (Objects.equals(state, "NY")) {
		            rate = .0825;
		        } else if (Objects.equals(state, "NJ")) {
		            rate = .0425;
		        } else if (Objects.equals(state, "IL")) {
		            rate = .105;
		        } else if (Objects.equals(state, "TX")) {
		            rate = .55;
		        } else {
		            rate = .10;
		        }        
		        return purchaseAmount * rate;
		    }
		    
		}
	}

}
