package com.baifendian.taree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) throws Exception {
		String sqlStr = "insert into crawl_weibo_user(cid,user,name,pwd,ua,ip,status,level,lastload,createtime) values('sina','userT','nameT','pwdT','uaT','ipT',3,3,'2015-04-13 17:59:19','2015-04-13 17:59:19');";
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File("F:\\baifendian\\Ruining_He\\ua_list.txt"))));
		
		String line = "";
		ArrayList<String> listUa = new ArrayList<String>();

		while ((line = br.readLine()) != null) {
			listUa.add(line);
		}

		BufferedReader br2 = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File("F:\\baifendian\\Gang_BigBrother\\1000微博账号.txt")),"gbk"));
		String line2 = "";
		String sql="";
		StringBuffer sb=new StringBuffer();
		while ((line2 = br2.readLine()) != null) {
			String userInfo[] = line2.split("----");
			System.out.println(line2);
			sql = sqlStr.replace("userT", userInfo[0]);
			sql = sql.replace("nameT", userInfo[2]);
			sql = sql.replace("pwdT", userInfo[1]);
			sql = sql.replace("uaT", listUa.get((int) (Math.random() * 23)));
			sql = sql.replace("ipT", "");
            sb.append(sql+"\n");
		}
		FileOperateUtils.writeFile(sb.toString(), "F://sql.txt");
        sb=null;
        sb=new StringBuffer();
	}
}
