public class ClaseExam {
    public  ClaseExam()throws InterruptedException {
        Profesor carlos = new Profesor();
        carlos.start();
        for (int i=0;i<5;i++){
            Alumno alumnoej = new Alumno(carlos);
            alumnoej.setName("Alumno "+i);
            alumnoej.start();
        }
    }
}
