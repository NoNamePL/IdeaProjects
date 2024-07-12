package ClientHandler;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{

    public static ArrayList<ClientHandler>clientHandlers = new ArrayList<>();
    private Socket socket;
    private BufferedReader buffReader;
    private BufferedWriter buffWriter;
    private String name;

    public ClientHandler(Socket socket) {
        // Constructors of all the private classes
        try {
            this.socket = socket;
            this.buffWriter = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()) );
            this.buffReader = new BufferedReader( new InputStreamReader(socket.getInputStream()) );
            this.name = buffReader.readLine();
            clientHandlers.add(this);
            boradcastMessage("SERVER " + name + " has entered in the room");

        } catch (IOException e) {
            closeAll(socket,buffReader,buffWriter);
        }
    }

    // run method overrid
    @Override
    public void run() {

        String messageFromClient;

        while(socket.isConnected()) {
            try {
                messageFromClient = buffReader.readLine();
                boradcastMessage(messageFromClient);
            } catch (IOException e) {
                closeAll(socket, buffReader, buffWriter);
                break;
            }
        }
    }

    private void boradcastMessage(String messageToSend) {
        for(ClientHandler clientHandler: clientHandlers) {
            try {
                if(!clientHandler.name.equals(name)) {
                    clientHandler.buffWriter.write(messageToSend);
                    clientHandler.buffWriter.newLine();
                    clientHandler.buffWriter.flush();
                }
            } catch(IOException e) {
                closeAll(clientHandler.socket, clientHandler.buffReader, clientHandler.buffWriter);

            }
        }
    }

    // notify if the user left the chat
    public void removeClientHandler(){
        clientHandlers.remove(this);
        boradcastMessage("Server " + name + " has gone");
    }

    public void closeAll(Socket socket, BufferedReader buffReader, BufferedWriter buffWriter) {

        // handle the remove Client function
        removeClientHandler();
        try {
            if(buffReader!=null){
                buffReader.close();
            }
            if(buffWriter!=null){
                buffWriter.close();
            }
            if(socket!=null){
                socket.close();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

}
