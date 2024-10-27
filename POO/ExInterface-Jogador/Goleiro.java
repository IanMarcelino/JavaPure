public abstract  class Goleiro implements Movimento {
    public void defender(){
        System.out.println("defendendo");
    }
    public void chutar(){
        System.out.println("chutou");
    }
    
    public abstract void correr();

    public abstract void andar();
    
}
