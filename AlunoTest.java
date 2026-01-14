/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alunomedia;
import java.util.Scanner;
import java.util.ArrayList;
        
public class AlunoTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunoLista = new ArrayList<>();
        
        for (int i = 1; i <4; i++){
            System.out.printf("Digite o nome do aluno %d: ", i);
            String nome = scanner.nextLine();
            
            System.out.printf("Digite a nota do aluno %d: ", i);
            double nota1 = scanner.nextDouble();
            
            System.out.printf("Digite a segunda nota do aluno %d: ", i);
            double nota2 = scanner.nextDouble();
            scanner.nextLine();
            
            Aluno aluno = new Aluno(nome, nota1, nota2);
            alunoLista.add(aluno);
            }
        
            //impressão
            System.out.println("\n====== Lista de alunos ======\n");
            for (Aluno a : alunoLista){
                System.out.printf("%s | Média: %.2f | Situação: %s%n", 
                        a.getNome(), a.calcularMedia(), a.situacao());
            }
  
        }
    }
