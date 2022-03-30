package Babbar;

import java.util.*;

public class billing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bill bill[] = new Bill[n];
		for (int i = 0; i < n; i++) {
			int billNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String typeOfConnection = sc.nextLine();
			double billAmount = sc.nextDouble();
			boolean status = sc.nextBoolean();
			sc.nextLine();
			bill[i] = new Bill(billNo, name, typeOfConnection, billAmount, status);
		}
		Bill b1[] = findBillWithMaxBillAmountBasedOnStatus(bill, sc.nextBoolean());
		sc.nextLine();
		int count = getCountWithTypeOfConnection(bill, sc.nextLine());
		if (b1 == null)
			System.out.println("There are no bill with the given status");
		else {
			for (Bill bb : b1)
				System.out.println(bb.getBillNo() + "#" + bb.getName());
		}
		if (count == 0)
			System.out.println("There are no bills with given type of connection");
		else
			System.out.println(count);
	}

	public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill bill[], boolean status) {
		double max = -1.0;
		Bill ob[] = new Bill[bill.length];
		for (Bill b : bill) {
			if (b.getBillAmount() > max && b.isStatus() == status)
				max = b.getBillAmount();
		}
		int i = 0;
		for (Bill b : bill) {
			if (b.getBillAmount() == max && b.isStatus() == status)
				ob[i++] = b;
		}

		Bill ob1[] = new Bill[i];
		int n=i;
		for (int j = 0; j < i; j++)
			ob1[j] = ob[j];
	/*	Arrays.sort(ob1, new Comparator<Bill>() {
			@Override
			public int compare(Bill first, Bill second) {
				if (first.getBillNo() < second.getBillNo())
					return -1;
				if (first.getBillNo() > second.getBillNo())
					return 1;
				return 0;
			}
		});*/
		int j;
		Bill temp;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;j++) {
				if(ob1[j].getBillNo()< ob1[j+1].getBillNo()) {
					temp=ob1[j];
					ob1[j]=ob1[j+1];
					ob1[j+1]=temp;
				}
			}
		}
		if (i == 0)
			return null;
		else
			return ob1;
	}

	public static int getCountWithTypeOfConnection(Bill bill[], String typeOfConnection) {
		int count = 0;
		for (Bill b : bill) {
			if (b.getTypeOfConnection().equalsIgnoreCase(typeOfConnection.trim())) {
				count++;
			}
		}
		return count;
	}
}

class Bill {
	private int billNo;
	private String name;
	private String typeOfConnection;
	private double billAmount;
	private boolean status;

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfConnection() {
		return typeOfConnection;
	}

	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
		super();
		this.billNo = billNo;
		this.name = name;
		this.typeOfConnection = typeOfConnection;
		this.billAmount = billAmount;
		this.status = status;
	}

}
            
/*
4
334
Aman Mittal
Prepaid
1425.75
false
222
Rekha Kumar
Prepaid
1425.75
false
3337
Samyra Gupta
Prepaid
1425.75
false
444
Mohit Saxena
Postpaid
1425.75
false
false
Prepaid 
*/