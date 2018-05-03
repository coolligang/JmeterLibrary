package com.cigit.cool;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;

/**
 * Jmeter 常用方法
 * @author cigit
 */
public class JmeterLibrary
{
	/**
	 * 将str进行md5加密并返回加密字符串
	 * @param str
	 * @return
	 */
	public String getMD5(String str)
	{
		try
		{
			// 生成一个MD5加密计算摘要
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 计算md5函数
			md.update(str.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1, md.digest()).toString(16);
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取当前时间戳
	 * @return
	 */
	public long getTimestamp()
	{
		return System.currentTimeMillis();
	}

	/**
	 * 将二进制数据编码转为base64字符串
	 * 需要commons-codec-1.9.jar
	 * @param bytes
	 * @return
	 */
	public static byte[] decode(final byte[] bytes)
	{
		return Base64.decodeBase64(bytes);
	}

	/**
	 * 二进制数据编码为BASE64字符串
	 * 需要commons-codec-1.9.jar
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	public static String encode(final byte[] bytes)
	{
		return new String(Base64.encodeBase64(bytes));
	}

	public static void main(String[] args)
	{
		
	}

}
