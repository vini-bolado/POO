package IMPRESSORA;

public class ObjetoImpressora {
    public static void main(String[] args) {
        Impressora empressora1 = new Impressora("Chamex","USB",1);
        Impressora empressora2 = new Impressora("Invictus","Cabo",0);

        empressora1.imprimir(1);
        empressora2.imprimir(0);


    }
}
