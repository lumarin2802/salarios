package proyectoSemana2;

import java.util.LinkedList;

//Aqui tenemos la clase Sucursal y sus atributos
public class Sucursal {
    private String nombre;
    private int id;
    private String direccion;
    private String telefono;
    private String rut;
    //Lista de empleados
    public LinkedList<Empleado> empleados = new LinkedList<Empleado>();



    //Definimos el constructor

    public Sucursal(String nombre, int id, String direccion, String telefono, String rut ) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rut = rut;

    }

    //Definimos getters y setters necesarios

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRut() {
        return rut;
    }



    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }


}
