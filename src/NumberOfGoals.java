public class NumberOfGoals {
    private int currentgoal;
    public NumberOfGoals(){
        currentgoal = 0;
    }
    public void setGoal(int currentgoal){
        this.currentgoal=currentgoal;
    }
    public int getGoal(){
        return currentgoal;
    }
    public void goal(){
        currentgoal++;
    }
    public String toString(){
        String result = Integer.toString(currentgoal);
        return result;
    }
}
