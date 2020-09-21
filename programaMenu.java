import java.util.Scanner;



public class programaMenu {
    public static void main(String[] args) {
        int user = 0;
        int dni = 0;
        String name = "";
        String surname = "";
        int age = 0;
        String adress = "";
        int phone = 0;
        boolean children = true;

        Scanner pepito = new Scanner(System.in);
        while (user!=3){
        System.out.println("Empresa MiEmpresa - Ingreso de Empleados\n1- Ingresar Empleado\n2- Mostrar datos y beneficio de asignación familiar\n3- Salir");
        user = pepito.nextInt();

        switch (user){
        case 1:
            System.out.println("Ingrese DNI: ");
            dni = pepito.nextInt();
            System.out.println("Ingrese el nombre: ");
            name = pepito.next();
            System.out.println("Ingrese el apellido: ");
            surname = pepito.next();
            System.out.println("Ingrese la edad: ");
            age = pepito.nextInt();
            System.out.println("Ingrese el teléfono de contacto: ");
            phone = pepito.nextInt();
            System.out.println("Ingrese la dirección: ");
            adress = pepito.next();
            System.out.println("Tiene hijos? insertar true o false");
            children=pepito.nextBoolean();
            break;
        case 2:
            System.out.print("\n\n\nEl empleado de nombre "+name+surname+" y dni "+dni+", con "+age+" años, teléfono "+phone+" y dirección "+adress);
            if (children){
            System.out.println(" le corresponde asignación familiar\n\n\n");
            }else{
                System.out.println(" no tiene hijos\n\n\n");
            }
            break;
        default:
            System.out.println("Chau");
        }}

    }
}