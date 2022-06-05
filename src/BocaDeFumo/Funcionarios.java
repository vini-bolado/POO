package BocaDeFumo;

public class Funcionarios {

    private String vulgo;
    private int idade;
    private String tel;
    private Double salario;


    public Funcionarios(String vulgo, int idade, String tel, Double salario) {

        this.vulgo = vulgo;
        this.idade = idade;
        this.tel = tel;
        this.salario = salario;

    }


    public String getVulgo() {
        return vulgo;
    }

    public void setVulgo(String vulgo) {
        this.vulgo = vulgo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }
}
