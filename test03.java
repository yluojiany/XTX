
public class test03 {
	//将基本类型转换为字符串
 int c=10;
 String str1 = Integer.toString(c);// 方法一
 String str2 = String.valueOf(c);// 方法二
 String str3 = c + "";// 方法三

 //将字符串转换为基本类型
 String str = "8";
 int d = Integer.parseInt(str);// 方法一
 int e = Integer.valueOf(str);// 方法二
 

}
