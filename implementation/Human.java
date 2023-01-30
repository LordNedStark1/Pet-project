package implementation;

public abstract class Human {
    IGod god;


    public void godBehaviour(){
        god.god();

    }
    public void setGod(IGod god){
        this.god= god;
    }

}
