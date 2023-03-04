public class Account {

    // property to store the reference of one Account object, static as it will be
    // acccess from the class only
    private static Account instance;
    private static User user;

    // put the constructor in private to make the instance creation possible only
    // via getInstance()
    private Account() {
    }

    // method to get an instance
    public static Account getInstance() {

        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public static void signIn(User newUser){
        if(instance != null && user == null) {
            System.out.println("passe dans if");
            user = newUser;
        } else {
            System.out.println("passe else");
            System.out.println("One user is already logged and has to signOff to allow a new User");
        }
    }
 
    public static void signOff() {
        user = null;
    }

    public static User getUser(){
        return user;
    }
}
