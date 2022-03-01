package array;
	import java.util.Scanner;
	import java.lang.Math;
	public class modify {
		public static int modifyNumber(int number1)
		{
			String s=Integer.toString(number1); //convert int to String    
			System.out.println(s);
			StringBuffer b = new StringBuffer();
			for(int i=0;i<s.length()-1;i++)   //extracting each char 
			{
				number1= ((int)s.charAt(i))-((int)s.charAt(i+1));
			    b.append(Math.abs(number1));
			}
			System.out.print(b +" ");
			String str=b.toString();     //converting StringBuffer to String
			return Integer.parseInt(str);   //Converting string to integer
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number");
			int n= sc.nextInt();
			modifyNumber(n);	
			sc.close();
		}
	}

