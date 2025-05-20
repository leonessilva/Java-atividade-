import java.util.Objects;

public class Professor extends Pessoa {
    private String siape;
    private String disciplina;

    public Professor(String nome, int idade, String cpf, String siape, String disciplina) {
        super(nome, idade, cpf);
        this.siape = siape;
        this.disciplina = disciplina;
    }

    public String getSiape() { return siape; }
    public void setSiape(String siape) { this.siape = siape; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public void exibirDados() {
        System.out.println(this);
        System.out.println("SIAPE: " + siape);
        System.out.println("Disciplina: " + disciplina);
    }

    public String toString() {
        return super.toString() + ", SIAPE: " + siape + ", Disciplina: " + disciplina;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Professor p = (Professor) obj;
        return Objects.equals(siape, p.siape);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), siape);
    }
}