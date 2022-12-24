public class GoalsDriver {
    public static void main(String[] args) {
        NumberOfGoals myinstance = new NumberOfGoals();
        NumberOfGoals myinstance2 = new NumberOfGoals();
        System.out.println(myinstance.getGoal());
        System.out.println(myinstance2.getGoal());
        myinstance.setGoal(10);
        myinstance2.setGoal(5);
        System.out.println(myinstance);
        System.out.println(myinstance2);
    }
}
