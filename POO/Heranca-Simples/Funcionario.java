public class Funcionario {
  private String cpf;
  private String nome;
  private double salario;

  public Funcionario(String cpf, String nome, double salario) {
    this.cpf = cpf;
    this.nome = nome;
    this.salario = salario;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public double calcularBonus() {
    return salario = salario * 0.05;
  }
}
