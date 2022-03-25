package ejersT1;

public class Ejer10 {

	
	public static void main(String [] args)
	{
		int num=5;
		num += num - 1 * 4 + 1;  //num += 2  -->  num = num + 2
		System.out.println(num);
		num=4;
		num %= 7 * num % 3 * 5;  //num %= 5   num = 4 % 5
		System.out.println(num);
	}
}
