import java.util.Scanner;
public class MainPaciente {
public static void main(String[] args){
Scanner p1 = new Scanner(System.in);
System.out.println("Nombre:");
String nombre=p1.next();
System.out.println("Apellido:");
String apellido=p1.next();
System.out.println("Edad:");
int edad=p1.nextInt();
System.out.println("Altura:");
double altura=p1.nextDouble();
System.out.println("Peso:");
double peso=p1.nextDouble();
System.out.println("Enfermedad:");
String enfermedad=p1.next();

Paciente paci1 = new Paciente();
paci1.nombre=nombre;
paci1.apellido=apellido;
paci1.edad=edad;
paci1.altura=altura;
paci1.peso=peso;
paci1.enfermedad=enfermedad;

paci1.mostrarNombre();
paci1.mostrarApellido();
paci1.mostrarEdad();
paci1.mostrarAltura();
paci1.mostrarPeso();
paci1.mostrarEnfermedad();
    }
}