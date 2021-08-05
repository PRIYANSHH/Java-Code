package CodeIt;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Number_Currency_format {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale indiaLocale = new Locale("en", "IN");

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		NumberFormat japan = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat germany = NumberFormat.getCurrencyInstance(Locale.GERMANY);

		System.out.println("US: " + us.format(payment));
		System.out.println("India: " + india.format(payment));
		System.out.println("China: " + china.format(payment));
		System.out.println("France: " + france.format(payment));
		System.out.println("Japan: " + japan.format(payment));
		System.out.println("Germany: " + germany.format(payment));

	}
}
