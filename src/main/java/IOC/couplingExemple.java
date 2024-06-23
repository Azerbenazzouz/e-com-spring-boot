package loose.coupling;

public class couplingExemple {
    public static void main(String[] args){

        UserDataProvider dataProvider = new UserDatabase();
        UserManager userManager = new UserManager(dataProvider);

        System.out.println(userManager.getUserInfo());
    }
}
