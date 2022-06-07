package MesaTrabAula1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        ImpressoraCannon ImpressoraCoco = new ImpressoraCannon("Cannon","USB", LocalDate.of(1998,3,20),5,20.0);

        ImpressoraEpson ImpressoraCoco2 = new ImpressoraEpson("Epson","USB", LocalDate.of(1995,3,20),5,20.0);



        ImpressoraCoco.imprimir();
        ImpressoraCoco2.imprimir();

        ImpressoraCoco.temTinta(ImpressoraCoco.getPorcentagemTinta());

    }
}
