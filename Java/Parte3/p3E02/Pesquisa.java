package P3.p3E02;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Pesquisa {

    private static int sequencia;
    private  int numPesquisa;
    private char sexo;
    private char resposta;

    public Pesquisa() {}

    public Pesquisa(char sexo, char resposta) {
        this.numPesquisa = ++sequencia;
        this.sexo = sexo;
        this.resposta = resposta;
    }

    public int getNumPesquisa() {
        return numPesquisa;
    }

    public void setNumPesquisa(int numPesquisa) {
        this.numPesquisa = numPesquisa;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getResposta() {
        return resposta;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }

    public  void imprimePesquisa() {
        System.out.println("Pesquisa: " + this.numPesquisa);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Resposta: " + this.resposta + "\n");
    }
}
