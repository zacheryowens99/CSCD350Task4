package f22cs350task4;

public class MyComponentLinear extends A_Component{

    public MyComponentLinear(String id, double stateStart, double stateEnd, double step){
        this.id = id;
        this.stateStart = stateStart;
        this.stateEnd = stateEnd;
        this.step = step;
        this.state = stateStart;
        this.dying = false;
        this.dead = false;
    }

}
