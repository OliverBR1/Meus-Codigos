package Coercao;

public class TestaCoercao {
    public static void main(String[] args) {
       double d = 3.14159;
       byte b = (byte) d;  // atribuição é da direita para esquerda
    }
}
