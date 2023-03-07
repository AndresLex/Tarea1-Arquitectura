package Principal;

public class Main {
    public static void main(String[] args) {

        Estudiante alumno = new Estudiante("Andres", "Zipaquira", "Ing Sistemas", 9);
        System.out.println("ESTUDIANTE\nNombre: "+alumno.getNombre()+"\n Carrera: "+alumno.getCarrera());
        Profesor profe = new Profesor("William", "Zipaquira", "Investigacion", "Senior");
        System.out.println("PROFESOR\nNombre: "+profe.getNombre()+"\n Departamento: "+ profe.getDepartamento());
    }
}