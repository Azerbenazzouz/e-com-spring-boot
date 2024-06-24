package coupling;

public class UserDatabase implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User details from database";
    }
}
