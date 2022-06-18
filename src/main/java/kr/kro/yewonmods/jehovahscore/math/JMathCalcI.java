package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcI {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		if (b == 0) {
			return 0;
		} else {
			return a / b;
		}
	}
	
	public static int power(int base, int exponent) {
	    int wb = base;
		for (int i = 1; i <= exponent; i++) {
			base = base * wb;
		}
		return base / wb;
	}
	
	public static int sqrt(int a) {
		return (int) Math.sqrt(a);
	}
	
	public static int abs(int a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return -a;
		}
	}
	
	public static int sin(int a) {
		return (int) Math.sin(Math.toRadians(a));
	}
	
	public static int cos(int a) {
		return (int) Math.cos(Math.toRadians(a));
	}
	
	public static int tan(int a) {
		return (int) Math.tan(Math.toRadians(a));
	}
	
	public static int log(int a, int type) {
		if (type == 0) {
			return (int) Math.log(a);
		} else if (type == 1) {
			return (int) Math.log10(a);
		} else if (type == 2) {
			return (int) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static int base(int a, int base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Integer.parseInt(ans);
	}
}
