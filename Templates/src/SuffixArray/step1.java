package SuffixArray;
import java.util.*;
public class step1 {
	public static void main(String[] args) {
		String str = "cdadefg";
		char[] chr = str.toCharArray();
//		System.out.println(str.substring(3,7));
		Arrays.sort(chr);
		System.out.println(chr);
	}
}
