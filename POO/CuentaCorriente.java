//  GABRIEL MOREIRA 2° BC
public class CuentaCorriente {
    static double saldo = 0;

    public static void Depositar(double deposito){
        saldo = saldo+deposito;

    }




    public static boolean Retirar(double retiro){
        //if(CuentaCorriente.saldo >= retiro){
            saldo -= retiro;
            if (saldo<0){
             saldo=0;
             return false;
            }
            
            return true;
    
    }
    }
