package aulagui.model;

public class Aluno {
    
    private String nome;
    private String ra;

    public Aluno(){
    
    }
    
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    boolean add(Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
