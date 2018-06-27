package diningphilosophers;

public class DiningPhilosophers {
    
    static int numOfForks = 2;
    static boolean forkLift [] = {false, false};
    
    public static void main(String[] args) {
        /*Fork fork1 = new Fork();
        System.out.println(fork1.numberOfFork);
        Fork fork2 = new Fork();
        System.out.println(fork2.numberOfFork);
        System.out.println(fork1.forkNum);
        System.out.println(fork2.forkNum);*/

        Philosopher aristotle = new Philosopher();
        Philosopher socrates = new Philosopher();
        aristotle.name = "Aristotle";
        socrates.name = "Socrates";
        
    }
}

class Philosopher {
    String name;
    int philoNum = 0;
    static int numOfPhilo = 0;
    
    //note: all forks are created before philosophers
    int leftFork = 0;
    int rightFork = 0;
    
    boolean leftUp = false;
    boolean rightUp = false;
    
    Philosopher() {
        numOfPhilo++;
        philoNum = numOfPhilo;
        rightFork = philoNum - 1;
        leftFork = philoNum;
        if (philoNum == DiningPhilosophers.numOfForks) leftFork = 1;
    }
    
    void think() { 
        System.out.println(name + ": Hmm..");
    }
    void eat() {
        System.out.println(name + ": Yum!");
    }
    void liftLeftFork() {
        if (DiningPhilosophers.forkLift[leftFork]) {
            System.out.println(name + ": Can't lift left fork " + leftFork);
        }
        else {
            DiningPhilosophers.forkLift[leftFork] = true;
            leftUp = true;
            System.out.println(name + ": Lifted left fork " + leftFork);
        }
    }
    void liftRightFork() {
        if (DiningPhilosophers.forkLift[rightFork]) {
            System.out.println(name + ": Can't lift left fork " + rightFork);
        }
        else {
            DiningPhilosophers.forkLift[rightFork] = true;
            rightUp = true;
            System.out.println(name + ": Lifted left fork " + rightFork);
        }
    }
}
/*
class Fork {
    int forkNum = 0;
    boolean isUp = false;
    static int numberOfFork = 0;
    
    Fork() {
        numberOfFork++;
        forkNum = numberOfFork;
    }
}*/
