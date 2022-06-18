package kr.kro.yewonmods.jehovahscore.log;

public class JLogger {
	
	public static void log(String str, boolean type) {
		if (type) {
			System.out.print(str);
		} else {
			System.out.println(str);
		}
	}
}
