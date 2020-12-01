//18020569

import java.util.Scanner;

public class ExceptionHandeling{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	while (true) {
		try{
			System.out.print("Enter your number : ");
			int userInput = input.nextInt();
	
			switch(userInput){
				case 1:
					int a = 1/0 ; //Arithmetic Exception
					break;
				case 2:
					String b = null;
					System.out.println(b.length()); //Number format Exception
					break;
				case 3:
					String c="abc";
					int d=Integer.parseInt(c); //Number format Exception
					break;
				case 4:
					int e[] =new int[1];
					e[10]=1; //Array index out of bound
					break;
				case 5:
					String f="A";
					System.out.println(f.charAt(10)); //Sting index out of bound
					break;
				case 6:
					throw new MyException("My Expection"); //My exception
					
				case 7:
					System.exit(0); //Exit
			}
		  }catch (ArithmeticException e){
			System.out.println("ArithmeticException Occured! "+e+"\n");
		  }catch (NullPointerException e){
			System.out.println("NullPointerException Occured! "+e+"\n");
		  }catch (NumberFormatException e){
			System.out.println("NumberFormatException Occured! "+e+"\n");
		  }catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException Occured! "+e+"\n");
		  }catch (StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException Occured! "+e+"\n");
		  }catch (MyException e){
			System.out.println("MyException Occured! "+e+"\n");
		  } 	
		}
	}
}

class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
}