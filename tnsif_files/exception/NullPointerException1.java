package tnsif.capgemini.c2tc.exception;

public class NullPointerException1 {
	private static String str;

	public static void main(String[] args) {
		str = null;
		
		try
		{
			System.out.println(str.length());
		}catch(NullPointerException e)
		{
		System.out.println(e);
		}
		System.out.println("welcome");

	}

}
