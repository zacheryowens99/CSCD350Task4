package f22cs350task4;

public class MyComponentNonlinear extends A_Component{

    MyComponentNonlinear(String id, double stateStart, double stateEnd, double step, double stepAcceleration){
        this.id = id;
        this.stateStart = stateStart;
        this.stateEnd = stateEnd;
        this.step = step;
        this.stepAcceleration = stepAcceleration;
        this.state = stateStart;
        this.dying = false;
        this.dead = false;
    }

    //Gets the change in step at each update when not terminating.
    double getStepAcceleration(){
        return this.stepAcceleration;
    }

}
