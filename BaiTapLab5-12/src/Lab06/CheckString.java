package Lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
	public static void main(String[] args) {
		System.out.println("Video 40.2");
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
		Matcher matcher = pattern.matcher("huykhang@gmail.com");
		System.out.println("Input string matches regex - " + matcher.matches());
	}
}
