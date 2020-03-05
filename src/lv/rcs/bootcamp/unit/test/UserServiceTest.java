package lv.rcs.bootcamp.unit.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import jtm.additional.unit.DbOperations;
import jtm.additional.unit.User;
import jtm.additional.unit.UserService;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    private UserService userService;

    private DbOperations dbOperations;

    @Before
    public void setUp() throws Exception {
        dbOperations = mock(DbOperations.class);

        userService = new UserService(dbOperations);
    }

    @Test
    public void isUserRegistered_exists() {
        String email = "john.doe@email.com";
        User user = new User();

        when(dbOperations.findByEmail(email)).thenReturn(user);

        boolean actual = userService.isUserRegistered(email);

        assertTrue(actual);

        verify(dbOperations).findByEmail(email);
    }

    @Test
    public void isUserRegistered_notFound() {
        String email = "john.doe@email.com";

        when(dbOperations.findByEmail(email)).thenReturn(null);

        boolean actual = userService.isUserRegistered(email);

        assertFalse(actual);

        verify(dbOperations).findByEmail(email);
    }
}