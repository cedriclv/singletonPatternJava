public class Launch {
    public static void main(String[] args) {
        //users creation

        User toto = new User("toto", "totoPassword");
        System.out.println("ref de toto :" + toto);
        User tata = new User("tata", "tataPassword");
        System.out.println("ref de toto :" + tata);

        //get an instance to sign the user
        
        System.out.println("//// INSTANCE ////");
        System.out.println(Account.getInstance());

        System.out.println("//// USER TOTO LOGGED ////");
        Account.signIn(toto);
        System.out.println(Account.getUser());

        System.out.println("//// TOTO LOGGED OFF, TO ALLOW TATA TO LOG LATER ////");
        Account.signOff();

         System.out.println("//// USER TATA LOGGED ////");
         Account.signIn(tata);
         System.out.println(Account.getUser().getName());
                
    }
    
}
