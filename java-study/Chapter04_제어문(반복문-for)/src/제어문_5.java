
public class 제어문_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		for(int i=10;i<=16;i++)
		{
			int lotto=(int)(Math.random()*45)+1;
			Thread.sleep(1000);
			System.err.print(lotto+" ");
		}
	}

}
