package Encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(23);
		System.out.println(l1.getPrice());
	}

	public void doWork() {
		System.out.println("Working working");
	}
}

class Laptop {
	private int ram;
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
}
