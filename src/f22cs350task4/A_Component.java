package f22cs350task4;

public abstract class A_Component {

    //Gets the arbitrary nonempty identifier of this component.
    public String getID(){
        return null;
    }

    //Gets the current state, which is always between the start and end states.
    public double getState(){

        return 0;
    }

    //Gets the initial state that this state assumes.
    public double getStateStart(){
        return 0;
    }

    //Gets the final state that this state can assume.
    public double getStateEnd(){
        return 0;
    }

    //Gets the value of the transition step between the start and end states. It is always positive.
    public double getStep(){
        return 0;
    }

    //Updates the state from its current state to its next state based on the current step. If the next state exceeds the end state,
    // then the former is clamped to the latter. This returns whether the end state has been reached
    public boolean updateState(){
        return false;
    }

    //Immediately stops the component from servicing calls to updateState().
    public void cancel(){

    }

    //Stops the component from servicing calls to updateState() with a notional gradual shutdown. For linear components,
    //reverse the step and cease servicing three calls after receipt of this terminate signal. For nonlinear components, also
    //reduce the step by half each time.
    public void terminate(){

    }

    //Returns whether the component is being terminated.
    public boolean isDying(){
        return false;
    }

    //Returns whether the component has been canceled or terminated.
    public boolean isDead(){
        return false;
    }

}
