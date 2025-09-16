/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		   Scanner enterScanner= new Scanner(System.in);
		   int N1;
		   System.out.println("Digite um numero: ");
		   N1 = enterScanner.nextInt();
		   System.out.println("o numero digitado é: "+ N1);
		    enterScanner.close();
		}
	}