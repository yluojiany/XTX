package org.aeroplane;
/**
 * 旅游接口
 * @author 
 *
 */

public interface PassengerInterface {
      /**
       * 获取旅客姓名		
       * @return 返回姓名
       */
	public String getName();
	  /**
	   * 获取预定号
	   * @return 返回预定号
	   */
	
	public int getBookingNumber();
	  /**
	   * 获取座位排数
	   * @return 返回排数
	   */
	
	public int getRow();
	/**
	 * 获取座位号
	 * @return 返回座位号
	 */
	
	public int getSeatPosition();
	
}
