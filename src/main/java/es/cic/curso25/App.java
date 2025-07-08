package es.cic.curso25;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Con los números 10 y 5:");
        System.out.println("Suma: " + suma(10, 5));
        System.out.println("Resta: " + resta(10, 5));
        System.out.println("Multiplica: " + multiplica(10, 5));
        System.out.println("Divide: " + divide(10, 5));
        
    }

    public static int suma(int a, int b){
            return  (a+b);
        }

        public static int resta(int a, int b){
            return  (a-b);
        }

        public static int multiplica(int a, int b){
            return  (a*b);
        }

        public static int divide(int a, int b){
            return  (a/b);
        }
}
