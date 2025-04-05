import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;
        int opt = 0;

        while (bandera) {

            System.out.println("Welcome fries structures");
            System.out.println("What you want to eat?");
            System.out.println("1. Hot dog");
            System.out.println("2. Burger");
            System.out.println("3. Chirizo");
            System.out.println("4. French fries");
            System.out.println("5. Salir");

            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida");
                sc.next();
            }
                
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 6) {
                System.out.println("Please enter a number between 1 and 5");
                continue;
                
            }
            switch (opt) {
                case 1:

                System.out.println("Pagina en mantenimiento");
                    
                    break;
                case 2:
                System.out.println("Pagina en mantenimiento");
                    
                    break;
                case 3:
                System.out.println("Pagina en mantenimiento");
                    
                    break;
                case 4:
                System.out.println("Pagina en mantenimiento");
                    break;
                case 5:
                System.out.println("Pagina en mantenimiento");
                    break;
                default:

                System.out.println("Chao");
                bandera = false;
                    break;
            }


        }


    }
}
