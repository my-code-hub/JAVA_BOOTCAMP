package lv.rcs.bootcamp.interfaces;

public class UserService {

    private DbOperations dbOperations;

    public UserService(DbOperations dbOperations) {
        this.dbOperations = dbOperations;
    }

    public boolean isUserRegistered(long userId) {
        Object user = dbOperations.findUserById(userId);
        if (user != null) {
            return false;
        } else {
            return true;
        }
    }
}
