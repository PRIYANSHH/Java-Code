package Babbar;

public class fde {
	{
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}

	fde() {
		System.out.println(3);
	}

	public static void main(String[] args) {
		{
			System.out.println(4);
		}
		new fde();
		{
			System.out.println(4);
		}
	}
}