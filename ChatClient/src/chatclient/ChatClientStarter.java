/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import com.client.view.controller.SplashScreenLoader;
import com.sun.javafx.application.LauncherImpl;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Shall
 */
public class ChatClientStarter extends Application{
    public static void main(String[]args){
        LauncherImpl.launchApplication(ChatClient.class, SplashScreenLoader.class, args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
