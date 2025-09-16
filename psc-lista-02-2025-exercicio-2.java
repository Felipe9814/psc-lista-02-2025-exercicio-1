/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner enterScanner = new Scanner(System.in);
	    int N1;
	    int N2;
		System.out.println("Digite um numero: ");
		    N1 = enterScanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		    N2 = enterScanner.nextInt();
		int soma = N1 + N2;
		int sub = N1 - N2;
		int mult = N1 * N2;
		System.out.println("Soma dos números: " + soma);
		System.out.println("Subtração dos números: " + sub);
		System.out.println("Multiplicação dos números: " + mult);
		 enterScanner.close();
		
		
	}
}
