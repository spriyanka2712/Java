package Day9;
abstract class SmartDevice{
    String name;

    SmartDevice(String name){
        this.name = name;
    }

    abstract void turnOn();
    abstract void turnOff();
}

class Light extends SmartDevice{
    Light(String name){
        super(name);
    }

    void turnOn(){
        System.out.println(name+" Light on");
    }

    void turnOff(){
        System.out.println(name+" Light off");
    }
}

class Ac extends SmartDevice{
    Ac(String name){
        super(name);
    }
    
    void turnOn(){
        System.out.println(name+" Ac on");
    }
    
    void turnOff(){
        System.out.println(name+" Ac off");
    }
}

interface Trigger{
    public boolean isTriggered();
}

class MotionTrigger implements Trigger{
    public boolean isTriggered(){
        System.out.println("Motion triggered");
        return true;
    }
}

class TempTrigger implements Trigger{
    int temp;
    TempTrigger(int temp){
        this.temp = temp;
    }
    public boolean isTriggered(){
        System.out.println("Temperature: "+temp);
        return temp > 25;
    }
}

class TimeTrigger implements Trigger{
    int time;
    TimeTrigger(int time){
        this.time = time;
    }
    public boolean isTriggered(){
        System.out.println("Time: "+time);
        return time >= 18;
    }
}

interface Action{
    void execute();
}

class TurnOnAction implements Action{
    SmartDevice device;
    TurnOnAction(SmartDevice device){
        this.device = device;
    }
    public void execute(){
        device.turnOn();
    }
}

class TurnOffAction implements Action{
    SmartDevice device;
    TurnOffAction(SmartDevice device){
        this.device = device;
    }
    public void execute(){
        device.turnOff();
    }
}

class Rule{
    Trigger trigger;
    Action action;
    Rule(Trigger trigger, Action action){
        this.trigger = trigger;
        this.action = action;
    }
    void result(){
        if(trigger.isTriggered()){
            action.execute();
        }
        else{
            System.out.println("Trigger condition not met");
        }
    }
}

public class SmartHomeSystem {
    public static void main(String[] args){
        SmartDevice d1 = new Light("Hall");
        SmartDevice d2 = new Ac("Bedroom");

        Trigger t1 = new MotionTrigger();
        Trigger t2 = new TempTrigger(30);
        Trigger t3 = new TimeTrigger(20);

        Action a1 = new TurnOnAction(d1);
        Action a2 = new TurnOffAction(d2);

        Rule r1 = new Rule(t1, a1);
        Rule r2 = new Rule(t2, a2);
        Rule r3 = new Rule(t3, new TurnOnAction(d2));

        r1.result();
        r2.result();
        r3.result();
    }
}
