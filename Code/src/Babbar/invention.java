package Babbar;

import java.util.*;

public class invention {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory invent[] = new Inventory[4];
		for (int i = 0; i < 4; i++) {
			String inventoryId = sc.next();
			int maximumQuantity = sc.nextInt();
			int currentQuantity = sc.nextInt();
			int threshold = sc.nextInt();
			invent[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
		}
		Inventory inv[] = replenish(sc.nextInt(), invent);
		for (Inventory ii : inv) {
			if (ii.getThreshold() >= 75)
				System.out.println(ii.getInventoryId() + " Critical Filling");
			else if (ii.getThreshold() >= 50)
				System.out.println(ii.getInventoryId() + " Moderate Filling");
			else
				System.out.println(ii.getInventoryId() + " Non-Critical Filling");
		}
	}

	public static Inventory[] replenish(int limit, Inventory inventory[]) {
		Inventory inv1[] = new Inventory[4];
		int i = 0;
		for (Inventory invent : inventory) {
			if (invent.getThreshold() <= limit) {
				inv1[i++] = invent;
			}
		}
		Inventory inv2[] = new Inventory[i];
		for (int j = 0; j < i; j++)
			inv2[j] = inv1[j];
		return inv2;
	}
}

class Inventory {
	private String inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getMaximumQuantity() {
		return maximumQuantity;
	}

	public void setMaximumQuantity(int maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public int getCurrentQuantity() {
		return currentQuantity;
	}

	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
		super();
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}

}
