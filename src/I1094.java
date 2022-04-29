import java.util.Locale;
import java.util.Scanner;

public class I1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int N = input.nextInt();
        int cobaiasExp = 0;
        int contCoibaias = 0;
        int contS = 0, contR = 0, contC = 0;
        double porS, porR, porC;
        String cobaia;

        for (int i = 0; i < N; i++) {
            cobaiasExp = input.nextInt();
            contCoibaias += cobaiasExp;
            cobaia = input.next();
            if (cobaiasExp >= 1 && cobaiasExp <= 15) {
                if (cobaia.equalsIgnoreCase("S")) {
                    contS += cobaiasExp;
                } else if (cobaia.equalsIgnoreCase("R")) {
                    contR += cobaiasExp;
                } else if (cobaia.equalsIgnoreCase("C")) {
                    contC += cobaiasExp;
                }
            }
        }

        porC = contC / contCoibaias;
        porR = contR * 100 / contCoibaias;
        porS = contS * 100 / contCoibaias;

        System.out.println("Total: " + contCoibaias + " cobaias");
        System.out.println("Total de coelhos: " + contC);
        System.out.println("Total de ratos: " + contR);
        System.out.println("Total de sapos: " + contS);
        System.out.printf("Percentual de coelhos: %.2f %%", (double) contC * 100 / contCoibaias);
        System.out.printf("\nPercentual de ratos: %.2f %%", (double) contR * 100 / contCoibaias);
        System.out.printf("\nPercentual de sapos: %.2f %%\n", (double) contS * 100 / contCoibaias);    }
}

