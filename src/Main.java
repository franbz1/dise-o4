import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese el titulo del video:");
        String titulo = input.nextLine();

        System.out.println("ingrese el precio del video:");
        double precio = input.nextDouble();

        System.out.println("ingrese la duracion en horas del video:");
        float duracion  = input.nextFloat();

        Video video = new Video(precio,titulo,duracion);

        System.out.println(video.toString());
        }

}