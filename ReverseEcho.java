import java.net.*;
import java.io.*;

public class ReverseEcho {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(0);
        System.out.println("Server started on port: " + ss.getLocalPort());

        Socket stk = ss.accept();
        System.out.println("Client connected: " + stk.getInetAddress());

        // need to read input from client and reverse
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream())); // read input from stk
                                                                                             // socket then convert into
                                                                                             // streamreader creatin an
                                                                                             // object then read a
                                                                                             // completer line form
                                                                                             // client
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do {
            msg = br.readLine();
            String reversed = new StringBuilder(msg).reverse().toString();
            ps.println(reversed);
        } while (!msg.equals("dne"));
        br.close();
        ps.close();
        stk.close();
        ss.close();
    }
}

class Client {

    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 53978);
        System.out.println("Client connected: " + stk.getInetAddress());

        // need to read input from server
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream())); // read input from stk
                                                                                             // socket then convert into
                                                                                             // streamreader creatin an
                                                                                             // object then read a
                                                                                             // completer line form
                                                                                             // client
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("Message from server" + msg);
        } while (!msg.equals("dne"));
        keyb.close();
        br.close();
        ps.close();
        stk.close();
    }
}