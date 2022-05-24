package Aula05;

public class ObejtoBancoDigital {

    public static void main(String[] args) {
        BancoDigital cliente1 = new BancoDigital(1, "DIANA TOLOI");
        BancoDigital cliente2 = new BancoDigital(2,"Giovana manfro");


        cliente1.aumentarDivida(1000.00);
        cliente1.pagarDivida(1.0);

        cliente2.setNome("Fulano");
        cliente2.pagarDivida(50.0);

        cliente1.setDivida(1000000000000000000000000000000000000000000000000.900123);
        cliente1.aumentarDivida(100.21);



    }
}
