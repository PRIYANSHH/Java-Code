package Babbar;

import java.util.*;

public class simcard {

	public static void main(String[] args) {
		Sim[] cards = new Sim[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int simId = sc.nextInt();
			sc.nextLine();
			String customerName = sc.nextLine();
			double balance = sc.nextDouble();
			double ratePerSecond = sc.nextDouble();
			sc.nextLine();
			String circle = sc.nextLine();

			cards[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
		}

		String circle1 = sc.nextLine();
		String circle2 = sc.nextLine();

		Sim[] result = transferCustomerCircle(cards, circle1, circle2);

		for (Sim s : result)
			System.out.println(
					s.getSimId() + " " + s.getCustomerName() + " " + s.getCircle() + " " + s.getRatePerSecond());

	}

	public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2) {
		Sim sims[] = new Sim[5];
		int i = 0;
		for (Sim card : cards) {
			if (card.getCircle().equalsIgnoreCase(circle1)) {
				card.setCircle(circle2);
				sims[i++] = card;
			}
		}
		Sim newSim[] = new Sim[i];
		for (int j = 0; j < i; j++)
			newSim[j] = sims[j];
		Arrays.sort(newSim, new Comparator<Sim>() {
			@Override
			public int compare(Sim first, Sim second) {
				if (first.getRatePerSecond() < second.getRatePerSecond())
					return 1;
				if (first.getRatePerSecond() > second.getRatePerSecond())
					return -1;
				return 0;
			}
		});
		return newSim;
	}
}

class Sim {
	private int simId;
	private String customerName;
	private double balance;
	private double ratePerSecond;
	private String circle;

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatePerSecond() {
		return ratePerSecond;
	}

	public void setRatePerSecond(double ratePerSecond) {
		this.ratePerSecond = ratePerSecond;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
		super();
		this.simId = simId;
		this.customerName = customerName;
		this.balance = balance;
		this.ratePerSecond = ratePerSecond;
		this.circle = circle;
	}
}