package modelo;

import vista.PanelResultados;
import java.util.ArrayList;

public class Empleado 
{
    public static final int SALARIO_MINIMO = 1000000;
    public static final int COMISION_VENTA = 100000;
    private String nombre;
    private ArrayList<Carro> carrosVendidos;    //Lista de carros

    public Empleado(String nombre, ArrayList<Carro> carrosVendidos)  //Contructor Empleado, que tiene como parametros el nombre y las ventas del empleado
    {
        this.nombre = nombre; //Para construir un empleado se necesita el nombre del empleado
        this.carrosVendidos = carrosVendidos; //Y también se neceistan las ventas del empleado
    }

    public Empleado() 
    {
        this.nombre = "";
        this.carrosVendidos = null;
    }

    public String getNombre()
    {
        return nombre;
    }

    public ArrayList<Carro> getCarros()
    {
        return this.carrosVendidos;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCarros(ArrayList<Carro> carrosVendidos)
    {
        this.carrosVendidos = carrosVendidos;
    }

    public static void calcularSalario(ArrayList<Carro> carrosVendidos)
    {
        int numeroVentas = carrosVendidos.size();  //Tamaño del array size
        double porcentajeVenta = 0;
        double sumatoria = 0;

        for (int i = 0; i < numeroVentas; i++) 
        {
                porcentajeVenta = carrosVendidos.get(i).getPrecio() * 0.02;
                sumatoria += porcentajeVenta;
        }
        double salario = SALARIO_MINIMO + (numeroVentas * COMISION_VENTA) + sumatoria;
        PanelResultados.mostrarResultados("El salario es de: " + salario);
    }

    public String toString()
    {
        return "\nDATOS DEL CARRO: \nNombre: " + nombre + "\nVentas: " + carrosVendidos;
    }
}
