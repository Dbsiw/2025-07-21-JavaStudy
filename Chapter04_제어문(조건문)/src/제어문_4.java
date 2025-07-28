// => 입력을 받아서 => 로그인 처리
// id,pwd => 오라클에서 처리
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="admin";
		final String PWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		
		System.out.println("비밀번호 입력");
		String pwd=scan.next();
		
		System.out.println("====결과====");
		if(id.equals(ID) && pwd.equals(PWD))
				System.out.println("로그인 되었습니다");
		else
				System.out.println("아이디나 비밀번호가 틀립니다");
	}

}
