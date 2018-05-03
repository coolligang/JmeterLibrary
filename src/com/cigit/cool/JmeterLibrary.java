package com.cigit.cool;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;

/**
 * Jmeter ���÷���
 * @author cigit
 */
public class JmeterLibrary
{
	/**
	 * ��str����md5���ܲ����ؼ����ַ���
	 * @param str
	 * @return
	 */
	public String getMD5(String str)
	{
		try
		{
			// ����һ��MD5���ܼ���ժҪ
			MessageDigest md = MessageDigest.getInstance("MD5");
			// ����md5����
			md.update(str.getBytes());
			// digest()���ȷ������md5 hashֵ������ֵΪ8Ϊ�ַ�������Ϊmd5 hashֵ��16λ��hexֵ��ʵ���Ͼ���8λ���ַ�
			// BigInteger������8λ���ַ���ת����16λhexֵ�����ַ�������ʾ���õ��ַ�����ʽ��hashֵ
			return new BigInteger(1, md.digest()).toString(16);
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * ��ȡ��ǰʱ���
	 * @return
	 */
	public long getTimestamp()
	{
		return System.currentTimeMillis();
	}

	/**
	 * �����������ݱ���תΪbase64�ַ���
	 * ��Ҫcommons-codec-1.9.jar
	 * @param bytes
	 * @return
	 */
	public static byte[] decode(final byte[] bytes)
	{
		return Base64.decodeBase64(bytes);
	}

	/**
	 * ���������ݱ���ΪBASE64�ַ���
	 * ��Ҫcommons-codec-1.9.jar
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
