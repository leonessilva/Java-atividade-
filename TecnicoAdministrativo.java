import java.util.Objects;

public class TecnicoAdministrativo extends Pessoa {
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String nome, int idade, String cpf, String setor, String cargo) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public void exibirDados() {
        System.out.println(this);
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
    }

    public String toString() {
        return super.toString() + ", Setor: " + setor + ", Cargo: " + cargo;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        TecnicoAdministrativo t = (TecnicoAdministrativo) obj;
        return Objects.equals(setor, t.setor) && Objects.equals(cargo, t.cargo);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), setor, cargo);
    }
}