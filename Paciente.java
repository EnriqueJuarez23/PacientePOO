public class Paciente {
    String nombre, apellido, enfermedad;
    int edad;
    double altura, peso;
    public void mostrarNombre(){
    System.out.println("Nombre del paciente: "+this.nombre);
    }
    public void mostrarApellido(){
    System.out.println("Apellido del paciente: "+this.apellido);
    }
    public void mostrarEdad(){
    System.out.println("Edad del paciente: "+this.edad);
    }
    public void mostrarAltura(){
    System.out.println("Altura del paciente: "+this.altura);
    }
    public void mostrarPeso(){
    System.out.println("Peso del paciente: "+this.peso);
    }
    public void mostrarEnfermedad(){
    System.out.println("Enfermedad del paciente: "+this.enfermedad);
    }
}