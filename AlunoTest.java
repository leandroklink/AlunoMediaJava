/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alunomedia;
import java.util.Scanner;

        
public class AlunoTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a seguinda nota: ");
        double nota2 = scanner.nextDouble();
        
        Aluno aluno = new Aluno(nome, nota1, nota2);

        System.out.printf("Aluno: %s\n", aluno.getNome());
        System.out.printf("Nota 1: %.2f\n", aluno.getNota1());
        System.out.printf("Nota 2: %.2f\n", aluno.getNota2());
        System.out.printf("Média: %.2f\n", aluno.calcularMedia());    
        System.out.printf("Situação: %s\n", aluno.situacao());

        }
    }
