import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de P3: ");
        String nombre3 = sc.nextLine();
        System.out.print("Ingrese el apellido de P3: ");
        String apellido3 = sc.nextLine();
        System.out.print("Ingrese la edad de P3: ");
        int edad3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el telefono de P3: ");
        String telefono3 = sc.nextLine();
        System.out.print("Ingrese el correo de p3: ");
        String correo3 = sc.nextLine();
        System.out.print("Ingrese la nacionalidad de P3: ");
        String nacionalidad3 = sc.nextLine();
        System.out.print("Ingrese la condicion socioeconomica de P3(alta o baja): ");
        String condicion3 = sc.nextLine();
        System.out.print("Ingrese la carrera de P3: ");
        String carrera3 = sc.nextLine();
        System.out.print("Ingrese el promedio de P3: ");
        double promedio3 = sc.nextDouble();

        Postulante p1 = new Postulante("Xavier","Guanoluisa");
        Postulante p3 = new Postulante(nombre3,apellido3,edad3,telefono3,correo3,nacionalidad3,condicion3,carrera3,promedio3);

        p3.mostrarDatos();
        p1.mostrarDatos();

        System.out.print("\n---Postulante actualizado---\n");
        p3.setEdad(20);
        p3.setCarrera("Medicina");
        p3.mostrarDatos();
    }


}