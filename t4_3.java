
 
public class t4_3  {  
    public static String reduceString(final String str) {  
        StringBuffer result = new StringBuffer();  
        final int count = str.length();  
        char c1 = str.charAt(0);  
        int sum = 1;  
        for (int i = 1; i < count; i++)  {  
            char c2 = str.charAt(i);  
            if (c1 == c2)  
            {  
                sum++;  
                continue;  
            }  
            result.append(c1).append(sum);  
            c1 = c2;  
            sum = 1;  
        }  
        result.append(sum).append(c1);  
        return result.toString();  
    }  
    public static void main(String[] args)  {  
        System.out.println(reduceString("aaabbbccccd"));  
    }  
}