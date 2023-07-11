package Ejercicios.Ejercicio4;

interface CalculosFormas {

    double PI = 3.1416; // Valor de PI como constante

    double calcularArea();

    double calcularPerimetro();
}

class Circulo implements CalculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return PI * radio * 2;
    }
}

class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}

public class Ejercicio4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 8.0);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("Rectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }

}
