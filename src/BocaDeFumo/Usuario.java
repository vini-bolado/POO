package BocaDeFumo;

public class Usuario {

    private String usuario;

    private int idade;

    private String telefone;

    private int frequencia;

    private Boolean divida;

    public Usuario(String usuario, int idade, String telefone, int frequencia, Boolean divida) {
        this.usuario = usuario;
        this.idade = idade;
        this.telefone = telefone;
        this.frequencia = frequencia;
        this.divida = divida;
    }

    public void calcFrequencia(int frequencia){
        if(this.frequencia > 3){

            System.out.println("viciado");

        }else{

            System.out.println("Opa n é viciado");
        }
    }

    public  void divida(Boolean divida){

        if(this.divida == true){

            System.out.println("vc n pode comprar, ta devendo!");


        }else{

            System.out.println("Pode comprar, ta suave!");

        }

    }





    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public Boolean getDivida() {
        return divida;
    }

    public void setDivida(Boolean divida) {
        this.divida = divida;
    }
}
