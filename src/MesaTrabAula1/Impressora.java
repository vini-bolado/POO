package MesaTrabAula1;

import java.time.LocalDate;

public abstract class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int FolhasDisponiveis;
    private double porcentagemTinta;


    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.FolhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }

    public void temPapel(int folhasDisponiveis){
        if(folhasDisponiveis == 0){

            System.out.println("Precisa de folha!");

        }else {
            System.out.println("Pronto pra imprimir");
        }

    }
    public void temTinta(double porcentagemTinta ){
        if(porcentagemTinta == 0.0){

            System.out.println("Precisa de tinta!");

        }else {
            System.out.println("Pronto pra imprimir");
        }

    }

    public abstract void imprimir();


    public int getFolhasDisponiveis() {
        return FolhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        FolhasDisponiveis = folhasDisponiveis;
    }

    public double getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(double porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }
}
