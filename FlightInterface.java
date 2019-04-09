package org.aeroplane;
/**
 * 航班接口
 * @author Administrator
 *
 */

public interface FlightInterface {
/**
 * 预定航班座位
 * @param names 存放旅客姓名的字符串数组
 * @return 返回存放预定号的数组
 */
	public int[] reserve(String[]names);
/**
 * 	取消预定座位
 * @param bookingNumber 该参数指定要取消的预定号 
 * @return 返回该座位的预定状态
 */
	public boolean cancel(int bookingNumber);
/**
 * 获取预定了座位的旅客列表	
 * @return 返回存放旅客类对象的数组
 */
	
	public Passenger[]getPassengerList();
	
}
