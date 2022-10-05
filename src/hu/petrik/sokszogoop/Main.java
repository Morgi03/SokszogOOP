package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Háromszög teszt ---------------------------------------\n");
        for (int i = 0; i < 100; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        System.out.println("\nTéglalap teszt ---------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }
        System.out.println("\nParalelogramma teszt ---------------------------------------\n");
        for (int i = 0; i < 16; i++) {
            System.out.println(new Paralelogramma());
        }
    }
}
