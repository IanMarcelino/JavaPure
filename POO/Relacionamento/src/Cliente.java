public class Cliente {
  private String nome;
  private String cpf;
  private int celular;

  public Cliente(String nome, String cpf, int celular){
    this.nome = nome;
    this.cpf = cpf;
    this.celular = celular;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setcpf(String cpf) {
    this.cpf = cpf;
  }

  public void setcelular(int celular) {
    this.celular = celular;
  }

  public String getNome() {
    return nome;
  }

  public String getcpf() {
    return cpf;
  }

  public int getcelular() {
    return celular;
  }

  public void imprimir() {
    System.out.println(nome + cpf + celular);
  }
}
