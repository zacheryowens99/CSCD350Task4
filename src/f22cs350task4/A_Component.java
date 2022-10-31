package f22cs350task4;

public abstract class A_Component {
    String id;
    int dyingCount = 0;
    double stateStart, stateEnd, state, step, stepAcceleration;
    boolean dying, dead;

    //Gets the arbitrary nonempty identifier of this component.
    public String getID(){
        return this.id;
    }

    //Gets the current state, which is always between the start and end states.
    public double getState(){
        return this.state;
    }

    //Gets the initial state that this state assumes.
    public double getStateStart(){
        return this.stateStart;
    }

    //Gets the final state that this state can assume.
    public double getStateEnd(){
        return this.stateEnd;
    }

    //Gets the value of the transition step between the start and end states. It is always positive.
    public double getStep(){
        return this.step;
    }

    //Updates the state from its current state to its next state based on the current step. If the next state exceeds the end state,
    // then the former is clamped to the latter. This returns whether the end state has been reached
    public boolean updateState(){

        if (this.dying == true) {

            if (this.dyingCount == 3)//3 calls after terminate will switch the component to dead
                this.dead = true;

            if (this.stepAcceleration != 0)//If nonlinear, reduce step by half
                step = step / 2;
            this.dyingCount++;
        }

        if (this.dead == false) {

            this.state = state + step;//move the current state
            if(this.state > this.stateEnd)//keep the current state in bounds
                this.state = stateEnd;
            if(this.dying == false)//(nonlinear) if not dying increase the step value
                this.step = step + stepAcceleration;
        }
        if (this.state == this.stateEnd)//if the state end has been reached, return true
            return true;
        else
            return false;
    }

    //Immediately stops the component from servicing calls to updateState().
    public void cancel(){
    this.dead = true;
    this.dying = true;
    }

    //Stops the component from servicing calls to updateState() with a notional gradual shutdown. For linear components,
    //cease servicing three calls after receipt of this terminate signal. For nonlinear components, also
    //reduce the step by half each time.
    public void terminate(){
        this.dying = true;
    }

    //Returns whether the component is being terminated.
    public boolean isDying(){
        return this.dying;
    }

    //Returns whether the component has been canceled or terminated.
    public boolean isDead(){
        return this.dead;
    }

}
