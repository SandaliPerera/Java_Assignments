import java.util.Scanner;
class MyClac {
  public static void main(String[] args) {

   Scanner input=new Scanner(System.in);

    System.out.println("Enter number1");
      double num1=input.nextDouble();

    System.out.println("Enter number2");
	double num2=input.nextDouble();


    sum(num1,num2);
    sub(num1,num2);
    mul(num1,num2);
    div(num1,num2);

  }


static void sum(double num1,double num2){
      
        System.out.print("Sum : "+ (num1+num2)); 
    }
static void sub(double num1,double num2){
      
	System.out.print("Sub : "+ (num1-num2)); 
    }
static void mul(double num1,double num2){
      
        System.out.print("Multiplication : "+ (num1*num2)); 
    }
static void div(double num1,double num2){
      
        System.out.print("Division : "+ (num1/num2));
    }

}