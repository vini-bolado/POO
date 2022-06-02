package Aula05;

import jdk.swing.interop.SwingInterOpUtils;

public class BancoDigital {
    private int numeroCliente;
    private String nome;
    private Double divida;

    public BancoDigital(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0D;

    }

    public void aumentarDivida(Double valor) {
        //calcular o valor da divida
        this.divida += valor;
        System.out.println("O saldo devedor do cliente" + this.nome + "o valor da divida atual" + this.divida);
    }

    public void pagarDivida(Double valor) {
        //calcula quanto pagou e sobraria da divida
        if (this.divida == 0) {
            System.out.println("Não tem divida a pagar");
        } else
            this.divida -= valor;
        System.out.println("O saldo devedor do cliente" + this.nome + "o valor da divida atual" + this.divida);

    }


    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void setDivida(Double divida) {
        this.divida = divida;
    }
}

