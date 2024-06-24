package coupling;

public class UserManager {
    private UserDataProvider userDatabaseProvider;

    public UserManager(UserDataProvider userDatabaseProvider){
        this.userDatabaseProvider = userDatabaseProvider;
    }

    public String getUserInfo(){
        return userDatabaseProvider.getUserDetails();
    }
}
