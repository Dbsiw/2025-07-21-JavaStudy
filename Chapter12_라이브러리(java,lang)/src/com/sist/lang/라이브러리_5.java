package com.sist.lang;
/*
 * java.lang
 * 	=> 기본이 되는 클래스의 집합
 *  => import를 생략할 수 있다
 * 	1. object
 * 	   => 모든 클래스의 상위 클래스(사용자 정의, 라이브러리 클래스 => 상속을 내리는 클래스)
 * 	   => 데이터형중에 가장 큰 데이터형
 * 	   => 모든 데이터형을 받을 수 있다
 * 	   예) Object obj=new Object(); => 형변환
 * 		  obj=1
 * 		  obj='A'
 * 		  obj="HELLO"
 * 		  obj=true
 * 		  obj=10.0
 * 		  obj=10L
 * 		  obj=new A()
 * 		  ---------------------------
 * 		  클래스 객체 = new 클래스()
 * 		  ----			 -----
 * 		   |			   |	
 * 		   ---------------- 다른 경우도 있다
 * 		 객체가 접근 ==> 선언된 클래스가 가지고 있는 변수/메소드
 * 		 A a=new B()
 * 		 ---
 * 		  | 오버라이딩된 경우에만 B가 지고 있는 메소드에 접근
 * 		 class A
 * 		 {
 * 			int a,b;
 * 			public void aaa(){}
 * 			public void bbb(){}
 * 		 }
 * 		 class B
 * 		 {
 * 			int c,d;
 * 			public void ccc(){}
 * 			public void ddd(){}
 * 			public void aaa(){} => 오버라이딩
 * 		 }
 * 
 * 		 A a=new B();
 * 		--- a,b,aaa(),bbb();
 * 				----- B가 가지고 있는 메소드 호출
 * 		 |
 * 	  주요 메소드 (기능) => 오버라이딩 
 * 		= finalized() : 객체 소멸시에 자동 호출
 * 		  소멸자 함수 : 재정의 하지는 않는다
 * 		***= toString() : 객체를 문자열 변경
 * 		  => 오버라이딩이 가장 많다
 * 		  => 재정의 없이 호출 : 객체의 주소값 리턴
 * 		  => 오버라이딩 => 실제 객체의 변수값 출력
 * 		***=> clone() : 복제
 * 					 실제 가지고 있는 변수값을 포함 새로운 메모리에 저장
 * 					 => 스프링 : prototype
 * 						----- singleton
 * 		=> equals() => 많이 사용하지 않는다
 * 					=> 객체의 주소값 비교 => String에서는 문자열만 비교
 * 		=> hashCode() => 모든 객체는 hashCode()를 가지고 있다
 * 		 				 메모리 주소 기반으로 정수값으로 표현
 * 			=> 중복 제거 : Hashset : 검색이 느리다
 * 			   ------------------------------ 최적화 
 * 		
 * 	2. String
 * 	3. StringBuffer
 * 	4. System
 * 	5. Math
 * java.util
 * 	***1. Collection
 * 		= List
 * 		= Set
 * 		= Map
 *  ***2. StringTokenizer
 *  3. Scanner
 *  **4. Arrays
 *  ----------------------- 많이 사용되는 라이브러리
 *  java.text
 *   1. MessageFormat : SQL문장
 *   -------------------------
 *   2. SimpleDateFormat : 날짜
 *   3. DecimalFormat 
 *   ------------------------- 오라클
 *  java.io
 *  java.net
 *  java.sql
 *  --------------- 외부라이브러리 Jsoup / simple-json
 *  				mvnrepository.com
 *  --------------- J2SE => J2EE(웹)
 *  						-------
 *  단점 : 패키지가 변경 (웹)
 *  	  tomcat => 9 : javax 10~ : jakarta
 *  				--------- -------------
 *	
 */
// equals => 객체 비교 boolean equals(Object obj)
/*
 * 	1. 라이브러리
 * 	   메소드명 => 어떤 기능
 * 	   매개변수
 * 	   리턴값
 * 	   예외처리 여부
 * 	   ------------------ 원형
 */
import java.util.*;
public class 라이브러리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("코믹");
		list.add("멜로");
		list.add("드라마");
		list.add("액션");
		list.add("사극");
		list.add("멜로");
		list.add("로맨스");
		list.add("스릴러");
		list.add("호러");
		list.add("범죄");
		
		HashSet<String> set=new HashSet<String>(list);
		list=new ArrayList<String>(set);
		
		for(int i=0;i<list.size();i++)
		{
			
		}
	}

}
