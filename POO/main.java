//  GABRIEL MOREIRA 2° BC

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Su saldo acutual es "+CuentaCorriente.saldo);
        
        int accion = 0;
        
        while (accion != 4){

        System.out.println("1- Depositar Saldo\n"
                + "2- Mostrar Saldo\n"
                + "3- Retirar Saldo\n"
                + "4- Salir de este hermoso programa");
        accion = teclado.nextInt();
        
        

        switch(accion){
            case 1:
                
                System.out.print("\n\n\nIntroduzca el monto a depositar: ");
                CuentaCorriente.Depositar(teclado.nextDouble());
                System.out.print("\n");
                break;
                
            case 2:
                
                System.out.println("\n\n\nSu saldo actual es "+CuentaCorriente.saldo+"\n");
                break;
                
            case 3:
                
                System.out.print("\n\n\nIntroduzca el monto a retirar: ");
                if (CuentaCorriente.Retirar(teclado.nextDouble())){
                    System.out.println("Su saldo se retiró satisfactoriamente :)\n");
                }else{
                    System.out.println("Su saldo no era suficiente, pero nuestro generoso banco lo dejó en 0 :)\n");
                }
                //CuentaCorriente.Retirar(teclado.nextDouble());
                break;
                
        }
       }
        
        
        System.out.println("\nGracias por usar mi programa\nSu saldo final es "+CuentaCorriente.saldo);
        


        

    }
}
