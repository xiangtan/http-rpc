package com.lyc.rpc.serialize;

/**
 * 将信息封装成为报文
 * Created on 2015/8/17.
 */
public interface Formater
{
	/**
	 * @param clazz 请求的接口
	 * @param method 请求的方法
	 * @param param 请求的参数
	 * @return
	 */
	String reqFormat(Class clazz, String method, Object param);

	/**
	 * @param param 响应的结果
	 * @return
	 */
	String rsbFormat(Object param);
}
