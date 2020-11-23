import java.util.Random;

public class Profesor extends Thread{
    EmpiezaEXAM examinateputo = new EmpiezaEXAM();
    @Override
    public void run() {
        try {
            sleep(10000);
            System.out.println("--------------------\nEl profesor empieza a entregar el examen:\n--------------------");
            examinateputo.notifyatos();
            sleep(5000);
            System.out.println("--------------------\nEl profesor empieza a recoger el exámen:\n--------------------");
            examinateputo.notifyatos();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notifica(Alumno ej) throws InterruptedException {
        examinateputo.recibenoti(ej);
    }

    public void notifica2(Alumno ej) throws InterruptedException {
        examinateputo.recibenoty2(ej);
    }
}
