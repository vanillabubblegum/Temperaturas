package temperaturasfamilias;
import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
    Scanner entrada=new Scanner(System.in);
    String Nombre;
    String Parentesco;
    int Edad;
    ArrayList<Float> Temperaturas=new ArrayList<>();

    public Persona(String Nombre, String Parentesco, int Edad) {
        this.Nombre = Nombre;
        this.Parentesco = Parentesco;
        this.Edad = Edad;
    }
    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }
    public void agragartemperaturas()
    {
        short Ntemp;
        System.out.println("digite la cantidad de temperaturas a agregar");
        Ntemp=entrada.nextShort();
        for(int i=0;i<Ntemp;i++)
        {
            Float tempEntrada;
            System.out.println("digite la temperatura "+(i+1));
            tempEntrada=entrada.nextFloat();
            Temperaturas.add(tempEntrada);
        }
    }
}








