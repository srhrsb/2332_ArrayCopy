import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a= {2,4,8};
        int[] b= a; //b ist kein neues Array, es verweist auf die gleiche Speicherstelle
        System.out.print(Arrays.toString(b));
        a[1] = 6;
        System.out.print(Arrays.toString(b));//b wurde verändert, als a verändert wurde

        //Wenn wirklich eine Kopie erforderlich ist, dann die Methode Copy von Array verwenden:
        int[] c= {1,5,6};
        int[] d = Arrays.copyOf(c, c.length);

        System.out.print(Arrays.toString(d));
        c[1] = 9;
        System.out.print(Arrays.toString(d)); //obwohl c verändert d bleibt unverändert
    }
}