package pessoas;

// Enum para representar os diferentes níveis de acesso
enum NivelAcesso {
    ADMINISTRADOR,
    ATENDENTE,
    GERENTE
}

// Classe Funcionario
class Funcionario {
    private String nome;
    private NivelAcesso nivelAcesso;
    private double salario;

    public Funcionario(String nome, NivelAcesso nivelAcesso, double salario) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos para executar ações específicas de acordo com o nível de acesso
    public void realizarTarefa() {
        if (nivelAcesso == NivelAcesso.ADMINISTRADOR) {
            System.out.println("Realizando tarefa de administrador");
            // Lógica para tarefa de administrador
        } else if (nivelAcesso == NivelAcesso.ATENDENTE) {
            System.out.println("Realizando tarefa de atendente");
            // Lógica para tarefa de atendente
        } else if (nivelAcesso == NivelAcesso.GERENTE) {
            System.out.println("Realizando tarefa de gerente");
            // Lógica para tarefa de gerente
        } else {
            System.out.println("Nível de acesso inválido");
        }
    }
}

