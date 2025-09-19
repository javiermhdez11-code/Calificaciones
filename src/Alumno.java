public class Alumno {
    private String nombre; //Almacena el nombre del participante
    private int [] calificaciones; //Array que almacena las calificaciones del alumno

    //Constructor que se usara para crear un objeto de tipo alumno
    public Alumno(String nombre, int [] calificaciones){
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    //Metodo para calcular promedio
    public double calcularPromedio(){
        int suma = 0;
        for (int cal: calificaciones){
            suma += cal;
        }
        return (double) suma / calificaciones.length;
    }

    //Método para obtener la calificación final usando switch
    public char obtenerCalificaciones(double promedio){
        int rango = (int) promedio / 10; //Dividimos entre 10 para usar switch

        char calificacion;
        switch (rango){
            case 10: // Promedio = 100
            case 9: calificacion = 'A'; break;
            case 8: calificacion = 'B'; break;
            case 7: calificacion = 'C'; break;
            case 6: calificacion = 'D'; break;
            case 5: calificacion = 'E'; break;
            default:calificacion = 'F'; break;

        }
        return calificacion;
    }

    //Método para imprimir los resultados
    public void imprimirResultados(){
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificaciones(promedio);

        System.out.println("\nNombre del estudiante: "+ nombre);
        System.out.println("");
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("");
        System.out.println("Promedio: "+ promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
}
