import java.util.Scanner;

import java.io.*;

 
public class Calculator {

 public float addition(float no1, float no2){
 
		float sum;
		sum = no1 + no2;
		return sum;

	}

 
	public float sub(float no1, float no2){
		float sum;
		sum = no1 - no2;
		return sum;

	}

 
	public float multiply(float no1, float no2){
		float sum;
		sum = no1 * no2;
		return sum;

	}

 
	public float divide(float no1, float no2){
		float sum;
		sum = no1 / no2;
		return sum;
	}

 }
 public class Driver{
    public static void main(String[] args) {

    	int selc_no;
    	float x;
    	float y;
    	float sum;
    	PrintStream out;
        
// 
    	Calculator calc = new Calculator();
 
    	try
    	{

   		do
    		{
    			System.out.println("Calc");
    			System.out.println("--------------------\n");
    			System.out.println("1.  Addition");
    			System.out.println("2.  Subtraction");
    			System.out.println("3.  Multiply");
    			System.out.println("4.  Divide");
    			System.out.println("99. Exit\n");
    			System.out.println("Enter Choice: ");
    			Scanner input = new Scanner(System.in);
    			selc_no = input.nextInt();
    			while ((selc_no < 1 || selc_no > 4) && selc_no != 99)
    			{
    				System.out.println("Please enter a 1, 2, 3, 4 or 99 " );
    				selc_no = input.nextInt();
    			}
 
 
    			System.out.println("Enter two Number");

    			x = input.nextFloat();

    			y = input.nextFloat();

 //Switch Case for Selection
    				switch (selc_no)

    				{
    					case 1: 
    						sum = calc.addition(x,y);
    						System.out.printf("The sum is %f\n\n",sum);
    						System.out.println(x + "+" + y + "=" + sum);
    						break;
 
    					case 2:
    						sum = calc.sub(x,y);
    						System.out.printf("The substraction is %f\n\n",sum);
    						System.out.println(x + "-" + y + "=" + sum);
    						break;
 
    					case 3:
    						sum = calc.multiply(x,y);
    						System.out.printf("The multiplication is %f\n\n",sum);
    						System.out.println(x + "*" + y + "=" + sum);
    						break;
 
    					case 4:
    						sum = calc.divide(x,y);
    						System.out.printf("The division is %f\n\n",sum);
    						System.out.println(x + "/" + y + "=" + sum);
    						break;

    						

    				}

 
    		}

 
    		while (selc_no != 99);

    		System.out.println("Exiting");

 
    	}

 
    	catch(Exception e)

    	{

    		System.out.println("Exiting please enter Number \n" +e);

    	}
 
    }

}