package BocaDeFumo;

public class Main {
    public static void main(String[] args) {

        Funcionarios baiano = new Adms("Clebinho",17,"94428922",2000.00,50000.00);
        Funcionarios Diego = new Vendedores("Diego",21,"91823981",1500.00,200.00);
        BocaDeFumo Boqueirao = new BocaDeFumo("Morro do Alemão","Drogas em geral","Sempre aberto","157190");
        Fornecedores Primos = new Fornecedores("PrimosLTDA","988997879","Drogas ilicitas",200.00);
        Usuario Michel = new Usuario("Michel Nunes",26,"915652678",4,true);



        System.out.println("Vulgo: "+baiano.getVulgo());
        System.out.println("Salario: "+baiano.getSalario());
        System.out.println("Idade: "+Diego.getIdade());

        System.out.println("ond q fica a boca baiano? :" +Boqueirao.getLocal());


        Michel.calcFrequencia(4);
        Michel.divida(true);

    }
}
