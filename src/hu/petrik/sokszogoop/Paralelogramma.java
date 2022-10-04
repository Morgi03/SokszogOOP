package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog{
    private double b;

    public Paralelogramma(double a, double b) {
        super(a);
        this.b = b;
    }

    public Paralelogramma(){

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet(){
    return 2*(this.getA() + this.b);
    }

    public double getTerulet(){

    }

    @Override
    public String toString() {
        return "Paralelogramma{}";
    }
}
