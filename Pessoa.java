public class Pessoa {
        public double altura;
        public double peso;
        public int anoNascimento;
        public String nome;
        
        
        // public Pessoa (){
        //     this.altura= 0.0;
        //     this.peso=0.0;
        //     this.anoNascimento=0;
        //     this.nome = "";
        // }
        public Pessoa (double altura, double peso, int anoNascimento, String nome){
            this.altura = altura;
            this.peso = peso; 
            this.anoNascimento = anoNascimento;
            this.nome = nome;
        }
        public void mostraratributo(){
            System.out.println(altura);
            System.out.println(peso);
            System.out.println(anoNascimento);
            System.out.println(nome);
        }
}
        
