public class Main {

    public static void main(String[] args) {
        System.out.println(suma(3,4,5));
        Coche nuevo = new Coche(0);
        nuevo.sumaPuerta();

    }
    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }

}
