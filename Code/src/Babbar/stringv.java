package Babbar;

import java.util.*;

public class stringv {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrimeManagement pm[] = new PrimeManagement[4];
		for (int i = 0; i < 4; i++) {
			int primeId = sc.nextInt();
			sc.nextLine();
			String userProfileName = sc.nextLine();
			String subscriptionType = sc.nextLine();
			double subscriptionPrice = sc.nextDouble();
			sc.nextLine();
			int noOfProfiles = sc.nextInt();
			sc.nextLine();
			pm[i] = new PrimeManagement(primeId, userProfileName, subscriptionType, subscriptionPrice, noOfProfiles);
		}
		String subType = sc.nextLine();
		int val = findAvgPriceByType(pm, subType);
		if (val > 0)
			System.out.println(val);
		else
			System.out.println("There are no such prime Management");

	}

	public static int findAvgPriceByType(PrimeManagement pm[], String subType) {
		double sum = 0;
		int count = 0;
		for (PrimeManagement p : pm) {
			if (p.getSubscriptionType().equalsIgnoreCase(subType) && p.getNoOfProfiles() > 3) {
				sum += p.getSubscriptionPrice();
				count++;
			}
		}
		if (count == 0)
			return 0;
		else {
			int avg = (int) (sum / count);
			return avg;
		}
	}
}

class PrimeManagement {
	private int primeId;
	private String userProfileName;
	private String subscriptionType;
	private double subscriptionPrice;
	private int noOfProfiles;

	public int getPrimeId() {
		return primeId;
	}

	public void setPrimeId(int primeId) {
		this.primeId = primeId;
	}

	public String getUserProfileName() {
		return userProfileName;
	}

	public void setUserProfileName(String userProfileName) {
		this.userProfileName = userProfileName;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public double getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(double subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public int getNoOfProfiles() {
		return noOfProfiles;
	}

	public void setNoOfProfiles(int noOfProfiles) {
		this.noOfProfiles = noOfProfiles;
	}

	public PrimeManagement(int primeId, String userProfileName, String subscriptionType, double subscriptionPrice,
			int noOfProfiles) {
		super();
		this.primeId = primeId;
		this.userProfileName = userProfileName;
		this.subscriptionType = subscriptionType;
		this.subscriptionPrice = subscriptionPrice;
		this.noOfProfiles = noOfProfiles;
	}
}