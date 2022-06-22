public class AIPlanner {
    WorldState WorldState = new WorldState();
    ClimbDown climbDown = new ClimbDown();
    ClimbUp climbUp = new ClimbUp();
    Grab grab = new Grab();
    String[] operators = new String[4];
    String[] plan = new String[5];
    int count = -1;
    
    public void getPlan(String monkeyStart, String boxStart, String bananasStart, String height, boolean monkeyHasBananas){
        WorldState.setWorldState(monkeyStart, boxStart, bananasStart, height, monkeyHasBananas);

        //Used to check to make sure the initial world state variables were set correctly
        // System.out.println("Monkey Room: " + WorldState.getRoomMonkeyIn());
        // System.out.println("Box Room: " + WorldState.getRoomBoxIn());
        // System.out.println("Bananas Room: " + WorldState.getRoomBananasIn());
        // System.out.println("Monkey Height: " + WorldState.getMonkeyHeight());
        // System.out.println("Monkey have bananas: " + WorldState.doesMonkeyHaveBananas());

        // I used forward chaining in the way that it checks if the action is possible as well as if I even need to make the action.
        // I continue down and check if it passes the preconditions and if it does then I apply the post conditions. 
        // If it passes the condition then I am applying the post conditions as well as adding it to my plan.
        // I then print the plan fully after going through the process of checking every action available

        //Deciding where to move
        Move move = new Move(WorldState.getRoomMonkeyIn(), WorldState.getRoomBoxIn());
        if(move.checkPreconditions(WorldState)){
            count = count + 1;
            operators[count] = move.getOperatorName();
            plan[count] = "MOVE(" + WorldState.getRoomMonkeyIn() + "," + WorldState.getRoomBoxIn() + ")";
            move.applyPostconditions(WorldState);
        }

        //Deciding where to push box
        Push push = new Push(WorldState.getRoomBoxIn(), WorldState.getRoomBananasIn());
        if(push.checkPreconditions(WorldState)){
            count = count + 1;
            operators[count] = push.getOperatorName();
            plan[count] = "Push(" + WorldState.getRoomBoxIn() + "," + WorldState.getRoomBananasIn() + ")";
            push.applyPostconditions(WorldState);
        }

        //Deciding to climbup
        if(climbUp.checkPreconditions(WorldState)){
            count = count + 1;
            operators[count] = climbUp.getOperatorName();
            plan[count] = "CLIMBUP()";
            climbUp.applyPostconditions(WorldState);
        }

        //Deciding to grab
        if(grab.checkPreconditions(WorldState)){
            count = count + 1;
            operators[count] = grab.getOperatorName();
            plan[count] = "GRAB()";
            grab.applyPostconditions(WorldState);
        }

        //Printing out the plan to the screen
        int count2 = 0;
        while(plan[count2] != null){
            System.out.println(plan[count2]);
            count2 = count2 + 1;
        }

    }
}