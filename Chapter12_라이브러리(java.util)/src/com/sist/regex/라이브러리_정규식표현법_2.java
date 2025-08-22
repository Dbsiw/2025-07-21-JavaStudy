package com.sist.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class 라이브러리_정규식표현법_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="내 전화번호는 010-1234-5678 이고"+"회사전화는 02-343-5678입니다.";
		String regex="\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		
		while(m.find())
		{
			System.out.println("전화번호:"+m.group(1));
		}
	}

}
