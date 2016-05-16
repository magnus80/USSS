package Tests.Sanity.Func;

import Pages.Common.AuthorisationPage;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by kiryshkov on 16.05.2016.
 */
public class TestLoginPage extends TestBase {

    @Test
    public void testLoginPage() throws IOException, SQLException {
        AuthorisationPage ap=new AuthorisationPage();
        ap.login("","");
    }

}
