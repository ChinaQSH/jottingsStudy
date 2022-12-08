package com.qsh.study.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title: DateUtil.java 
 * @Description: 日期工具类
 * @author yuzj    
 * @created 2017年6月14日 上午9:32:29
 */
public class DateUtil {

//	private Logger LOGGER = Logger.getLogger(DateUtil.class);

	/** 定义日期格式：yyyy-MM-dd HH:mm:ss */
	public static String FORMAT1 = "yyyy-MM-dd HH:mm:ss";
	/** 定义日期格式：yyyy-MM-dd HH:mm:ss.S */
	public static String FORMAT2 = "yyyy-MM-dd HH:mm:ss.S";
	/** 定义日期格式：yyyy-MM-dd */
	public static String FORMAT3 = "yyyy-MM-dd";
	/** 定义日期格式：yyyy-MM-dd HH:mm*/
	public static String FORMAT4 = "yyyy-MM-dd HH:mm";
	/** 定义日期格式：HH:mm:ss*/
	public static String FORMAT5 = "HH:mm:ss";
	/** 定义日期格式：HH:mm*/
	public static String FORMAT6 = "HH:mm";
	/** 定义日期格式：yyyyMMdd*/
	public static String FORMAT7 = "yyyyMMdd";
	/** 定义日期格式：yyyyMM*/
	public static String FORMAT8 = "yyyy-MM";
	public static String FORMAT9 = "yyyyMM";
	/** 定义日期格式：HH:mm:ss*/
	public static String FORMAT_CN_YMD = "yyyy年MM月dd日";
	/** 定义日期格式：yyyyMMddHHmmss*/
	public static String FORMAT_YMDHMS = "yyyyMMddHHmmss";
	/** 定义日期格式：yyyyMMddHHmmssSSS*/
	public static String FORMAT_YMDHMSSSS = "yyyyMMddHHmmssSSS";

	/** 一天的毫秒数 24*60*60*1000 */
	public static long ONE_DAY_TIME = 86400000L;
	public static long ONE_HOUR_TIME = 3600L;
	public static long ONE_MINUTE_TIME = 60L;

	/**
	 * @Description: 获取字符串格式的时间，时间格式自定义
	 * @author yuzj  
	 * @created 2017年6月14日 上午9:35:30
	 * @return
	 */
	public static String getDateByFormat(Date date, String format){
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * @Description: 获取当前时间
	 * @author yuzj  
	 * @created 2017年7月6日 下午4:40:42
	 * @return
	 */
	public static String getNowTime(){
		return getDateByFormat(new Date(), FORMAT1);
	}
	
	/**
	 * @Description: 获取当前日期
	 * @author yuzj  
	 * @created 2017年7月6日 下午4:40:55
	 * @return
	 */
	public static String getNowDate(){
        return getDateByFormat(new Date(), FORMAT3);
	}
	
	/**
	 * @Description: 获取当前时间戳
	 * @author yuzj  
	 * @created 2017年7月6日 下午3:34:15
	 * @return
	 */
	public static Long getCurrentTimeStamp(){
		return new Date().getTime();
	}
	
	/**
	 * @Description: 将字符串类型的日期，转为日期，日期格式自定义
	 * @author yuzj  
	 * @created 2017年7月6日 下午3:36:15
	 * @param format
	 * @param date
	 * @return
	 */
	public static long formatStrDateToLong(String format, String date){
		long longdate = 0L;
		try {
			longdate = new SimpleDateFormat(format).parse(date).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return longdate;
	}

	/**
	 * @Description: 将字符串类型的日期，转为日期，日期格式自定义
	 * @author yuzj
	 * @created 2017年7月6日 下午3:36:15
	 * @param format
	 * @param dateStr
	 * @return
	 */
	public static Date formatStrToDate(String format, String dateStr){
		try {
			return new SimpleDateFormat(format).parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @Description: 将时间戳转为字符串格式的日期，日期格式自定义
	 * @author yuzj  
	 * @created 2017年7月6日 下午3:38:06
	 * @param format
	 * @param timeStamp
	 * @return
	 */
	public static String formatTimeStampToDateStr(String format, Long timeStamp){
		String dateTime = null;
		if(timeStamp == null){
			return dateTime;
		}
		if(timeStamp == 0L){
			dateTime = "";
			return dateTime;
		}
		Date date = new Date(timeStamp);
		dateTime = new SimpleDateFormat(format).format(date);
		return dateTime;
	}
	
	/**
	 * 获取前月的前一个月第一天
	 * @return
	 */
	public static Long getStartOfMonth(){
		Calendar cale = Calendar.getInstance();
        // 获取前月的前一个月第一天
        cale = Calendar.getInstance();
//        cale.add(Calendar.MONTH, -1);
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        cale.set(Calendar.HOUR_OF_DAY, 0);
        cale.set(Calendar.MINUTE, 0);
        cale.set(Calendar.SECOND, 0);
        cale.set(Calendar.MILLISECOND, 0);
        Date firstday=cale.getTime();
		return firstday.getTime();
	}
	
	/**
	 * 获取当前月的前一个月最后一天
	 * @return
	 */
	public static Long getEndOfMonth(){
		Calendar cale = Calendar.getInstance();
		// 获取当前月的前一个月最后一天
//		cale.add(Calendar.MONTH, 0);
		cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        cale.set(Calendar.HOUR_OF_DAY, 23);
        cale.set(Calendar.MINUTE, 59);
        cale.set(Calendar.SECOND, 59);
        cale.set(Calendar.MILLISECOND, 999);
        Date lastday=cale.getTime();
		return lastday.getTime();
	}
	
	/**
	 * @Description: 计算相差天数，零头小时抹去
	 * @author Jolie  
	 * @created 2020-9-3 13:36:13
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static Integer calculateChaDays(Long startTime, Long endTime) {
		if(startTime == null || endTime == null) {
			return null;
		}
		
		long htmlRemainDays = endTime - startTime;
		if(htmlRemainDays > 0) {
			htmlRemainDays = (int) (htmlRemainDays / DateUtil.ONE_DAY_TIME);
		}
		return (int) htmlRemainDays;
	}

	/**
	 * @Description: 计算相差天数，零头小时补一天
	 * @author Jolie
	 * @created 2020-9-3 13:36:13
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static Integer calculateChaDaysCeil(Long startTime, Long endTime) {
		if(startTime == null || endTime == null) {
			return null;
		}

		long htmlRemainDays = endTime - startTime;
		if(htmlRemainDays > 0) {
			htmlRemainDays = (int) (htmlRemainDays / DateUtil.ONE_DAY_TIME);

			if(htmlRemainDays % DateUtil.ONE_DAY_TIME > 0) {
				htmlRemainDays++;
			}
		}
		return (int) htmlRemainDays;
	}
	
	public static void main(String[] args) {
		long startTime = formatStrDateToLong(FORMAT1, "2020-09-10 16:30:00");
		long endTime = formatStrDateToLong(FORMAT1, "2021-09-10 16:20:00");
		
		System.out.println(endTime - startTime);
		
		long days = calculateChaDays(startTime, endTime);
		System.out.println(days);
	}
}
