package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcD {
	
	public static double add(double a, double b) {
		return (double) a + b;
	}
	
	public static double subtract(double a, double b) {
		return (double) a - b;
	}
	
	public static double multiply(double a, double b) {
		return (double) a * b;
	}
	
	public static double divide(double a, double b) {
		if (b == 0) {
			return 0;
		} else {
			return (double) a / b;
		}
	}
	
	public static double power(double base, double exponent) {
		double wb = base;
		for (double d = 1; d <= exponent; d++) {
			base = base * wb;
		}
		return (double) base / wb;
	}
	
	public static double sqrt(double a) {
		return (double) Math.sqrt(a);
	}
	
	public static double abs(double a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return (double) -a;
		}
	}
	
	public static double sin(double a) {
		return (double) Math.sin(Math.toRadians(a));
	}
	
	public static double cos(double a) {
		return (double) Math.cos(Math.toRadians(a));
	}
	
	public static double tan(double a) {
		return (double) Math.tan(Math.toRadians(a));
	}
	
	public static double log(double a, double type) {
		if (type == 0) {
			return (double) Math.log(a);
		} else if (type == 1) {
			return (double) Math.log10(a);
		} else if (type == 2) {
			return (double) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static double base(double a, double base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Double.parseDouble(ans);
	}
}
