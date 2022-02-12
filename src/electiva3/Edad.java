package electiva3;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Edad {
    public static void vizualizar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número día nacimiento: ");
        int dia = teclado.nextInt();
        System.out.print("Numero mes nacimiento: ");
        int mes = teclado.nextInt();
        System.out.print("Año nacimiento: ");
        int anio = teclado.nextInt();
        System.out.println("\nTu edad es: " + calcularEdad(dia, mes, anio));
    }
    
    static int calcularEdad(int dia, int mes, int anio) {
	LocalDate fechaHoy = LocalDate.now();
	LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
	Period periodo = Period.between(fechaNacimiento, fechaHoy);
	return periodo.getYears();
    }
}
