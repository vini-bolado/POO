package MesaTrabAula1;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{


    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }



    @Override
    public void imprimir() {
        System.out.println("Imprimindo pela Epson");
    }
}

