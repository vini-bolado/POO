package CACHORRO;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CACHORRO {
    private String nome, raca;
    private LocalDate anoNascimento;
    private Double peso;
    private boolean hasChip, isFerido, aptoAdocao;

    public CACHORRO(String nome, String raca, LocalDate anoNascimento, Double peso, boolean hasChip, boolean isFerido, boolean aptoAdocao) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.hasChip = hasChip;
        this.isFerido = isFerido;
        this.aptoAdocao = aptoAdocao;
    }

    public int getIdade(){
//        Capturo a data atual
        LocalDate dataAtual = LocalDate.now();
//        Converto para inteiro o ano formatado da data de nascimento
        int anoNascimento = Integer.parseInt(String.valueOf(this.anoNascimento.getYear()));
//        Converto para inteiro o ano formatado da data atual
        int anoAtual = Integer.parseInt(String.valueOf(dataAtual.getYear()));

        return anoAtual-anoNascimento;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public Double getPeso(){
        return this.peso;
    }

    public boolean getHasChip(){
        return this.hasChip;
    }

    public boolean encaminharAdocao(){
        return this.isFerido == false && this.peso > 5.0;
    }
}