package Mesa_do_jogo;

public class Usuariojogo {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public Usuariojogo(String nome, String nickname, int pontuacao) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = pontuacao;
        this.nivel = nivel;


    }

    public void SubirNivel(Integer valor){

        this.nivel =+ valor;

        System.out.println("o nivel subiu para: " + this.nivel);


    }

    public void Pontuacao(Integer pontuacao){

        this.pontuacao = 0;

    }







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}


