package Client;
import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args ){
        try{
            Socket socket = new Socket("localhost",5000);
            System.out.println("Client Connected to server !!!");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
