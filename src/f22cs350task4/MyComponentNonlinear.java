package f22cs350task4;//Zachery Owens 10/31/2022

public class MyComponentNonlinear extends A_Component{

    double stepAcceleration;

    public MyComponentNonlinear(String id, double stateStart, double stateEnd, double step, double stepAcceleration){
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
    public double getStepAcceleration(){
        return this.stepAcceleration;
    }

    //  inherits from A_Component such that calling updateState()
    //  increments or decrements the current state by the current step once per call
    // until the end state is reached, and the step value then increments by stepAcceleration.
    @Override
    public boolean updateState(){
        if (this.dying == true) {
            if (this.dyingCount == 3) {//3 updateState() calls after terminate will switch the component to dead
                this.dead = true;
                this.dying = false;
            }
            this.step = step / 2;
            this.dyingCount++;
        }
        if (this.dead == false) {

            this.state = state + step;//move the current state

            if ((this.state > this.stateEnd && this.step > 0) || (this.step < 0 && this.state < this.stateEnd))//keep the current state in bounds
                this.state = stateEnd;

            if (this.dying == false) {
                if(this.step > 0)
                    this.step = step + stepAcceleration;//step positive
                else
                    this.step = step - stepAcceleration;//step negative
            }
        }
        //if the state end has been reached, return true
        return (this.state == this.stateEnd);
    }


}
