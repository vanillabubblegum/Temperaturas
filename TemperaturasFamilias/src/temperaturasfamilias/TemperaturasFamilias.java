package temperaturasfamilias;
import java.util.ArrayList;
import java.util.Scanner;
public class TemperaturasFamilias {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short caso=0,tamañolista=0;
        ArrayList<Persona> familia=new ArrayList<>();
        while(caso!=4)
        {
        String nombre,parentesco;
        int edad,CantT=0;
        Float temperatura;
        System.out.println("*********Menu************");
        System.out.println("1.Registrar nueva persona");
        System.out.println("2.Registrar temperatura");
        System.out.println("3.Generrar reporte");
        System.out.println("4.Cerrar programa");
        caso=entrada.nextShort();
        switch(caso)
        {
            case 1:
                System.out.println("digite el nombre de la persona");
                nombre=entrada.next();
                System.out.println("digite el parentesco");
                parentesco=entrada.next();
                System.out.println("digte la edad");
                edad=entrada.nextInt();
                familia.add(new Persona(nombre,parentesco,edad));
                tamañolista++;
                familia.get((familia.size()-1)).agragartemperaturas();
                break;
            case 2:
                short Npersona;
                System.out.println("las personas registradas son:");
                for(int i=0;i<familia.size();i++)
                {
                    System.out.println((i+1)+"."+familia.get(i).Nombre);
                }
                System.out.println("\n");
                System.out.println("digite el numero de quien quiere agregar una emperatura");
                Npersona=entrada.nextShort();
                familia.get((Npersona-1)).agragartemperaturas();
                break;
            case 3:
                String nombreReport;
                boolean estara = false;
                int indice=0;
                System.out.println("digite el nombre de la persona de quien quiere el reporte");
                nombreReport=entrada.next();
                for(int i=0;i<familia.size();i++)
                {
                    if(nombreReport.equals(familia.get(i).Nombre))
                    {
                        estara=true;
                        indice=i;
                    }
                }
                if(estara==true)
                {
                    int largo=familia.get(indice).Temperaturas.size();
                    System.out.println("nombre:"+familia.get(indice).Nombre);
                    System.out.println("edad:"+familia.get(indice).Edad);
                    System.out.println("parentesco:"+familia.get(indice).Parentesco);
                    for(int i=0;i<largo;i++)
                    {
                        System.out.println(familia.get(indice).Temperaturas.get(i));
                    }
                }else
                {
                    System.out.println("la persona no se encuentra");
                }
                break;
            case 4:
                break;
            default: System.out.println("la opcion ingresada no esta en el menu");
            }
        }
    }
    
}
