package MesaTrabAula1;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{


    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pela Cannon");
    }
}
