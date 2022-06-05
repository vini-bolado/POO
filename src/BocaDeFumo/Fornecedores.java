package BocaDeFumo;

public class Fornecedores {

    private String name;
    private  String telefone;
    private String material;
    private Double frete;

    public Fornecedores(String name, String telefone, String material, Double frete) {
        this.name = name;
        this.telefone = telefone;
        this.material = material;
        this.frete = frete;
    }

    public void calcFrete(Double frete){
        frete = this.frete+5;

        System.out.println("Valor com frete " + this.frete);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }
}


