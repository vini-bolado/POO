package IMPRESSORA;

import java.time.LocalDate;
import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private int folhasDisponiveis;







    public Impressora(String modelo, String tipoConexao, int folhasDisponiveis) {

        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.folhasDisponiveis = folhasDisponiveis;

    }




    public void imprimir(int folhasDisponiveis){

        if (folhasDisponiveis == 0){
            System.out.println("Nao tem papel amigao");
        }else System.out.println("Imprimindo!!!");

    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }



    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;

        LocalDate data = LocalDate.of(2022,02,25);

        System.out.println(data);
    }
}




