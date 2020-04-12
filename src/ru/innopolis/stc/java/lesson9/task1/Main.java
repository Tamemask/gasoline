package ru.innopolis.stc.java.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        Bear b = new Bear();
        Unicorn u = new Unicorn();
        Duck d = new Duck();

        d.setName("Donald");
        b.setName("Fyodor");
        u.setName("Star");
        System.out.println("Let see names: " + d.getName() + " " + b.getName()
                + " " + u.getName());
        run(b, u, d);
        swim(b, u, d);
        fly(u, d);
    }

    static void run(Run b, Run u, Run d) {
        Run different[] = {b, u, d};

        for (Run s: different) {
            s.moveLegs();
        }
        System.out.println(" ");
    }

    static void swim(Swim b, Swim u, Swim d) {
        Swim different[] = {b, u, d};

        for (Swim s: different) {
            s.swimAsItCan();
        }
        System.out.println(" ");
    }

    static void fly (Fly ...f) {
        for (int i = f.length-1; i >= 0; i--){
            f[i].moveWings();
        }
        System.out.println(" ");
    }


}

