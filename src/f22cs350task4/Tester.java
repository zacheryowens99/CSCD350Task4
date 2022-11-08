package f22cs350task4;//Zachery Owens 10/31/2022

public class Tester {

    public static void main(String[] args){

        System.out.println("Linear\n");
        MyComponentLinear linear = new MyComponentLinear("linear13", -10, 10, 3);
        System.out.println("ID: " + linear.getID());
        System.out.println("State Start: " + linear.getStateStart());
        System.out.println("State End: " + linear.getStateEnd());
        System.out.println("State Step: " + linear.getStep());
        System.out.println("Is it dying? " + linear.isDying());
        System.out.println("Is it dead? " + linear.isDead());
        System.out.println("Current State: " + linear.getState()  + "\n" );

        for(int i = 1; i <= 7; i++){

            if (i == 5){//change the value for i depending on where you want to terminate
                System.out.println("Terminating\n");
                linear.terminate();

                //System.out.println("Canceled\n");
                //linear.cancel();
            }

            linear.updateState();
            System.out.println("Update: " + i);
            System.out.println("State Start: " + linear.getStateStart());
            System.out.println("State End: " + linear.getStateEnd());
            System.out.println("State Step: " + linear.getStep());
            System.out.println("Is it dying? " + linear.isDying());
            System.out.println("Is it dead? " + linear.isDead());
            System.out.println("Current State: " + linear.getState()  + "\n" );
        }


        System.out.println("Final State: ");
        System.out.println("State Start: " + linear.getStateStart());
        System.out.println("State End: " + linear.getStateEnd());
        System.out.println("State Step: " + linear.getStep());
        System.out.println("Is it dying? " + linear.isDying());
        System.out.println("Is it dead? " + linear.isDead());
        System.out.println("Current State: " + linear.getState() + "\n");

//-----------------------------------------------------------------------------------------------------------------------

        System.out.println("Nonlinear\n");
        MyComponentNonlinear nonlinear = new MyComponentNonlinear("nonlinear13", -10, 30, 2.5, 1.5);
        System.out.println("ID: " + nonlinear.getID());
        System.out.println("State Start: " + nonlinear.getStateStart());
        System.out.println("State End: " + nonlinear.getStateEnd());
        System.out.println("State Step: " + nonlinear.getStep());
        System.out.println("Step Acceleration: " + nonlinear.getStepAcceleration());
        System.out.println("Is it dying? " + nonlinear.isDying());
        System.out.println("Is it dead? " + nonlinear.isDead());
        System.out.println("Current State: " + nonlinear.getState() + "\n" );

        for(int i = 1; i <= 4; i++){

            if (i == 3){
                System.out.println("Terminating\n");
                nonlinear.terminate();

                //System.out.println("Canceled\n");
                //linear.cancel();
            }

            nonlinear.updateState();
            System.out.println("Update: " + i);
            System.out.println("State Start: " + nonlinear.getStateStart());
            System.out.println("State End: " + nonlinear.getStateEnd());
            System.out.println("State Step: " + nonlinear.getStep());
            System.out.println("Is it dying? " + nonlinear.isDying());
            System.out.println("Is it dead? " + nonlinear.isDead());
            System.out.println("Current State: " + nonlinear.getState() + "\n" );

        }


        System.out.println("Final State: ");
        System.out.println("State Start: " + nonlinear.getStateStart());
        System.out.println("State End: " + nonlinear.getStateEnd());
        System.out.println("State Step: " + nonlinear.getStep());
        System.out.println("Is it dying? " + nonlinear.isDying());
        System.out.println("Is it dead? " + nonlinear.isDead());
        System.out.println("Current State: " + nonlinear.getState() + "\n" );

    }
}
