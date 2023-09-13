package proyectoSemana2;

//Aqui definimos empleado mensual que es una subclase de empleado
public class EmpMensual extends Empleado{
    private double salarioMensual;
    private String tipoRegimen;

    //Creamos el constructor que recibe todos los atributos como parámetros incluso los de la clase padre Empleado.
    public EmpMensual(String nombre, String apellido, int numeroBps, int numeroFuncionario, String direccion, String telefono, double salarioMensual, String tipoRegimen) {
        // Llama al constructor de la clase padre Empleado para inicializar sus atributos
        super(nombre, apellido, numeroBps, numeroFuncionario, direccion, telefono);
        this.salarioMensual = salarioMensual;
        this.tipoRegimen = tipoRegimen;
    }

    //Definimos getters y setters necesarios

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getTipoRegimen() {
        return tipoRegimen;
    }

    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }
}
