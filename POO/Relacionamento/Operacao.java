package POO.Relacionamento;
public class Operacao {
  private String tipo;
  private double valor;

  public Operacao(String tipo, double valor){
    this.tipo = tipo;
    this.valor = valor;
  }
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public void setValor(double valor){
    this.valor = valor;
  }
  
  public String getTipo(){
    return this.tipo;
  }
  public double getValor(){
    return this.valor;
  }
}
