package Funcionario;

public class Assistente extends Funcionario {


    private int numeroMatricula;


    public Assistente(String nome, Double salario) {
        super(nome, salario);
    }


    @Override
    public void addAumento(Double valor) {

    }

    @Override
    public Double ganhoAnual() {
        return null;
    }

    @Override
    public void exibeDados() {
        System.out.println(getNome() + getSalario());
    }


}
