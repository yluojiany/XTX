import java.util.Calendar;
import java.util.Scanner;
 
public class t5 {
 
	public static void main(String[] args) {
		// 输出指定年月的月历，年月从键盘输入。每星期一行，从星期日开始，到星期六结束。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = scanner.nextInt();
		
		System.out.println("请输入月：");
		int month = scanner.nextInt();
		
		// 获取该行代码执行的时间 日历对象
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);// 修改 年月日
		
		// 获取1日在这个周的第几天
		int week = c.get(Calendar.DAY_OF_WEEK);
		int max = c.getActualMaximum(Calendar.DATE);// 得到当月的总天数
		System.out.println("这月总共有：" + max + "天");
 
		System.out.println(year + "年" + month + "月的日历为：");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		// 打印1日之前的空格
		String empty = " ";
		for (int j = 1; j < week; j++) {
			System.out.print(empty);
			System.out.print("\t");
		}
		// 打印日历
		int tag = week;
		for (int i = 1; i <= max; i++) {
			System.out.print(i);
			System.out.print("\t");
			// 换行
			if (tag % 7 == 0) {
				System.out.println();
			}
			tag++;
		}
	}
 
}
