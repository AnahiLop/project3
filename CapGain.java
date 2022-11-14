import java.io.*;
import java.util.*;

public class CapGain{
	private double totCapGain;
	public Queue sharesHeld;
	//private Queue pricesHeld;

	public CapGain(){
		totCapGain = 0;
		sharesHeld = new Queue();
	}

	public void mainMenuPrompt(){
		System.out.println("Welcome to the main menu:");
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Total Capital Gain So Far");
		System.out.println("4. Quit");

	}
	public void buy(int numShares, double price){
		for(int i = 0; i < numShares; i ++){
			sharesHeld.enqueue(price);
		}
	}

	public void sell(int numShares, double price){
		if (sharesHeld.Empty()){
			System.out.println("Sorry, you have ZERO shares to sell.");
		}
		else if(numShares > sharesHeld.size()){
			System.out.println("Sorry, you dont have enough shares to sell.");
		}

		else{
			double salePrice = numShares * price;
			double total = 0; 
			for(int i = 0; i < numShares; i++){
				double hold = price - sharesHeld.dequeue();
				salePrice = (numShares * hold);
			}
			totCapGain = totCapGain + salePrice;
		}
		//System.out.println(totCapGain);
		
	}
	public double getTotalCapGain(){
		return totCapGain;
	}
}

class CapGainApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		CapGain cg = new CapGain();
		do{
			cg.mainMenuPrompt();
			System.out.println("Please select one option: ");
			String answer = s.nextLine();
			if( answer == "1"){
				System.out.println("Please insert shares: ");
				String shares = s.nextLine();
				int giveShares = Integer.valueOf(shares);
				System.out.println("Please insert price: ");
				String givePrice = s.nextLine();
				double gPrice = Double.valueOf(givePrice);
				cg.buy(giveShares,gPrice);
				cg.sharesHeld.display();
			}
			else if(answer == "2"){
				System.out.println("Please insert shares: ");
				String shares = s.nextLine();
				int giveShares = Integer.valueOf(shares);
				System.out.println("Please insert price: ");
				String givePrice = s.nextLine();
				double gPrice = Double.valueOf(givePrice);
				cg.sell(giveShares,gPrice);
				cg.sharesHeld.display();
			}

			else if (answer == "3"){
				System.out.println("This is your total capital gain so far:");
				System.out.println(cg.getTotalCapGain());
			}

			else{
				System.out.println("Okay, Good Bye :)");
			}
		} while (answer == "1" || answer == "2" || answer == "3");
	}
}
			
		// cg.buy(10,20);
		// cg.buy(5,10);
		// cg.sharesHeld.display();
		// System.out.println(" ");
		// cg.sell(8,15);
		// cg.sharesHeld.display();
		// System.out.println(" ");
		// cg.sell(3,25);
		// cg.sharesHeld.display();
		// cg.sell(3,30);
		// cg.sharesHeld.display();
		// System.out.println(" ");
		// cg.sell(1,5);
		// cg.sharesHeld.display();
		// System.out.println(" ");
		// cg.sell(2,5);
		// cg.sharesHeld.display();
		// System.out.println(" ");
		// System.out.println(cg.getTotalCapGain());
