public class Produto {
  private String cod;
  private double peso;
  private double valor;

  public Produto(String cod, double peso, double valor) {
    this.cod = cod;
    this.peso = peso;
    this.valor = valor;
  }

  public void mostrarInfo() {
    System.out.println("O codigo do produto: " + cod + ", O peso: " + peso + ", O valor: " + valor);
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public String getCod() {
    return this.cod;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }

}
