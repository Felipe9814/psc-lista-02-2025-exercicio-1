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
	    double N1;
	    double N2;
	    double N3;
	    double N4;
    System.out.println("Primeira nota: ");
        N1 = enterScanner.nextDouble();
    System.out.println("Segunda nota: ");
        N2 = enterScanner.nextDouble();
    System.out.println("Terceira nota: ");
        N3 = enterScanner.nextDouble();
    System.out.println("Quarta nota: ");
        N4 = enterScanner.nextDouble();
            double M5 = (N1+N2+N3+N4)/ 4 ;
    System.out.println("Media das notas é: " + M5 );
		System.out.println("FIM.");
		enterScanner.close();
	}
}
