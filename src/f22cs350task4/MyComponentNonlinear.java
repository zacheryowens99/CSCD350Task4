package f22cs350task4;

public class MyComponentNonlinear extends A_Component{

    String id;
    double stateStart, stateEnd, step, stepAcceleration;


    MyComponentNonlinear(String id, double stateStart, double stateEnd, double step, double stepAcceleration){
        this.id = id;
        this.stateStart = stateStart;
        this.stateEnd = stateEnd;
        this.step = step;
        this.stepAcceleration = stepAcceleration;
    }

}
