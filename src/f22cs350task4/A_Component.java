package f22cs350task4;//Zachery Owens 10/31/2022

public abstract class A_Component {
    String id;
    int dyingCount = 0;
    double stateStart, stateEnd, state, step;
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

    //Updates the state from its current state to its next state based on the current step.
    // If the next state exceeds the end state,
    // then the former is clamped to the latter. This returns whether the end state has been reached
    public boolean updateState(){
        //this method will be overwritten by children classes
        return (this.state == this.stateEnd);
    }

    //Immediately stops the component from servicing calls to updateState().
    public void cancel(){
    this.dead = true;
    this.dying = false;
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
