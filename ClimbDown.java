public class ClimbDown {

    //Responsible for changing monkey's height to LOW
    private String operatorName = "CLIMBDOWN";

    public boolean checkPreconditions(WorldState worldState) {
        if(!(worldState.getRoomMonkeyIn().equals(worldState.getRoomBoxIn()))){
            return false;
        }

        if((worldState.getMonkeyHeight().equals("LOW"))){
            return false;
        }

        return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        worldState.setWorldState(worldState.getRoomMonkeyIn(), worldState.getRoomBoxIn(), worldState.getRoomBananasIn(), "LOW", false);
        return worldState;
        //create and return a new WorldState
        //with the monkey’s updated height
    }

    public String getOperatorName(){
        return operatorName;
    }
}