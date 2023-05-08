package Ejercicios.Ejercicio4.Entidades;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (this.base * this.altura);
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
