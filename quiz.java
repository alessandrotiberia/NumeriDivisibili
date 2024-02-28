public class quiz{
public static void main(String[] args) {
//scrivere programa per stampare numeri 1 a 100 divisibili per 3 e 5. 

        System.out.println("numeri divisibili per 5:");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) { // divisibile per 5
                System.out.println(i);
            }
        }

        System.out.println("numeri divisibili per 3:");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) { // divisibile per 3
                System.out.println(i);
            }
        }

        System.out.println("numeri divisibili per 3 e 5:");
        for (int i = 1; i <= 100; i++) {
            boolean divTre = false; // inizializzazione delle variabili booleane
            boolean divCinque = false;
            if (i % 3 == 0) {
                divTre = true;
            }
            if (i % 5 == 0) {
                divCinque = true;
            }
            if (divTre && divCinque) {
                System.out.println(i);
            }
        }
    }
}

