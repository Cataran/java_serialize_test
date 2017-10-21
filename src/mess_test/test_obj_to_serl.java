package mess_test;

import java.io.Serializable;

/**
 * Created by wtfor on 21.10.2017.
 */
public class test_obj_to_serl implements Serializable {
    private static final long serialVersionUID = -5379197414802088859L;
    int test_value;

    public int getTest_value() {
        return test_value;
    }

    public String getTest_line() {
        return test_line;
    }

    String test_line;

    public void setValues(int test_value,String test_line){
        this.test_value = test_value;
        this.test_line = test_line;
    }
}
