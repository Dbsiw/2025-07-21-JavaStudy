/*
 * for => 형식 , 동적 순서
 * 		  ------------
 * 		  for(초기값;조건식;증가식)
 * 		  {			
 * 		  	실행문장 (반복) 
 * 		  }
 */
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("2~9 사이의 단을 입력:");
		int dan=scan.nextInt();
		if(dan>=2 && dan<=9)
		{
			for(int i=1;i<=9;i++)
			{
				System.out.println("%d * %d = %d\n");
			}
		}
	}

}
