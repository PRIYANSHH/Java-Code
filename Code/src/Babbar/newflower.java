package Babbar;

import java.util.*;

public class newflower {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Flower f[] = new Flower[4];
		for (int i = 0; i < 4; i++) {
			int flowerId = sc.nextInt();
			sc.nextLine();
			String flowerType = sc.nextLine();
			String state = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			f[i] = new Flower(flowerId, flowerType, state, price);
		}
		String newState = sc.nextLine();
		String str = findFlowerTypeByState(f, newState);
		if (str == null)
			System.out.println("Given state is not found");
		else
			System.out.println(str);

	}

	public static String findFlowerTypeByState(Flower flower[], String state) {
		String rt = null;
		for (Flower f : flower) {
			if (f.getState().equalsIgnoreCase(state))
				rt = f.getFlowerType();
		}
		return rt;
	}
}

class Flower {
	private int flowerId;
	private String flowerType;
	private String state;
	private int price;

	public int getFlowerId() {
		return flowerId;
	}

	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}

	public String getFlowerType() {
		return flowerType;
	}

	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Flower(int flowerId, String flowerType, String state, int price) {
		super();
		this.flowerId = flowerId;
		this.flowerType = flowerType;
		this.state = state;
		this.price = price;
	}
}