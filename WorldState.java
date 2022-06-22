public class WorldState {
    private String roomMonkeyIn;
    private String roomBoxIn;
    private String roomBananasIn;
    private String monkeyHeight;
    private boolean monkeyHasBananas;

    //This is responsible for setting the world state.
    //It also contains a lot of simple getter functions
    public void setWorldState(String monkeyStart, String boxStart, String bananasStart, String monkeyHeight, boolean monkeyHasBananas){
        this.roomMonkeyIn = monkeyStart;
        this.roomBoxIn = boxStart;
        this.roomBananasIn = bananasStart;
        this.monkeyHeight = monkeyHeight;
        this.monkeyHasBananas = monkeyHasBananas;
    }

    public String getRoomMonkeyIn(){
        return this.roomMonkeyIn;
    }

    public String getRoomBoxIn(){
        return this.roomBoxIn;
    }

    public String getRoomBananasIn(){
        return this.roomBananasIn;
    }

    public String getMonkeyHeight(){
        return this.monkeyHeight;
    }

    public boolean doesMonkeyHaveBananas(){
        return this.monkeyHasBananas;
    }

    public boolean isMonkeyAt(String room){
        if(roomMonkeyIn.equals(room)){
            return true;
        }
        return false;
    }

    public boolean isBoxAt(String room){
        if(roomBoxIn.equals(room)){
            return true;
        }
        return false;
    }

    public boolean isBananasAt(String room){
        if(roomBananasIn.equals(room)){
            return true;
        }
        return false;
    }

    public boolean isMonkeyHeight(String height){
        if(monkeyHeight.equals(height)){
            return true;
        }
        return false;
    }

}
