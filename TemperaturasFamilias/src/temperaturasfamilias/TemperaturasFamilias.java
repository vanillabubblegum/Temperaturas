package temperaturasfamilias;
import java.util.ArrayList;
import java.util.Scanner;
public class TemperaturasFamilias {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short caso=0;
        ArrayList<Persona> familia=new ArrayList<>();
        while(caso!=4)
        {
        String nombre,parentesco;
        short edad,CantT=0;
        Float temperatura;
        System.out.println("*********Menu************");
        System.out.println("1.Registrar nueva persona");
        System.out.println("2.Registrar temperatura");
        System.out.println("3.Generrar reporte");
        System.out.println("4.Cerrar programa");
        switch(caso)
        {
            case 1:
                System.out.println("digite el nombre de la persona");
                nombre=entrada.nextLine();
                System.out.println("digite el parentesco");
                parentesco=entrada.nextLine();
                System.out.println("digte la edad");
                edad=entrada.nextShort();
                familia.add(new Persona(nombre,parentesco,edad));
                familia.get(familia.size()).agragartemperaturas();
            case 2:
                short Npersona;
                System.out.println("las personas registradas son:");
                for(int i=0;i<familia.size();i++)
                {
                    System.out.println((i+1)+familia.get(i).Nombre);
                }
                System.out.println("\n");
                System.out.println("digite el numero de quien quiere agregar una emperatura");
                Npersona=entrada.nextShort();
                System.out.println("digite la temperatura:");
                temperatura=entrada.nextFloat();
                familia.get((Npersona-1)).agregartemperaturas(temperatura);
            case 3:
                
                
            default: System.out.println("la opcion ingresada no esta en el menu");
        }
        
        
        }
    }
    
}
