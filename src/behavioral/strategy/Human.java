package behavioral.strategy;

public class Human {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doSomething();
    }
}
