package alunomedia;

public final class Aluno {
    private final String nome;
    private final double nota1;
    private final double nota2;
    
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;   
    }

    
    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }
    public String situacao(){
        return calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
    }

    public String getNome(){
        return this.nome;
    }

}
