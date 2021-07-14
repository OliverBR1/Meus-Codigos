package Generico;

public class Quadrado <T>{
    private T lado;
    public Quadrado (T lado) {this.lado = lado; }
    public T getlado() {return lado;}
    public void setlado(T lado) {this.lado = lado;}
}
