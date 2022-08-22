package P06_Poiymirfism;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new EdisonPhone(1890);
        AbstractPhone Phone = new Phone(1990);
        AbstractPhone videoPhone = new VideoPhone(2000);
        User user = new User("Степан");

        user.callAnotherUser(10000, firstPhone);
        user.callAnotherUser(9055555, Phone);
        user.callAnotherUser(156589, videoPhone);
        
    }
}


