package BocaDeFumo;

public class Vendedores extends Funcionarios{

    private Double comissao;


    public Vendedores(String vulgo, int idade, String tel, Double salario, Double comissao) {
        super(vulgo, idade, tel, salario);
        this.comissao = comissao;
    }

    public void calcComissao(Double comissao ){



    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}
