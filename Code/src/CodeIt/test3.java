package CodeIt;

import java.io.*;

/*class test2
{
public String stars(int count) {
// Create a string builder with capacity 'count'
StringBuilder sb = new StringBuilder(count);
for (int i = 0; i < count; i++) {
sb.append("*");
}
return sb.toString();
}
}
class test3 extends test2
{
    void pp()
    {
        System.out.println("\'");
    }
}*/
class test3 {
	public static void main(String args[]) {
		int q = 12_11;
		int a = 0100;
		int b = 0x1B;
		float c = 40f;
		double d = 40d;
		long w = 10l;
		int e = 0b10101;
		System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + w + "\t" + q);
		char heart = '\u2764';
		// Both give same result
		System.out.println(Character.toString(heart));
		System.out.println(heart);
		for (int i = 0; i < 26; i++) {
			char letter = (char) ('a' + i);
			System.out.println(letter);
		}
		double se = 1.2e-3;
		System.out.println(se);
	}
}