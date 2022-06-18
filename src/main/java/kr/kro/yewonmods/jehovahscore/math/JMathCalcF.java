package kr.kro.yewonmods.jehovahscore.math;

public class JMathCalcF {
	
	public static float add(float a, float b) {
		return (float) a + b;
	}
	
	public static float subtract(float a, float b) {
		return (float) a - b;
	}
	
	public static float multiply(float a, float b) {
		return (float) a * b;
	}
	
	public static float divide(float a, float b) {
		if (b == 0) {
			return 0;
		} else {
			return (float) a / b;
		}
	}
	
	public static float power(float base, float exponent) {
		float wb = base;
		for (float f = 1; f <= exponent; f++) {
			base = base * wb;
		}
		return (float) base / wb;
	}
	
	public static float sqrt(float a) {
		return (float) Math.sqrt(a);
	}
	
	public static float abs(float a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return a;
		} else {
			return (float) -a;
		}
	}
	
	public static float sin(float a) {
		return (float) Math.sin(Math.toRadians(a));
	}
	
	public static float cos(float a) {
		return (float) Math.cos(Math.toRadians(a));
	}
	
	public static float tan(float a) {
		return (float) Math.tan(Math.toRadians(a));
	}
	
	public static float log(float a, float type) {
		if (type == 0) {
			return (float) Math.log(a);
		} else if (type == 1) {
			return (float) Math.log10(a);
		} else if (type == 2) {
			return (float) Math.log1p(a);
		} else {
			return 0;
		}
	}
	
	public static float base(float a, float base) {
		String ans = "";
		while (a > 0) {
			ans = (a % base) + ans;
			a /= base;
		}
		return Float.parseFloat(ans);
	}
}
