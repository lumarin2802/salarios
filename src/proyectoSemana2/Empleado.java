package proyectoSemana2;

//Aqui tenemos la clase Empleado con sus atributos
public class Empleado {
    private String nombre;
    private String apellido;
    private int numeroBps;
    private int numeroFuncionario;
    private String direccion;
    private String telefono;

    //Creamos un constructor que recibe todos los atributos como parámetro

    public Empleado(String nombre, String apellido, int numeroBps, int numeroFuncionario, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroBps = numeroBps;
        this.numeroFuncionario = numeroFuncionario;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Definimos getters y setters necesarios

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroBps() {
        return numeroBps;
    }

    public void setNumeroBps(int numeroBps) {
        this.numeroBps = numeroBps;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
