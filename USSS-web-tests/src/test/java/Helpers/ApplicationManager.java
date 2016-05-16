package Helpers;

import Helpers.DBHelper;

import java.util.Properties;


/**
 * Created by kiryshkov on 13.05.2016.
 */
public class ApplicationManager {
    private DBHelper dbHelper;
    private Properties properties = new Properties();

    public ApplicationManager() {
        properties = new Properties();
    }

    public DBHelper db() {
        return dbHelper;
    }


   /* public void main(String[] args) {
        try {
            String target = System.getProperty("target", "dbreader");
            //properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
            File file = new File((String.format("src/test/resources/%s.properties", target)));
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                java.lang.String value = properties.getProperty(java.lang.String.valueOf(key));
                System.out.println(key + ": " + value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
