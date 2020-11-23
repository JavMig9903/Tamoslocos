import java.util.Random;

public class Alumno extends Thread{
    Profesor contesta;

    public Alumno(Profesor contesta) {
        this.contesta = contesta;
    }

    @Override
    public void run() {
        try {
            Random rand = new Random ();
            int ejemplo = rand.nextInt(4000);
            sleep(ejemplo);
            System.out.println(getName()+" ha llegau");
            System.out.println("Puedo hacer el examen no como Nestor");
            contesta.notifica(this);
            contesta.notifica2(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
