package Babbar;

import java.util.*;

public class footwear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Footwear2 fwear[] = new Footwear2[5];
		for (int i = 0; i < 5; i++) {
			int footwearId = sc.nextInt();
			sc.nextLine();
			String footwearName = sc.nextLine();
			String footwearType = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			fwear[i] = new Footwear2(footwearId, footwearName, footwearType, price);
		}
		String ftype = sc.nextLine();
		String fName = sc.nextLine();
		int count = getCountByType(fwear, ftype);
		Footwear2 f[] = getSecondhighestPriceByBrand(fwear, fName);
		if (count > 0)
			System.out.println(count);
		else
			System.out.println("Footwear not available");
		if (f == null)
			System.out.println("Brand not available");
		else {
			for (Footwear2 ff : f) {
				System.out.println(ff.getFootwearId());
				System.out.println(ff.getFootwearName());
				System.out.println(ff.getPrice());
			}
		}
	}

	public static int getCountByType(Footwear2 foot[], String wearType) {
		int count = 0;
		for (Footwear2 f : foot) {
			if (f.getFootwearType().equalsIgnoreCase(wearType))
				count++;
		}
		return count;
	}

	public static Footwear2[] getSecondhighestPriceByBrand(Footwear2 foot[], String wearName) {
		int maxPrice = -1;
		for (Footwear2 f : foot) {
			if (f.getFootwearName().equalsIgnoreCase(wearName) && f.getPrice() > maxPrice)
				maxPrice = f.getPrice();
		}
		int maxPrice2 = -1;
		for (Footwear2 f : foot) {
			if (f.getFootwearName().equalsIgnoreCase(wearName) && f.getPrice() > maxPrice2 && f.getPrice() < maxPrice)
				maxPrice2 = f.getPrice();
		}
		Footwear2 fwear1[] = new Footwear2[5];
		int i = 0;
		for (Footwear2 f : foot) {
			if (f.getFootwearName().equalsIgnoreCase(wearName) && f.getPrice() == maxPrice2)
				fwear1[i++] = f;
		}
		if (i != 0) {
			Footwear2 fwear2[] = new Footwear2[i];
			for (int j = 0; j < i; j++)
				fwear2[j] = fwear1[j];
			return fwear2;
		}
		return null;
	}

}

class Footwear2 {
	private int footwearId;
	private String footwearName;
	private String footwearType;
	private int price;

	public int getFootwearId() {
		return footwearId;
	}

	public void setFootwearId(int footwearId) {
		this.footwearId = footwearId;
	}

	public String getFootwearName() {
		return footwearName;
	}

	public void setFootwearName(String footwearName) {
		this.footwearName = footwearName;
	}

	public String getFootwearType() {
		return footwearType;
	}

	public void setFootwearType(String footwearType) {
		this.footwearType = footwearType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Footwear2(int footwearId, String footwearName, String footwearType, int price) {
		super();
		this.footwearId = footwearId;
		this.footwearName = footwearName;
		this.footwearType = footwearType;
		this.price = price;
	}

}