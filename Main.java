import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Silva", 26, "107.542.904-00", "20250885", "Engenharia de Software");
        aluno.setMediaNotas(8.5);

        Professor professor = new Professor("Stephen Hawking", 45, "536.245.104-16", "20251403", "POO");

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Gustavo Santos", 35, "048.546.694-45", "TI", "Analista de Sistemas");

        int soma = 0;
        for (char c : aluno.getMatricula().toCharArray()) {
            if (Character.isDigit(c)) soma += Character.getNumericValue(c);
        }
        int criterio = soma % 3;

        System.out.println("Soma dos dígitos da matrícula: " + soma);
        System.out.println("Resultado do módulo 3: " + criterio);

        switch (criterio) {
            case 0 -> {
                List<Pessoa> pessoas = new ArrayList<>();
                pessoas.add(aluno);
                pessoas.add(professor);
                pessoas.add(tecnico);
                System.out.println("\n--- Lista de Pessoas (List) ---");
                for (Pessoa p : pessoas) {
                    p.exibirDados();
                    System.out.println("toString(): " + p.toString());
                    System.out.println("hashCode(): " + p.hashCode());
                    System.out.println();
                }
            }
            case 1 -> {
                Set<Pessoa> pessoas = new HashSet<>();
                pessoas.add(aluno);
                pessoas.add(professor);
                pessoas.add(tecnico);
                System.out.println("\n--- Lista de Pessoas (Set) ---");
                for (Pessoa p : pessoas) {
                    p.exibirDados();
                    System.out.println("toString(): " + p.toString());
                    System.out.println("hashCode(): " + p.hashCode());
                    System.out.println();
                }
            }
            case 2 -> {
                Map<String, Pessoa> pessoas = new HashMap<>();
                pessoas.put(aluno.getCpf(), aluno);
                pessoas.put(professor.getCpf(), professor);
                pessoas.put(tecnico.getCpf(), tecnico);
                System.out.println("\n--- Lista de Pessoas (Map) ---");
                for (Map.Entry<String, Pessoa> entry : pessoas.entrySet()) {
                    System.out.println("CPF: " + entry.getKey());
                    Pessoa p = entry.getValue();
                    p.exibirDados();
                    System.out.println("toString(): " + p.toString());
                    System.out.println("hashCode(): " + p.hashCode());
                    System.out.println();
                }
            }
        }

        System.out.println("aluno.equals(professor)? " + aluno.equals(professor));
    }
}