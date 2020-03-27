package temperaturasfamilias;
import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
    Scanner entrada=new Scanner(System.in);
    String Nombre;
    String Parentesco;
    short Edad;
    ArrayList<Float> Temperaturas=new ArrayList<>();

    public Persona(String Nombre, String Parentesco, short Edad) {
        this.Nombre = Nombre;
        this.Parentesco = Parentesco;
        this.Edad = Edad;
    }
    public void agragartemperaturas()
    {
        short Ntemp;
        System.out.println("digite la cantidad de temperaturas a agregar");
        Ntemp=entrada.nextShort();
        for(int i=0;i<Ntemp;i++)
        {
            Float tempEntrada;
            System.out.println("digite la temperatura"+(i+1));
            tempEntrada=entrada.nextFloat();
            Temperaturas.add(tempEntrada);
        }
    }
    public void agregartemperaturas(Float T1)
    {
        Temperaturas.add(T1);
    }
}








