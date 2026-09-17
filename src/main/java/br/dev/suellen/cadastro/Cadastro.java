package br.dev.suellen.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sesi2dib
 */
public class Cadastro {

    public static void main3(String[] args) {
    
    Aluno a1 = new Aluno();
    
    a1.id = 2;
    a1.nome = "Su";
    a1.telefone = 6355;      
    a1.dia = 22;
    a1.mes = 11;
    a1.ano = 2010;
    
    System.out.println(a1.toString());
    
    Aluno a2 = new Aluno(300, "Suellen", 6355, 2, 2, 2010);
    System.out.println(a2.toString());
    }
            
    
    public static void main(String[] args) {
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);
       
        while (true) {
            
            Aluno novoAluno = new Aluno();

            System.out.printf("Informe o seu ID (0 e = sair): ");
            novoAluno.id = tecladoNumero.nextInt();
            
            if (novoAluno.id == 0){
            break;    
            }

            System.out.printf("Informe o seu Nome: ");
            novoAluno.nome = tecladoTexto.nextLine();

            System.out.printf("Informe o seu Telefone: ");
            novoAluno.telefone = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Dia de Nascimento: ");
            novoAluno.dia = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Mes de Nascimento: ");
            novoAluno.mes = tecladoNumero.nextInt();

            System.out.printf("Informe o seu Ano de Nascimento: ");
            novoAluno.ano = tecladoNumero.nextInt();
            
            listaAlunos.add(novoAluno);

        }
//                  1234567890 | 12345678901234567890 | 123456789101 |  dd/mm/aaaa | 1234 
        System.out.printf("+-----------+----------------------+--------------+-------------+------+--------+\n");
        System.out.printf("|    ID     |         Nome         |   Telefone   | Data de Nascimento | Idade  |\n");
        System.out.printf("+-----------+----------------------+--------------+-------------+------+--------+\n");

        for (Aluno aux: listaAlunos ) {
            System.out.println(aux.toString());

        }

        System.out.printf("Voce chegou ao Fim do Programa");

    }
}
