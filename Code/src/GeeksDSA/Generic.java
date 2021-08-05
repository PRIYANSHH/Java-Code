package GeeksDSA;

import java.util.*;

public class Generic {
	private int d = 5;

	public int dddata(int... value) {
		return (d + 2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Generic temp = new Generic();
		ArrayList list = new ArrayList();
		list.add('a');
		list.add('b');
		list.ensureCapacity(3);
		list.trimToSize();
		System.out.println(list.size());
		boolean m = Integer.valueOf(1).equals(Long.valueOf(1));
		System.out.println(Integer.valueOf(1));
		System.out.println(Long.valueOf(1));
		for (String s : args) {
			System.out.println();
		}
		System.out.println(temp.dddata(7, 8, 12));
	}
}