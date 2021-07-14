package P3.p3E01;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Pessoa {

        private int idPessoa;
        private String nomePessoa;
        private double alturaPessoa;


        Pessoa(int id, String nome, double altura){
            this.idPessoa = id;
            this.nomePessoa = nome;
            this.alturaPessoa = altura;
        }

        public void setIdPessoa(int id) {
            this.idPessoa = id;
        }

        public void setNomePessoa(String nome) {
            this.nomePessoa = nome;
        }

        public int getIdPessoa() {
            return idPessoa;
        }

        public String getNomePessoa() {
            return nomePessoa;
        }
        public double getAlturaPessoa() {
            return alturaPessoa;
        }

}
