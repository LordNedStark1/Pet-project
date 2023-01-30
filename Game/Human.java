package Game;

public class Human implements man {
    private String name;
    private int token;

    public Human( String humanName) {
       int initialToken = 50;
       token = initialToken;
       name = humanName;
    }
    public Human(){
        int initialToken = 50;
        token = initialToken;
    }

    public void initialToken() {
        int initialToken = 50;
        token = initialToken;
    }

    public int getToken() {
        return token;
    }

    public void withdrawToken(int withdrawalAmount) {
    token -=withdrawalAmount;
    }
}
