public class Loja {
  public Produto[] produtos;

  public Loja(int qtdProdutos) {
    this.produtos = new Produto[qtdProdutos];
  }

  public double calcularMediaPeso() {
    double aux = 0;
    for (int i = 0; i < produtos.length; i++) {
      aux += produtos[i].getPeso();
    }
    return aux / produtos.length;
  }
}