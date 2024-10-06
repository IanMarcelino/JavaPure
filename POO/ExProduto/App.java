public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Arroz", 10.5, 40);
        Produto p2 = new Produto("Feijao", 9.0, 50);
        Produto p3 = new Produto("Beterraba", 10, 50);
        Loja l1 = new Loja(3);

        l1.produtos[0] = p1;
        l1.produtos[1] = p2;
        l1.produtos[2] = p3;

        // double somaPeso = 0;

        int contadorProduto = 0;
        Produto produtomaisLeve = l1.produtos[0];

        for (int i = 0; i < l1.produtos.length; i++) {
            if (l1.produtos[i].getPeso() > 10 && l1.produtos[i].getValor() < 50) {
                contadorProduto++;
            }

            if (l1.produtos[i].getPeso() < produtomaisLeve.getPeso()) {
                produtomaisLeve = l1.produtos[i];
            }
            // somaPeso += l1.produtos[i].getPeso();
        }

        Produto produtomaiscaro = l1.produtos[0];
        for (int i = 0; i < l1.produtos.length; i++) {
            if (l1.produtos[i].getValor() < produtomaiscaro.getValor()) {
                produtomaisLeve = l1.produtos[i];
            }
        }

        double somaValor = 0;
        for (int i = 0; i < l1.produtos.length; i++) {
            if (l1.produtos[i].getPeso() > 10) {
                somaValor += l1.produtos[i].getValor();
            }
        }
        System.out.println("Media dos valores que tem peso maior que 10: " + somaValor / 3);
        System.out.println("Quantos produtos tem peso maior que 10 e valor menor que R$ 50,00" + contadorProduto);
        System.out.println("Media de pesos: " + l1.calcularMediaPeso());
        // System.out.println("Produto mais leve: " + produtomaisLeve); //Mostrando
        // referencia do objeto na memoria, pois não ta sendo usado get.
        System.out.println("O produto mais leve: ");
        produtomaisLeve.mostrarInfo();

    }
}
// int aux = 0;
// for (int i = 0; i < l1.produtos.length; i++) {

// }