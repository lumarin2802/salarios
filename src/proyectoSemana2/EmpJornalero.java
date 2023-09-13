package proyectoSemana2;

//Aqui tenemos a la clase EmpJornalero que es una subclase de Empleado
public class EmpJornalero extends Empleado{
    private double valorHora;
    private double horasRealizadas;

    //Creamos el constructor
    public EmpJornalero(String nombre, String apellido, int numeroBps, int numeroFuncionario, String direccion, String telefono, double valorHora, double horasRealizadas) {
        super(nombre, apellido, numeroBps, numeroFuncionario, direccion, telefono);
        this.valorHora = valorHora;
        this.horasRealizadas = horasRealizadas;
    }

    //DEfinimos los getter y setter necesarios

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasRealizadas() {
        return horasRealizadas;
    }

    public void setHorasRealizadas(double horasRealizadas) {
        this.horasRealizadas = horasRealizadas;
    }
    public double getSueldo() {
        return valorHora * horasRealizadas;
    }
}
