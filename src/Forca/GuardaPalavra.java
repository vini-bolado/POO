package Forca;


import java.util.Random;

public class GuardaPalavra {
        String[] palavras = {"carro", "batismo", "porta", "batman", "aquaman", "mutantes", "mario", "yoshi", "cogumelo", "personalidade"};
        Random aleatorio = new Random();
        int numero = 10;
        int numeroAleatorio = aleatorio.nextInt(numero);

        public String getPalavraAleatorio() {
            return palavras[numeroAleatorio].toString();
        }

        public char[] getPalavraDecifrada(String palavra) {
            char[] palavraDecifrada = new char[palavra.length()];
            for(int i = 0; i < palavra.length(); i++){
                palavraDecifrada[i] = '_';
            }
            return palavraDecifrada;
        }
    }


