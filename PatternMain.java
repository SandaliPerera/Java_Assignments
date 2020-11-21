class PatternGen{
	public static void generatePattern(){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void generatePattern(char t){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(t);
			}
			System.out.println("");
		}
	}
	
	public static void generatePattern(int v){
		if(v>0 && v<=10){
			for(int i=0;i<v;i++){
				for(int j=0;j<=i;j++){
					System.out.print("+");
				}
				System.out.println("");
			}
		}
	}

	public static void generatePattern(int v, char c){
		if(v>0 && v<=10){
			for(int i=0;i<v;i++){
				for(int j=0;j<=i;j++){
					System.out.print(c);
				}
				System.out.println("");
			}
		}
	}
}

public class PatternMain{
    public static void main(String[] args) {
	PatternGen P1 = new PatternGen();
	P1.generatePattern();
	
	PatternGen P2 = new PatternGen();
	P2.generatePattern('a');
	
	PatternGen P3 = new PatternGen();
	P3.generatePattern(10);
	
	PatternGen P4 = new PatternGen();
	P4.generatePattern(8,'b');
		   
    }
}