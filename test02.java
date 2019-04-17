package stringbuffer;

public class test02 {
	public static void main(String[] args) {
		 
	     int[] arr = {10,20,30,40,55,66,77,88,99};
	     System.out.println(array2String(arr));
	   }
	 
	   public static String array2String(int[] arr) {
	 
	     StringBuffer sb = new StringBuffer();
	     // 1先把左中括号给拼接到缓冲区
	     sb.append("[");
	     // 2遍历数组
	     for(int i=0; i<= arr.length-1; i++){
	        if(i == arr.length-1) {
	          sb = sb.append(arr[i] + "]"); //注意最后一个元素拼接处理方式
	        }else {
	          sb = sb.append(arr[i] + ",");
	        }
	     }
	     return sb.toString();
	   }
	

}
