import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class t4_8 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "e256ddw348e6";
		Pattern p = Pattern.compile("\\d{1,}");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
 
}

