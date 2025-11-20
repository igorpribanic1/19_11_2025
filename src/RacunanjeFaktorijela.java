import java.util.Scanner;

public class RacunanjeFaktorijela {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Unesite broj za izračun faktorijela:");
            int broj = scanner.nextInt();

            if (broj < 0) {
                throw new IllegalArgumentException("Faktorijel nije definiran za negativne brojeve.");
            }

            long faktorijel = racunajFaktorijel(broj);
            System.out.println("Faktorijel broja " + broj + " je " + faktorijel);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Pogrešan unos. Unesite cijeli broj.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Rekurzivna metoda
    private static long racunajFaktorijel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * racunajFaktorijel(n - 1);
        }
    }
}