package Babbar;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[4];
		String search;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < medicine.length; i++) {
			String medicineName = sc.nextLine();
			String batchNo = sc.nextLine();
			String disease = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			medicine[i] = new Medicine(medicineName, batchNo, disease, price);

		}

		search = sc.nextLine();
		Integer[] price = medicinePriceForGivenDisease(medicine, search);

		for (int i = 0; i < price.length; i++) {
			System.out.println(price[i]);
		}
	}

	public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine, String disease) {
//method logic
//code to find price, sort and return the sorted array.
		Integer[] a = new Integer[4];
		int i = 0;
		for (Medicine m : medicine) {
			if (disease.toLowerCase().equals((m.disease).toLowerCase()))
				a[i++] = m.price;
		}
		Integer b[] = new Integer[i];
		for (int j = 0; j < i; j++)
			b[j] = a[j];
		Arrays.sort(b);
		return b;
	}
}

class Medicine {
	String medicineName;
	String batchNo;
	String disease;
	int price;

	public Medicine(String medicineName, String batchNo, String disease, int price) {
		this.medicineName = medicineName;
		this.batchNo = batchNo;
		this.disease = disease;
		this.price = price;
	}
}
