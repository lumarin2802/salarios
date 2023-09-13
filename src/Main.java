import proyectoSemana2.EmpJornalero;
import proyectoSemana2.EmpMensual;
import proyectoSemana2.Sucursal;
import proyectoSemana2.Empleado;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Empleado> empleadosSuc = new LinkedList<Empleado>();
        //Aca creamos una nuevas instancias de Sucursal para almacenar info y detalles sobre las sucursales
        Sucursal suc1 = new Sucursal("Casa Central", 1, "Montevideo", "28082888", "259142368838");
        Sucursal suc2 = new Sucursal("Sucursal Durazno", 3, "Durazno", "25823698", "248648282536");

        //Creamos instancias de EmpJornalero y mensual con info sobre ellos
        EmpJornalero jornalero1 = new EmpJornalero("Juan", "Zabala", 328672, 68, "Durazno",
                "26223435", 215.5, 120);

        EmpJornalero jornalero2 = new EmpJornalero("Pedro", "Rosen", 669825, 30, "Montevideo",
                "29894334", 280, 100.5);

        EmpMensual mensual1 = new EmpMensual("Romina", "Paito", 333458, 50,"Durazno", "2528655",38000,"Comercial" );
        EmpMensual mensual2 = new EmpMensual("Lucas", "Manzi", 225698, 45, "Montevideo", "2887469", 38500,"Comercial");

        //agregamos las instancias creadas anteriormente a la lista de empleados, a la linkedlist empleadosSuc
        empleadosSuc.add(jornalero2);
        empleadosSuc.add(mensual2);
        empleadosSuc.add(jornalero1);
        empleadosSuc.add(mensual1);

        LinkedList<Empleado> sucursal1= suc1.empleados;
        LinkedList<Empleado> sucursal2= suc2.empleados;

        //Definimos variables para almacenar el total de los gastos en sueldos para cada Sucursal
        double sueldoSuc1 = 0;
        double sueldoSuc2 = 0;

        //aqui vamos a recorrer la lista de empleados de una sucursal, luego vamos a evaluar segun la direccion vamos a almacenar en variable suc1 o suc2
        // si se almacena en suc1 y su salario se suma al total de salarios de la sucursal 1
        //Si se trata de un jornalero debemos sumar su salario diario al total. Si es mensual sumamos su salario mensual al total
        //Caso la direccion del empleado no coincide con sucursal1 el empleados e agrega a la sucursal2  y se realiza la suma de la misma manera segun el tipo de trabajador

        //Este bucle lo que hace es recorrer la lista de empleados de las sucursales
        for (Empleado i: empleadosSuc ) {
            //Aqui lo que haremos es verificar si la direccion del empleado es igual a la dirección de la sucursal1, en caso afirmativo se agrega a la lisra de empleado de dicha sucursal.
            if(i.getDireccion()==suc1.getDireccion()){
                sucursal1.add(i);
                //Aqui lo que hacemos es verificar si el objeto i es una instancia de la clase EmpJornalero.
                //Luego llamamos el método getSueldo() de la instancia EmpJornalero para asi de esa forma obtener el salario del empleado y luego se agrega al total de sueldos de la sucursal, lo que se almacena en la variable sueldoSuc1
                if(i instanceof EmpJornalero) {
                    sueldoSuc1+=((EmpJornalero)i).getSueldo();
                }else {
                    //Aqui en el else lo que hace es en caso que no sea empleado jornalero es porque es mensual y suma el salario mensual de ese empleado al total de sueldos de la sucursal
                    sueldoSuc1 +=((EmpMensual)i).getSalarioMensual();
                }
            }else {
                //Si el usuario no pertenece a la sucursal1 significa que pertenece a la 2 y ahi lo agregamos a la lista de la sucursal2
                sucursal2.add(i);
                //aqui verificamos si el objeto i es una instancia de la clase EmpJornalero entonces se agrega su salario diario al total de sueldos. En caso de ser mensual se agrega su salario mensual al total de sueldos
                if(i instanceof EmpJornalero) {
                    sueldoSuc2+=((EmpJornalero)i).getSueldo();

                }else {
                    sueldoSuc2+=((EmpMensual)i).getSalarioMensual();
                }
            }
        }

        System.out.println("Gastos por conceptos de Sueldo Sucursal 1 "+sueldoSuc1);
        System.out.println("Gastos por conceptos de Sueldo Sucursal 2 "+sueldoSuc2);
        }
            }




