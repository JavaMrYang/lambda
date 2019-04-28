package com.refaclt.practice;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/24/024 11:42
 * @Version 1.0
 **/
public class Base64Test {
    /**
     * BASE64解密
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static void main(String[] args) throws Exception {
        String pwd="123456";
        String data= Base64Test.encryptBASE64(pwd.getBytes());
        System.out.println(data);
        byte[] bytes64=Base64Test.decryptBASE64(data);
        System.out.println(new String(bytes64));

        System.out.println(10>>>4);
        System.out.println(1<<3);
    }
}
