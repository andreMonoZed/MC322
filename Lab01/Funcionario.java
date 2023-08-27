

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

    public void setNome(String nome){
        this.nome = nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
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

