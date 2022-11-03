package f22cs350task4;//Zachery Owens 10/31/2022

public class Tester {

    public static void main(String[] args){

        System.out.println("Linear\n");
        MyComponentLinear linear = new MyComponentLinear("123", 0, 10, 1);
        System.out.println("ID: " + linear.getID());
        System.out.println("State Start: " + linear.getStateStart());
        System.out.println("State End: " + linear.getStateEnd());
        System.out.println("State Step: " + linear.getStep());

        for(int i = 0; i < 6; i++){
            linear.updateState();
            System.out.println("Current State: " + linear.getState());
        }

        System.out.println("Terminating");
        linear.terminate();
        System.out.println("Is it dying? " + linear.isDying());

        //System.out.println("Canceled");
        //linear.cancel();

        for(int i = 0; i < 4; i++) {
            System.out.println("Is it dead? " + linear.isDead());
            linear.updateState();
            System.out.println("Current State: " + linear.getState());
        }

        System.out.println("Nonlinear\n");
        MyComponentNonlinear nonlinear = new MyComponentNonlinear("321", 0, 30, 2, 1);
        System.out.println("ID: " + nonlinear.getID());
        System.out.println("State Start: " + nonlinear.getStateStart());
        System.out.println("State End: " + nonlinear.getStateEnd());
        System.out.println("State Step: " + nonlinear.getStep());
        System.out.println("Step Acceleration: " + nonlinear.getStepAcceleration()+ "\n");

        for(int i = 0; i < 3; i++){
            nonlinear.updateState();
            System.out.println("Current State: " + nonlinear.getState());
        }

        System.out.println("Terminating");
        nonlinear.terminate();
        System.out.println("Is it dying? " + nonlinear.isDying());

        //System.out.println("Canceled");
        //nonlinear.cancel();

        for(int i = 0; i < 5; i++) {
            nonlinear.updateState();
            System.out.println("Current State: " + nonlinear.getState());
            System.out.println("Is it dead? " + nonlinear.isDead());
        }

    }
}
