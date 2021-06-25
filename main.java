import java.util.Scanner;
public class main {
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Por favor ingrese su nombre: ");

        String nombre = sc.nextLine(); 
        
        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su apellido: ");

        String apellido = sc.nextLine(); 
        
        System.out.println("Por favor ingrese su hobbie: ");
        
        String hobbie = sc.nextLine(); 
        
        System.out.println("Por favor ingrese su editor de codigo preferido: ");
        
        String editor = sc.nextLine(); 
        
        System.out.println("Por favor ingrese cual sistema operativo utiliza: ");
        
        String sistema = sc.nextLine(); 
        
        System.out.println("Por favor ingrese su edad: ");
        
        int edad = sc.nextInt();     
        

        System.out.println("Gracias " + nombre + " " + apellido + ".");
        System.out.println("Su hobbie es " + hobbie + ". " + "Su editor de codigo preferido es " +
                editor + ". ");
        System.out.println("El sistema operativo que utiliza es "+ sistema + ". " + "Su edad es " + edad + " años.");
    }
}

        