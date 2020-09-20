package com.springboot;


import java.util.ArrayList;
import java.util.Date;
import java.io.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args) {
       /* String ab="";
        Date dat1=new Date();
        long time1 = dat1.getTime();
        for(int i=0;i<65537;i++){
        ab+=i;
           // System.out.println(ab);
       // System.out.println(i);
        }
        System.out.println(ab);
        Date dat2=new Date();
        long time2 = dat2.getTime();
        System.out.println("执行耗时为："+(time2-time1));
        StringBuffer sn=new StringBuffer();
        for(int i=0;i<65537;i++){
          sn.append(i);

            // System.out.println(i);
        }
        System.out.println(sn.toString());
        Date dat3=new Date();
        long time3 = dat3.getTime();
        System.out.println("执行耗时为："+(time3-time2));

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<65537;i++){
            sb.append(i);

            // System.out.println(i);
        }
        System.out.println(sb.toString());
        Date dat4=new Date();
        long time4 = dat4.getTime();
        System.out.println("执行耗时为："+(time4-time3));*/


        String fileName = "C:\\kuka.txt";
        try {
            //使用这个构造函数时，如果存在kuka.txt文件，
            //则先把这个文件给删除掉，然后创建新的kuka.txt
            FileOutputStream fos=new FileOutputStream(fileName);
            OutputStreamWriter bos=new OutputStreamWriter(fos,"GBK");
            String content="我是缓冲输出流测试数据！";
            String b=new String(content.getBytes());
            b=b+"\n\r";
            bos.write(b);
            bos.flush();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
