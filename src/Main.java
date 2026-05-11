import java.util.Scanner;


//Napišite program koji traži unos 7 vrijednosti godina i nakon toga ispisuje jesu li te godine prijestupne ili ne.
//Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.

public class Main {
    public void main(String[] args) {

        Scanner unosGodina = new Scanner(System.in);

        int[] godine = new int[7];

        System.out.println("Unesi 7 godina");

        for (int i = 0; i < 7; i++) {
            godine[i] = unosGodina.nextInt();
        }

        for (int j = 0; j < 7; j++) {
            if (godine[j] % 4 == 0 && godine[j] % 100 != 0) {
                System.out.println("godina "+ godine[j] + " je prijestupna ");
            } else if (godine[j] % 400 == 0) {
                System.out.println("godina "+ godine[j] + " je prijestupna ");
            } else {
                System.out.println("godina "+ godine[j] + " nije prijestupna ");
            }
        }
    }
}


