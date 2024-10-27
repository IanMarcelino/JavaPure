public class Presidente extends Funcionario {
  private double qtdAcoes;

  public Presidente(String cpf, String nome, double salario, double qtdAcoes){
    super(cpf,nome,salario);
    this.qtdAcoes = qtdAcoes;
  }

  @Override
  public double calcularBonus(){
    return getSalario() * 0.10;
  }
}
