package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcL {
	
	public static long add(long a, long b) {
		return (long) a + b;
	}
	
	public static long subtract(long a, long b) {
		return (long) a - b;
	}
	
	public static long multiply(long a, long b) {
		return (long) a * b;
	}
	
	public static long divide(long a, long b) {
		if (b == 0) {
			return 0;
		} else {
			return (long) a / b;
		}
	}
	
	public static long power(long base, long exponent) {
	    long wb = base;
		for (long l = 1; l <= exponent; l++) {
			base = base * wb;
		}
		return (long) base / wb;
	}
	
	public static long sqrt(long a) {
		return (long) Math.sqrt(a);
	}
	
	public static long abs(long a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return (long) -a;
		}
	}
	
	public static long sin(long a) {
		return (long) Math.sin(Math.toRadians(a));
	}
	
	public static long cos(long a) {
		return (long) Math.cos(Math.toRadians(a));
	}
	
	public static long tan(long a) {
		return (long) Math.tan(Math.toRadians(a));
	}
	
	public static long log(long a, long type) {
		if (type == 0) {
			return (long) Math.log(a);
		} else if (type == 1) {
			return (long) Math.log10(a);
		} else if (type == 2) {
			return (long) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static long base(long a, long base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Long.parseLong(ans);
	}
}
