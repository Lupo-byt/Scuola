import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int x = factorial(7);
        System.out.println(x);

        String test1 = "anna";
        String test2 = "hello";

        System.out.println("\"" + test1 + "\" è palindromo? " + isPalindrome(test1)); // Output: true
        System.out.println("\"" + test2 + "\" è palindromo? " + isPalindrome(test2)); // Output: false

        int[] array = {1, 3, 4, 5, 6, 8, 9, 10, 11, 13, 14, 15, 17, 18, 19};
        int risultato = prodotto(array);
        System.out.println("Il prodotto è: " + risultato);

        BigInteger risultato1 = prodotto1(array);
        System.out.println("Il prodotto è: " + risultato1);
    }

    public static int factorial(int i) {
        int factorial;
        if (i == 0)
            factorial = 1;
        else
            factorial = i * factorial(i - 1);

        return factorial;
    }

    public static boolean isPalindrome(String str) {
        // Caso base 1: stringa vuota o con un solo carattere è palindroma
        if (str.length() <= 1) {
            return true;
        }

        // Confronta il primo e l'ultimo carattere
        if (str.charAt(0) != str.charAt(str.length() - 1))
            // Caso base 2: se non corrispondono, non è palindroma
            return false;
        else
            // Passo ricorsivo: rimuove i primi e gli ultimi caratteri e richiama il metodo
            return isPalindrome(str.substring(1, str.length() - 1));

    }
    public static int prodotto(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }
        return prodottoRic(arr, 0);
    }

    private static int prodottoRic(int[] arr, int index) {
        if (index == arr.length - 1) {
            // caso base: ultimo elemento → ritorna solo esso
            return arr[index];
        } else {
            // caso ricorsivo: elemento corrente * prodotto del resto
            return arr[index] * prodottoRic(arr, index + 1);
        }
    }

    public static BigInteger prodotto1(int[] arr) {
        if (arr == null || arr.length == 0) return BigInteger.ONE;
        return prodottoRic1(arr, 0);
    }

    private static BigInteger prodottoRic1(int[] arr, int index) {
        if (index == arr.length - 1) {
            return BigInteger.valueOf(arr[index]);
        }
        return BigInteger.valueOf(arr[index]).multiply(prodottoRic1(arr, index + 1));
    }
}