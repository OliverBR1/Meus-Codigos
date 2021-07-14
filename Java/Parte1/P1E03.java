public class P1E03 {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = celsius * 1.8 +32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;

        System.out.println(celsius + " graus celsius convertidos para fahrenheit são " + fahrenheit);
        System.out.println(celsius + " graus celsius convertidos para kelvin são " + kelvin);
        System.out.println(celsius + " graus celsius convertidos para reaumur são " + reaumur);
        System.out.println(celsius + " graus celsius convertidos para rankine são " + rankine);
    }
}
