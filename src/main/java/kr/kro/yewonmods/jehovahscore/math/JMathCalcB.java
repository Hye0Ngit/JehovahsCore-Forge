package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcB {
	
	public static byte add(byte a, byte b) {
		return (byte) (a + b);
	}
	
	public static byte subtract(byte a, byte b) {
		return (byte) (a - b);
	}
	
	public static byte multiply(byte a, byte b) {
		return (byte) (a * b);
	}
	
	public static byte divide(byte a, byte b) {
		if (b == 0) {
			return 0;
		} else {
			return (byte) (a / b);
		}
	}
	
	public static byte power(byte base, byte exponent) {
	    byte wb = base;
		for (byte b = 1; b <= exponent; b++) {
			base = (byte) (base * wb);
		}
		return (byte) (base / wb);
	}
	
	public static byte sqrt(byte a) {
		return (byte) Math.sqrt(a);
	}
	
	public static byte abs(byte a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return (byte) -a;
		}
	}
	
	public static byte sin(byte a) {
		return (byte) Math.sin(Math.toRadians(a));
	}
	
	public static byte cos(byte a) {
		return (byte) Math.cos(Math.toRadians(a));
	}
	
	public static byte tan(byte a) {
		return (byte) Math.tan(Math.toRadians(a));
	}
	
	public static byte log(byte a, byte type) {
		if (type == 0) {
			return (byte) Math.log(a);
		} else if (type == 1) {
			return (byte) Math.log10(a);
		} else if (type == 2) {
			return (byte) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static byte base(byte a, byte base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Byte.parseByte(ans);
	}
}
