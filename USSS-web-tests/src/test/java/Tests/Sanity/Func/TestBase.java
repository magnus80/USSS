package Tests.Sanity.Func;


import Helpers.ApplicationManager;
import org.junit.Before;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by kiryshkov on 16.05.2016.
 */
public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() throws IOException, SQLException {
        app.db().initDBConnection();
    }
}
