package lv.rcs.bootcamp.unit;

public class UserService {

    private DbOperations dbOperations;

    public UserService(DbOperations dbOperations) {
        this.dbOperations = dbOperations;
    }

    public boolean isUserRegistered(String email) {

        return true;
//        User user = dbOperations.findByEmail(email);
//        if (user != null) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
