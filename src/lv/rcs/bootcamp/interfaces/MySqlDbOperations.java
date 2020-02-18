package lv.rcs.bootcamp.interfaces;

public class MySqlDbOperations implements DbOperations {

    @Override
    public User findUserById(long id) {
        return findInTable(id, "users");
    }

    private User findInTable(long id, String tableName) {
        //db operations
        return new User();
    }
}
