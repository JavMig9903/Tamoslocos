import java.util.Random;

import static java.lang.Thread.sleep;

public class EmpiezaEXAM {
    public synchronized void notifyatos(){
        notifyAll();
    }
    public synchronized void recibenoti(Alumno ej) throws InterruptedException {
        wait();
        Random rand = new Random ();
        sleep(rand.nextInt(2000));
        System.out.println("El alumno "+ej.getName()+" ha recibido el examen");
    }
    public synchronized void recibenoty2(Alumno ej) throws InterruptedException{
        wait();
        Random rand = new Random ();
        boolean apsus = rand.nextBoolean();
        if(apsus ==true)
            System.out.println("Le recojo el examen a "+ej.getName()+" y la nota es un APROBADO");
        else
            System.out.println("Le recojo el examen a "+ej.getName()+" y la nota es un SUSPENSO ");
    }
}
