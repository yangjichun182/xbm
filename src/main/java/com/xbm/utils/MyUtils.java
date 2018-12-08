package com.xbm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtils {

	/**
	 * 两个数+等于一个数的和，获取这连个相加数的可能值
	 */
	public static void get_Two_Num(int n) {
		int b = 0, c = 0;
		for (int i = 1; i <= 4; i++) {
			b = i;
			for (int j = n; j > 0; j--) {
				c = j;
				if (b + c == n) {
					System.out.println("a=" + b + "+" + c);
				}
			}
		}
	}
	/**
	 * 斐波拉契数列 ：1,1,2,3,5,8,13,21....
	 * @param n
	 * @return
	 */
	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);  //递归
		}
	}

	/**
	 * 
	 * @param a
	 *            需要进行移动的源数据
	 * @param b
	 *            向左移动的位数
	 * @return 返回向左移动后的数据
	 */
	public static int get_left_bitmove(int a, int b) {
		return a << b;
	}

	/**
	 * 功能：获取当前的时间
	 */
	public static String getCurrentDate() {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		return date.toLocaleString();
	}

	/**
	 * 功能：返回2018-10-23 09:48:01 这样的格式的日期
	 * 
	 * @return
	 */
	public static String getFormatCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date);
		return formatDate;
	}
}
