/*
 *
 */

// Paquete principal
package geometria;

// Superclase Formas
public abstract class Formas {
    protected String color;

    public Formas(String color) {
        this.color = color;
    }

    public abstract void dibujar();
    public abstract double area();
    public abstract double perimetro();
}

// Subclase Circulo
class Circulo extends Formas {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + color + ".");
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

// Subclase Cuadrado
class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + color + ".");
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
}

// Subclase Triangulo
class Triangulo extends Formas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de color " + color + ".");
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        // Asumimos un triángulo equilátero para simplificar.
        return 3 * base;
    }
}

// Subclase Rectangulo
class Rectangulo extends Formas {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto, String color) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de color " + color + ".");
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Formas[] figuras = new Formas[]{
            new Circulo(5, "rojo"),
            new Cuadrado(4, "verde"),
            new Triangulo(3, 6, "azul"),
            new Rectangulo(4, 8, "amarillo")
        };

        for (Formas figura : figuras) {
            figura.dibujar();
            System.out.println("Área: " + figura.area());
            System.out.println("Perímetro: " + figura.perimetro());
            System.out.println();
        }
    }
}
