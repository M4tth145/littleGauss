public class GaussFormula {
    public static void main (String[] args) {
        System.out.println(berechneKG(10)); //Zahl ändern 
    }
    
    public static int berechneKG (int n) {
        // Eingaben < 0 abgefangen lassen. Mit negativen Zahlen rechnet man nicht.
        if (n < 0) {
            System.out.println("Die Zahl ist negativ.")
            return 0;
        }
        int summe = (n*(n+1))/2;  // Das Ergebnis, das zurückgegeben wird
        return summe;
    }
}
