public abstract class Atacante implements Movimento {
    public void defender(){
        System.out.println("falta");
    }
    public void chutar(){
        System.out.println("chutou");
    }
    public abstract void correr();

    public abstract void andar();
    
}
