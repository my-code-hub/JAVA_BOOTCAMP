package lv.rcs.bootcamp.interfaces;

public interface DbOperations {

    String VARIABLE = "value";

    User findUserById(long id);
}
