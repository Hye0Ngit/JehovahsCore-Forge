package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcS {
	
	public static short add(short a, short b) {
		return (short) (a + b);
	}
	
	public static short subtract(short a, short b) {
		return (short) (a - b);
	}
	
	public static short multiply(short a, short b) {
		return (short) (a * b);
	}
	
	public static short divide(short a, short b) {
		if (b == 0) {
			return 0;
		} else {
			return (short) (a / b);
		}
	}
	
	public static short power(short base, short exponent) {
	    short wb = base;
		for (short s = 1; s <= exponent; s++) {
			base = (short) (base * wb);
		}
		return (short) (base / wb);
	}
	
	public static short sqrt(short a) {
		return (short) Math.sqrt(a);
	}
	
	public static short abs(short a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return (short) -a;
		}
	}
	
	public static short sin(short a) {
		return (short) Math.sin(Math.toRadians(a));
	}
	
	public static short cos(short a) {
		return (short) Math.cos(Math.toRadians(a));
	}
	
	public static short tan(short a) {
		return (short) Math.tan(Math.toRadians(a));
	}
	
	public static short log(short a, short type) {
		if (type == 0) {
			return (short) Math.log(a);
		} else if (type == 1) {
			return (short) Math.log10(a);
		} else if (type == 2) {
			return (short) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static short base(short a, short base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Short.parseShort(ans);
	}
}
