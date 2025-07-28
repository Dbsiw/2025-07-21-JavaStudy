/*
 *	프로그램 : 순차적
 *			위에서 아래 => 한줄씩 번역
 *	프로그램의 종류
 *		= 평문 : 일반 명령문만 수행 => HTML / CSS
 *				=> 문법사항 (변수선언, 연산처리...)
 *		= 조건문 : 필요시에만 명령문을 수행
 *				 상황에 따라서 다른 기능을 수행
 *				=> 검색 (사이트)
 *				=> 상세보기
 *				=> 로그인 처리 / 아이디 중복 / 아이디 찾기 / 비밀번호 찾기
 *			1) 단일 조건문 (******)
 *				=> 독립적 조건문 하나하나 검색
 *				=> 중복적으로 수행
 *				   1~100 => 3의 배수, 5의 배수, 7의 배수
 *							------	------
 *							15
 *							21
 *				=> 조건이 true일때만 수행
 *			2) 선택 조건문 (***)
 *				=> 조건이 true/ false
 *				=> 웹에서 사용빈도가 많다
 *						------
 *						| 결과값을 전송
 *			3) 다중 조건문 : => 메뉴
 *				=> 한개의 문장만 수행 => 조건에 맞는 if만 찾는다
 *				=> 메뉴 제작
 *
 *			4) 종합 조건문 : A => A+, A0, A-...
 *			   -------- 조건 (&&) ===> 112page
 *
 *		1. 단일조건문 => 문법 / 형식
 *		   형식)
 *				*** 자바에서 지원하는 모든 제어문은 바로 밑에 있는
 * 					문장만 제어
 * 					(여러개의 문장을 제어할때 {})
 * 					=> 가독성 / 수정 편리{}
 * 				*** 제어문에 특별한 경우가 아니면 ;를 사용허자 않는다
 */
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		// 같은 블록에서는 변수명이 중복이 되면 안된다
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int max=a; // 임의의 초기화 => 1
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		System.out.println("max="+max);
		int min=a; // 임의의 초기값 => 100
		if(min>b)
			min=b;
		if(min>c);
			min=c;
		System.out.println("min="+min);
	}

}
