package Babbar;

public class alltypes {
	int i = 10;
	{
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}
	int tt;

	alltypes(int tt) {
		this.tt = tt;
	}

	{
		System.out.println(4);
	}

	static void display() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println(224);
		}
		alltypes s1 = new alltypes(6);
		alltypes s[] = new alltypes[] { s1 };
		s[1] = s1;
		{
			System.out.println(22);
		}
	}

}
