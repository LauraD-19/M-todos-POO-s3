public class Main {
    public static void main(String[] args) {

        System.out.println("Estudiante 1:");
        Estudiante e1=new Estudiante("Laura", 2.0, 4.5, 3.5);
        e1.monstrarInfo();
        System.out.println("El promedio es: "+e1.calcularPromedio());
        System.out.println(e1.estaAprovado(3.0));
        System.out.println("\n"+ "Estudiante 2:");

        Estudiante e2=new Estudiante();
        e2.asignarNotas(2.3, 5.0, 1.0);
        e2.monstrarInfo();
        System.out.println(e2.calcularPromedio());
        System.out.println(e2.estaAprovado(3.0));
    }
}