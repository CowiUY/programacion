import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Su saldo acutual es "+CuentaCorriente.saldo);

            

        System.out.println("Introduzca el monto a depositar");

        CuentaCorriente.Depositar(teclado.nextDouble());


        System.out.println(CuentaCorriente.saldo);

    }
}
