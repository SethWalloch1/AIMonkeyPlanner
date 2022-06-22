public class Push {
    private String operatorName = "PUSH";
    private String pushFrom;
    private String pushTo;

    //Responsible for the monkey moving the box from location "pushFrom" to location "pushTo".
    //This updates the monkey's and box's location
    public Push(String from, String to){
        this.pushFrom = from;
        this.pushTo = to;
    }

    public boolean checkPreconditions(WorldState worldState) {
        if(!worldState.isMonkeyAt(pushFrom)){
            return false;
        }

        if(!worldState.isBoxAt(pushFrom)){
            return false;
        }

        if(worldState.isBoxAt(pushTo)){
            return false;
        }

        if(!worldState.isMonkeyHeight("LOW")){
            return false;
        }

        return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        worldState.setWorldState(pushTo, pushTo, worldState.getRoomBananasIn(), worldState.getMonkeyHeight(), false);
        return worldState;
        //create and return a new WorldState
        //with the monkey’s updated location
    }

    public String getOperatorName(){
        return operatorName;
    }
}