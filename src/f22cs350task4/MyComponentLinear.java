package f22cs350task4;//Zachery Owens 10/31/2022

public class MyComponentLinear extends A_Component {

    public MyComponentLinear(String id, double stateStart, double stateEnd, double step) {
        this.id = id;
        this.stateStart = stateStart;
        this.stateEnd = stateEnd;
        this.step = step;
        this.state = stateStart;
        this.dying = false;
        this.dead = false;
    }

    //inherits from A_Component such that calling
    //updateState() increments or decrements the current state
    // the step once per call until the end state is reached.
    @Override
    public boolean updateState() {
        if (this.dying == true) {
            if (this.dyingCount == 3) {//3 calls after terminate will switch the component to dead
                this.dead = true;
                this.dying = false;
            }
            this.dyingCount++;
        }
        if (this.dead == false) {

            this.state = state + step;//move the current state

            if (this.state > this.stateEnd || this.state < this.stateEnd)//keep the current state in bounds
                this.state = stateEnd;
        }
        //if the state end or stat has been reached, return true
        return (this.state == this.stateEnd);
    }
}
