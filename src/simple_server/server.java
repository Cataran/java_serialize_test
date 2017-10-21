package simple_server;

import mess_test.test_obj_to_serl;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wtfor on 21.10.2017.
 */
public class server {
    public static void main(String args[]) {
        int port = 8888;
        try {
            ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            test_obj_to_serl to = (test_obj_to_serl) ois.readObject();
            if (to!=null){System.out.println(to.getTest_value() + "  " + to.getTest_line());}
            System.out.println((String)ois.readObject());
            is.close();
            s.close();
            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}
