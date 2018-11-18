package com.icy.portal.jedis;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CookieUtils工具类
 * 
 * @author 蔡龙
 * @version 2013-01-15
 */
public class CookieUtils {
	/**
	 * 设置 Cookie(生成时间为1天)
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param value
	 *            值
	 */
	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value) {
		setCookie(request, response, key, value, 60 * 60 * 24);
	}

	/**
	 * 设置 Cookie(生成时间为1天)
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param path
	 *            指定路径,一般可指定/,若为null则写入当前页面的URL中取出当前路径
	 */
	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value,
			String path) {
		setCookie(request, response, key, value, path, 60 * 60 * 24);
	}

	/**
	 * 设置 Cookie
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param maxAge
	 *            生存时间(单位秒)-1代表关闭浏览器就失效
	 */
	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value,
			int maxAge) {
		setCookie(request, response, key, value, "/", maxAge);
	}

	/**
	 * 设置 Cookie
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param path
	 *            指定路径,一般可指定/,若为null则写入当前页面的URL中取出当前路径
	 * @param maxAge
	 *            生存时间(单位秒)
	 */
	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value,
			String path, int maxAge) {
		Cookie cookie = new Cookie(key, null);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		cookie.setValue(value);
		response.addCookie(cookie);
	}

	/**
	 * 设置 Cookie (只能通过http访问,javaScript无法访问)
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param path
	 *            指定路径,一般可指定/,若为null则写入当前页面的URL中取出当前路径
	 * @param maxAge
	 *            生存时间(单位秒)
	 */
	public static void setCookieHttpOnly(HttpServletRequest request, HttpServletResponse response, String key,
			String value, String path, int maxAge) {
		Date date = new Date();
		long ms = date.getTime() + (maxAge * 1000);
		date = new Date(ms);
		response.addHeader("Set-Cookie",
				key + "=" + (value == null ? "" : value) + ";Path=" + path + "; HttpOnly;Expires=" + date.toString());
	}

	/**
	 * @param request
	 *            请求对象 获得指定Cookie的值
	 * @param key
	 *            键
	 * @return 值
	 */
	public static String getCookie(HttpServletRequest request, String key) {
		return getCookie(request, null, key, false);
	}

	/**
	 * 获得指定Cookie的值,并删除。
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @return 值
	 */
	public static String getCookie(HttpServletRequest request, HttpServletResponse response, String key) {
		return getCookie(request, response, key, true);
	}

	/**
	 * 获得指定Cookie的值
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param key
	 *            键
	 * @param isRemove
	 *            是否移除
	 * @return 值
	 */
	public static String getCookie(HttpServletRequest request, HttpServletResponse response, String key,
			boolean isRemove) {
		String value = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(key)) {
					try {
						value = URLDecoder.decode(cookie.getValue(), "utf-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					if (isRemove) {
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
				}
			}
		}
		return value;
	}
}