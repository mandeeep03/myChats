package Server;
import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args){
        try{

            ServerSocket Skt = new ServerSocket(5000);
            System.out.println("Server Started");
            Socket socket = Skt.accept();
            System.out.println("Client Connectd !!!");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}