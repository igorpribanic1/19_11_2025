public class DijeljenjeSNulom {
    public static void main(String[] args) {
        int x = 9;
        int y = 0;

        try {
            int rezultat = x / y;
            System.out.println(rezultat);
        } catch (Throwable e) {
            System.err.println("Iznimka: " + e.getMessage()); // Ispis poruke crvenom bojom na konzoli - "err" je odgovoran za to
        } finally {
            System.out.println("Kraj programa");
        }
    }
}
