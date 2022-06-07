package Animais;

public class main {
    public static void main(String[] args) {

        Cachorro coco =  new Cachorro("coco",5);
        Cavalo coco2 = new Cavalo("coco2",8);
        Preguica coco3 = new Preguica("COCO3",18);

        coco2.emitirSom();
        coco.correr();
        coco3.subirArvore();
    }
}
