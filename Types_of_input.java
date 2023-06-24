
import javax.swing.JOptionPane;
import java.io.*;
public class Types_of_input
{
	public static void main(String[] args)
	{
		// input type - 1
		// String inp = JOptionPane.showInputDialog("Enter a Number Here!");
		// System.out.println("The String is = "+inp);

		// int inp = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number Here!"));
		// System.out.println("The Entered Integer = "+inp);



		// Input type - 2
		// try
		// {
		// 	DataInputStream din = new DataInputStream(System.in);
		// 	System.out.println("Enter the first Number : ");
		// 	int num1 = din.readInt();
		// 	System.out.println("Enter the 2nd Number : ");
		// 	int num2 = din.readInt();

		// 	int res = num1 + num2;
		// 	System.out.println("The Result = "+res);
		// 	din.close();
		// }
		// catch(Exception E)
		// {
		// 	E.printStackTrace();
		// }

			// Input type-3:-
			// try
			// {
			// 	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			// 	System.out.println("Enter first Number: ");
			// 	int num1 = Integer.parseInt(bfr.readLine());
				
			// 	System.out.println("Enter Second Number: ");
			// 	int num2 = Integer.parseInt(bfr.readLine());

			// 	int sum = num1 + num2;

			// 	System.out.println("Sum = "+sum);
			// 	bfr.close();
			// }
			// catch(Exception E)
			// {
			// 	E.printStackTrace();
			// }

			// Input type4:-
				// Console c = System.console();
				// System.out.println("Enter the Text : ");
				// String str = c.readLine();
				// System.out.println("The Entered String is : "+str);
				// System.out.println("Now, Entered Password : ");
				// char[] pass = c.readPassword();
				// System.out.println("The Password = "+pass.toString());
				// c.printf("The String is %s and Password is %s",str,pass);
				// PrintWriter p = c.writer();
				// p.println("HI");


			// Input type5:- 
			// It required to provide commandline arguments
			for(int i=0; i<args.length; i++)
			{
				System.out.println("Argument "+i+" = "+args[i]);
			}
	}
}