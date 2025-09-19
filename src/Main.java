public class Main {
    public static void main(String[] args) {
        int [] calificaciones = {95,70, 85, 90, 90};
        String nombreEstudiante = "Javier Martínez";

        //Aqui hare un comentario en esta linea

        Alumno alumno = new Alumno(nombreEstudiante, calificaciones);
        alumno.imprimirResultados();
    }
}
