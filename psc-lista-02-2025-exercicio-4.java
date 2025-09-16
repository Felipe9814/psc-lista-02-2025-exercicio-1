/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = entrada.nextDouble();

        
        System.out.print("Digite quantos litros foram vendidos: ");
        double litrosVendidos = entrada.nextDouble();

       
        double vt = precoLitro * litrosVendidos;

       
        System.out.println ("O cliente deverá pagar: R$ "+ vt);

        entrada.close();
    }
}