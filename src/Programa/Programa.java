package Programa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] A = new int [10];
        int [] B = new int [10];

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Digite o número %d:\t", (i+1));
            A[i] = ler.nextInt();
            B[i] = A[i];
        }
        for (int i = 0; i < 10; i++)
        {
            for ( ; B[i] > 0; B[i]--)
            {
                if (A[i] % B[i] == 0 && A[i] != B[i] || A[i] == 1)
                {
                    System.out.printf("\nO número %d não é primo !", A[i]);
                    break;
                }
                else if (B[i] == 2)
                {
                    System.out.printf("\nO número %d é primo !", A[i]);
                    break;
                }
            }
        }
        ler.close();
    }
}