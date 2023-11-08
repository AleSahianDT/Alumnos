import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Luis", "Perez", 29));
        listaAlumnos.add(new Alumno("Ana", "Lopez", 29));
        listaAlumnos.add(new Alumno("Pablo", "Garcia", 29));
        listaAlumnos.add(new Alumno("Marco", "Almeida", 29));
        listaAlumnos.add(new Alumno("Juan", "Gomez", 29));

        // Comparador
        Comparator<Alumno> comparadorNombre = Comparator.comparing(Alumno::getNombre);

        //Ordena
        Collections.sort(listaAlumnos, comparadorNombre);

        //Imprime
        /*for (Alumno alumno : listaAlumnos){
            System.out.println("El nombre del alumno es: "+alumno.getNombre());
            System.out.println("El apellido del alumno es: "+alumno.getApellido());
            System.out.println("La edad del alumno es: "+alumno.getEdad());
            System.out.println("---------------------------------------");
        }*/

        Scanner scanner = new Scanner((System.in));
        System.out.println("Ingrese el apellido del alumno que desea encontrar: ");
        String apellido1 = scanner.next();

        Alumno alumno1 = (Alumno)listaAlumnos.stream()
                .filter(x -> x.getApellido().equals(apellido1))
                .findAny()
                .orElseThrow();
        for (Alumno alumno : listaAlumnos){
            System.out.println("El nombre del alumno es: "+alumno.getNombre());
            System.out.println("El apellido del alumno es: "+alumno.getApellido());
            System.out.println("La edad del alumno es: "+alumno.getEdad());
            System.out.println("---------------------------------------");
        }
    }
}
