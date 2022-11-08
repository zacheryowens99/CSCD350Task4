package f22cs350task4;//Zachery Owens 11/3/2022

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


        if (this.dead == false) {

            if (this.stateEnd > this.stateStart)
                this.state = state + step;//move the current state
            else
                this.state = state - step;


            if ((this.state > this.stateEnd && this.stateEnd > this.stateStart ) || (this.state < this.stateEnd && this.stateEnd < this.stateStart))//keep the current state in bounds
                this.state = stateEnd;

            if(this.dying){
                this.dyingCount++;
                if(this.dyingCount == 3){
                    this.dead = true;
                    this.dying = false;
                }
            }
        }


        //if the state end has been reached, return true
        return (this.state == this.stateEnd);
    }
}
