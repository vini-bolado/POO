package CACHORRO;

import java.time.LocalDate;

public class ObjetoCACHORRO {
    public static void main(String[] args) {
        CACHORRO cao1 = new CACHORRO("Rex", "Vira-lata", LocalDate.of(2005, 5, 1), 6.2, true, false, true);
        CACHORRO cao2 = new CACHORRO("Amarelin", "Pincher", LocalDate.of(2010, 3, 1), 4.1, false, false, true);

        System.out.println("Nome: "+cao1.getNome());
        System.out.println("Raça: "+cao1.getRaca());
        System.out.println("Idade: "+cao1.getIdade());
        System.out.println("Peso: "+cao1.getPeso());
        System.out.println("Tem chip: "+cao1.getHasChip());
        System.out.println("Pode ir para adoção? "+cao1.encaminharAdocao());

        System.out.println("=============================");

        System.out.println("Nome: "+cao2.getNome());
        System.out.println("Raça: "+cao2.getRaca());
        System.out.println("Idade: "+cao2.getIdade());
        System.out.println("Peso: "+cao2.getPeso());
        System.out.println("Tem chip: "+cao2.getHasChip());
        System.out.println("Pode ir para adoção? "+cao2.encaminharAdocao());

    }
}
