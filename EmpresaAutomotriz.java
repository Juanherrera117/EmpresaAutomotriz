package modelo;

import vista.PanelResultados;
import java.util.ArrayList;

public class EmpresaAutomotriz 
{
    private ArrayList<Carro> carrosVendidos;
    private Empleado[] empleados = new Empleado[10];

    public EmpresaAutomotriz(Empleado[] empleados) //Constructor de EMpresaAutomotriz
    {
        this.empleados = empleados;
    }

    public EmpresaAutomotriz()
    {
        this.empleados = null;
    }

    public Empleado[] getEmpleados()
    {
        return this.empleados;
    }

    public void setEmpleados(Empleado[] empleados)
    {
        this.empleados = empleados;
    }

    public String toString()
    {
        return "\nDATOS DEL CARRO: \nNombre: " + empleados + "\nVentas: ";
    }

}
