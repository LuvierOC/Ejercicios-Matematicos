public class Fibonacci {

    // El planteamiento del problema
    /*
     * considerando que la secuencia de fibonacci no exceda los 4 millones,
     * encontar la suma de sus numeros pares.
     */

    public static void main(String[] args) {

        int limite = 4_000_000;
        int numeroA = 1;
        int numeroB = 1;
        int sumatoriaPares = 0;

        while (numeroB <= limite){
           
            if (numeroB % 2 == 0) {
                System.out.println("Numero Par: " + numeroB);
                sumatoriaPares += numeroB;
            }

            // Actualizar numeros de fibonacci
            numeroB = numeroA + numeroB; // 1 + 1 ====== numeroB = 2

            numeroA = (numeroB - numeroA); // 2 - 1 ==== numeroA   = 1
        }
        System.out.println("Sumatoria pares: " + sumatoriaPares);
        System.out.printf("Sumatoria pares con f-strings: %d", sumatoriaPares);
    }
    
}
