package electiva3;
import java.util.Scanner;

public class Usuario {
     public static void vizualizar(){
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        String correo = sc.nextLine();
        String direccion = sc.nextLine();
        long numero_telefono = sc.nextLong();

        System.out.println("su nombre es:" + nombre);
        System.out.println("su apellido es:" + apellido);
        System.out.println("su correo es:" + correo);
        System.out.println("su direccion es:" + direccion);
        System.out.println("su numero telefonico es:" + numero_telefono);
    }
}
