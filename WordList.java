import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class HashTable{
	
	private String[] asciiValues;
	private String[] asciiValueSquares;
	private String[] words ;
	

	public HashTable(int c) 
	 {
		 asciiValues = new String[c];
		 words = new String[c];
		 asciiValueSquares = new String[c];
	 }

	private int hashNumber(int word,int size) 
    {
        return word % size; 
    }
	
	//To get the ASCII values of the characters of the words 
	
	private int calculate(String myWord){
		int temp=0;
		
		  char[] ch = new char [myWord.length()];
            for (int i = 0; i < myWord.length(); i++) { 
                ch[i] = myWord.charAt(i); 
            } 
            for (char c : ch) { 
                int num = Character.getNumericValue(c);
                temp = temp + num;
			}
			
			
			return temp;
	}
	
	//To get the square ASCII values of the characters of the words 
	
	private int calculateSquare(String myWord){
		int tempSquare=0;
		
		  char[] ch = new char [myWord.length()];
            for (int i = 0; i < myWord.length(); i++) { 
                ch[i] = myWord.charAt(i); 
            } 
            	for (char c : ch) { 
                int num = Character.getNumericValue(c);
                tempSquare = tempSquare + (num*num);
			}
			
			return tempSquare;
	}

	//to create the hash table
	
	 public void input(String myWord,int m) 
    {
		int temp = calculate(myWord);
		int tempSquare = calculateSquare(myWord);
                 
		int key = hashNumber(temp,m);
		
		int k = key;
		
		String asciiValue = Integer.toString(temp);
		String asciiValueSquare = Integer.toString(tempSquare);

		do{
			if(words[k] == null){
				words[k] = myWord;
				asciiValues[k] = asciiValue;
				asciiValueSquares[k] = asciiValueSquare;
				break;
			}
			//liner probing 
			k = (k + 1) % m;
		}while(k != key);
		
    }
	
	//to read the  hash table
	
public void read(ArrayList<String> ana,int m) 
 {
	 
	 for(int i = 0; i < m; i++){
		 String myWord = words[i];
		 int temp = calculate(myWord);
		int tempSquare = calculateSquare(myWord);
	 
		String asciiValue = Integer.toString(temp);
		
		int key = hashNumber(temp,m);
		int k = key;
		 
		 
		 do{
			 
			if(asciiValues[k].equals(asciiValue)){
				int asciiValueSquareInt = Integer.parseInt(asciiValueSquares[k]);
				int wordSquare = asciiValueSquareInt;
				if(tempSquare == wordSquare){
					
					ana.add(words[k]+",");
					words[k]="";
					
				}
			} 
			//liner probing
			k = (k + 1) % m;
			
		 }while(k != m-1);
		 ana.add("%");

		}
		 
	}

}

public class WordList{

		public static void main(String[] args) throws FileNotFoundException {
			
			ArrayList<String> ana =new ArrayList<String>();
			int c=0;

			File file = new File("WordList.txt");
			
			
			Scanner sizeScan = new Scanner(file);
		
			while(sizeScan.nextLine() != null)
			{
				c=c+1;
				if(!sizeScan.hasNextLine()){
					break;
				}
			}
						
			
			HashTable hashWord = new HashTable(c);
			Scanner inputs = new Scanner(file);
			while(inputs.hasNextLine())
			{
				hashWord.input(inputs.next(),c);
			}
			
			hashWord.read(ana,c);
			
			String ang = ana.toString()
				.replace("[", "")
				.replace("]", "")
				.replace("%", "\n")
				.replace(",", "");

       
String adjusted = ang.replaceAll("(?m)^[ \t]*\r?\n", "");
			 System.out.println(adjusted);
		
	}
}

