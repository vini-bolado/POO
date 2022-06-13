package BocaDeFumo;

public class Adms extends Funcionarios {

    private Double dinheiroTotal;

    public Adms(String vulgo, int idade, String tel, Double salario, Double dinheiroTotal) {
        super(vulgo, idade, tel, salario);
        this.dinheiroTotal = dinheiroTotal;
    }




    public Double getDinheiroTotal() {
        return dinheiroTotal;
    }

    public void setDinheiroTotal(Double dinheiroTotal) {
        this.dinheiroTotal = dinheiroTotal;
    }

}
