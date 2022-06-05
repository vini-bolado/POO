package Forca;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        int vida = 5;
        GuardaPalavra palavraGuardada = new GuardaPalavra();
        String palavra = palavraGuardada.getPalavraAleatorio().toLowerCase();
        char[] palavraDecifrada = palavraGuardada.getPalavraDecifrada(palavra);
        boolean palavraEncontrada = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo da Forca!!");

        while(vida > 0 && palavraEncontrada == false ) {
            char letra = scan.next().toLowerCase().charAt(0);
            boolean acertou = false;
            System.out.println("A palavra é: " + String.valueOf(palavraDecifrada));
            System.out.println("Sua vida atual é: " + vida);
            System.out.println("Digite uma Letra: ");

            for(int i = 0; i < palavra.length(); i++) {
                if(palavra.charAt(i) == letra) {
                    palavraDecifrada[i] = letra;
                    acertou = true;
                }
            }

            if (acertou == false) {
                vida--;
            }

            if(palavra.equals(String.valueOf(palavraDecifrada))) {
                palavraEncontrada = true;
            }
        }

        if(palavraEncontrada == true) {
            System.out.println("Parabéns você ganhou!!");
        } else {
            System.out.println("Que pena você perdeu!! A Palavra era: " + palavra);
        }

        System.out.println("Aperte qualquer tecla para SAIR");
        System.in.read();

    }

}

