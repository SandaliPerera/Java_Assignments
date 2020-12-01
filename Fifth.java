//18020569

import java.util.Scanner;

public class Fifth{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
            
	while(true){
		try{
			System.out.println("Enter your String");
			String str = scanner.next();
			for(int i=4;i<20;i=i+5){
				System.out.println(str.charAt(i));
			}	
		}catch (StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutofBoundsException occured! "+ e +"\n");
		}
	}
    }
}