package Generico;

public class TestaGenerico {
    public static void main(String[] args) {
            Quadrado<Integer> qi = new Quadrado<Integer>(2);
        Quadrado<Float> qf = new Quadrado<Float>(2.0f);
        Quadrado<Double> qd = new Quadrado<Double>(2.0);
        Quadrado<String> qs = new Quadrado<String>("dois");
        imprimeLado(qi);
        imprimeLado(qf);
        imprimeLado(qd);
        imprimeLado(qs);
    }

    public static <T> void imprimeLado(Quadrado<T> q){
        System.out.println("Lado = "+ q.getlado());
    }
}
