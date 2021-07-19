public class CuentaCorriente {
    static double saldo = 0;

    
    public static void Depositar(double deposito){
        saldo = saldo+deposito;

    }




    public static boolean Retirar(double retiro){
        if(CuentaCorriente.saldo >= retiro){
            saldo -= retiro;
            return true;
        }
        else return false;
    }
}
