public class Move {
    private String operatorName = "MOVE";
    private String moveFrom;
    private String moveTo;

    //Responsible for moving the monkey from location "moveFrom" to location "moveTo"
    public Move(String from, String to){
        this.moveFrom = from;
        this.moveTo = to;
    }

    public boolean checkPreconditions(WorldState worldState) {
        if(!worldState.isMonkeyAt(moveFrom)){
            return false;
        }

        if(worldState.isMonkeyAt(moveTo)){
            return false;
        }

        if(!worldState.isMonkeyHeight("LOW")){
            return false;
        }

        return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        worldState.setWorldState(moveTo, worldState.getRoomBoxIn(), worldState.getRoomBananasIn(), worldState.getMonkeyHeight(), false);
        return worldState;
        //create and return a new WorldState
        //with the monkey’s updated location
    }

    public String getOperatorName(){
        return operatorName;
    }
}
