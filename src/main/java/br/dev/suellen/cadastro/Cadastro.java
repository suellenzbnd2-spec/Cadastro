package br.dev.suellen.cadastro;

import java.util.Scanner;

/**
 *
 * @author sesi2dib
 */
public class Cadastro {

    public static void main(String[] args) {
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);
        int[] mCadastro = new int[10];
        int[] ID = new int[10];
        String[] Nome = new String[10];
        long[] Telefone = new long[10];
        int[] Dia = new int[10];
        int[] Mes = new int[10];
        int[] Ano = new int[10];
        int[] Idade = new int[10];

        for (int iC = 0; iC < mCadastro.length; iC++) {

            System.out.printf("Informe o seu ID: ");
            ID[iC] = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Nome: ");
            Nome[iC] = tecladoTexto.nextLine();

            System.out.printf("Informe o seu Telefone: ");
            Telefone[iC] = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Dia de Nascimento: ");
            Dia[iC] = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Mes de Nascimento: ");
            Mes[iC] = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Ano de Nascimento: ");
            Ano[iC] = tecladoNumero.nextInt();

        }
//                  1234567890 | 12345678901234567890 | 123456789101 |  dd/mm/aaaa | 1234 
        System.out.printf("+-----------+----------------------+--------------+-------------+------+--------+");
        System.out.printf("|    ID     |         Nome         |   Telefone   | Data de Nascimento | Idade  |");
        System.out.printf("+-----------+----------------------+--------------+-------------+------+--------+");

        for (int iT = 0; iT < mCadastro.length; iT++) {
            System.out.printf("|    %10d   |        %-20s       |     %12d     |       %02d         | Idade  |\n",
                    ID[iT],
                    Nome[iT],
                    Telefone[iT],
                    Dia[iT],
                    Mes[iT],
                    Ano[iT],
                    2026 - Idade[iT]);

        }

        System.out.printf("Fim do Programa");

    }
}
