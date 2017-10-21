package simple_client;

import mess_test.test_obj_to_serl;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by wtfor on 21.10.2017.
 */
public class client {
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",8888);
            OutputStream os = s.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            test_obj_to_serl to = new test_obj_to_serl();
            to.setValues(123,"object sanded by client");
            oos.writeObject(to);
            oos.writeObject(new String("another object from the client"));
            oos.close();
            os.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}
