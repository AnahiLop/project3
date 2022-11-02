public class CapGain{
	private double totCapGain;
	private Queue sharesHeld;

	public static void main(String[] args){
		System.out.println("Welcome to the main menu:");
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Total Capital Gain So Far");
		System.out.println("4. Quit");

	}
	public void buy(int numShares, double price){
		Node buy = new Node(numShares, price, null);
		sharesHeld.enqueue(buy);

	}

	public void sell(int numShares, double price){
		sharesHeld.dequeue();
	}
	public double getTotalCapGain(){
		return totCapGain;
	}
}