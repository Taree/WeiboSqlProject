package com.baifendian.taree;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

public class Test {
   public static void main(String[] args) {
//	    System.out.println(System.currentTimeMillis()); 
//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    Date now = new Date();
//	    String abcValue = sdf.format(now);
//	    System.out.println(abcValue);
	   for(int i=0;i<10000;i++){
	         System.out.println((int)(Math.random()*23));
	   }
}
}
