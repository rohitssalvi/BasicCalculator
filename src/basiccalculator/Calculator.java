package basiccalculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) 
	{
		int number1,number2;
		    System.out.println("Choose value Imformation");
		    System.out.println("0 addition");
		    System.out.println("1 subtraction");
		    System.out.println("2 multiplication");
		    System.out.println("3 division");
		    
		    System.out.println("Enter the first number :");
		    Scanner firstNumber=new Scanner(System.in);
		    number1=firstNumber.nextInt();
		    System.out.println("Enter The Second number:");
		    
		    Scanner secondNumber=new Scanner(System.in);
		    number2=secondNumber.nextInt();
		    System.out.println("Enter Your Choise:");
		    Scanner choise=new Scanner(System.in);
		    int ch=choise.nextInt();
		    
			
		    switch (ch) {
			case 0:
				 
				int sum=number1+number2;
				  System.out.println("Sum is:"+sum);
				break;
				
            case 1:
				 int sub=number1-number2;
				 System.out.println("subtraction  is:"+sub);
				break;
	
            case 2:
            	int mul=number1-number2;
				 System.out.println("Multiplication is:"+mul);
	            break;

            case 3:
            	int div=number1-number2;
				 System.out.println("Division is:"+div);
               break;
			default:
				System.out.println("Invalid Choise");
				break;
			}
		    
	}

}
