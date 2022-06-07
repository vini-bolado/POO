package Animais;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {

        System.out.println("Gritar");

    }

    public void subirArvore(){
        System.out.println("Sobe em Arvore");
    }
}
