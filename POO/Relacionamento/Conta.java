package POO.Relacionamento;

public class Conta {
  private Cliente cliente;
  private double saldo;

  public Conta(Cliente cliente, double saldo) {
    this.cliente = cliente;
    this.saldo = saldo;

    if (saldo < 0) {
      saldo = 0;
    }
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
    if (saldo < 0) {
      saldo = 0;
    }
  }

  public Cliente getCliente() {
    return cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void fazOperacao(Operacao operacao) {
    if (operacao.getTipo().equals("D")) {
      this.saldo = saldo + operacao.getValor();
    }
    if (operacao.getTipo().equals("R")) {
      if (saldo <= operacao.getValor()) {
        this.saldo = saldo - operacao.getValor();
        System.out.println("Operacao realizada com sucesso!");
      } else {
        System.out.println("Não é possível realizar a transação! Saldo insuficiente.");
      }
    }
  }

  public void mostrarConta() {
    System.out.println("Sr " + cliente.getNome() + ", seu saldo: " + saldo);
  }
}