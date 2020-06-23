package exercises;

public class Erastotenes {

    private static void sieveOfEratosthenes(int n) {
        //tworzenie tablicy, która mówi o tym, czy liczba jest pierwsza czy nie
        //na początku zakładamy, że wszystkie liczby są pierwsze i będziemy je "odsiewać"
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        //pętla, która będzie przechodzić przez
        // musimy sprawdzać do P * P < n
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                //tylko w przypadku, gdy trzeba jeszcze sprawdzać to wykonujemy "wewnętrzną pętlę"
                //ta pętla bierze "następną liczbę" po sprawdzanej (p * 2) i wykreśla wszystkie podzielne przez nią (i+=p)
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // ...i wyświetlenie
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        sieveOfEratosthenes(10000000);
    }


}
