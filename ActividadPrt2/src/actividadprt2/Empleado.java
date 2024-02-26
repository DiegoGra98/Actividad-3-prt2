package actividadprt2;

public class Empleado {

    // Atributos
    public String codigoEmpleado;
    public String puesto;

    // Constructor
    public Empleado(String codigoEmpleado, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    // Métodos getter y setter para código de empleado
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    // Métodos getter y setter para puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("001", "Gerente de Ventas");

        // Acceder a los atributos del empleado
        System.out.println("Código de empleado: " + empleado1.getCodigoEmpleado());
        System.out.println("Puesto: " + empleado1.getPuesto());
    }
}
