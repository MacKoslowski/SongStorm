package GUI;

import SongElements.*;
import javafx.scene.control.TextField;

import java.awt.Insets;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SongBuilderView extends Application {

	SongGenerator builder;
	Song song;
	
	@FXML
	private TextArea key = new TextArea();
	
	@FXML
	private TextArea bpm = new TextArea();
	
	@FXML
	private TextArea mode = new TextArea();
	 
  
	
	public static void main(String[] args) {
	        launch(args);
    }
	    
	@Override
    public void start(Stage primaryStage) throws IOException 
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("/resources/SongBuilderGUI.fxml"));
	    
        Scene scene = new Scene(root, 300, 275);
    
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        initialize();
        
	}
	
	public void initialize()
	{
		
		key.setEditable(false);
		key.setMouseTransparent(true);
		key.setFocusTraversable(false);
		
        mode.setEditable(false);
        mode.setMouseTransparent(true);
		mode.setFocusTraversable(false);
		
		bpm.setMouseTransparent(true);
		bpm.setFocusTraversable(false);
        bpm.setEditable(false);
		
	}
	
	@FXML
	public void onGenerate()
	{
		builder = new SongGenerator();
		song = builder.generateSong();
		
				
		String bpmString = "" + song.getBPM();
		String keyString = song.getNote() + " " + song.getMood();
		String modeString = song.getMode();
		

		key.setText(keyString);
		mode.setText(modeString);
		bpm.setText(bpmString);
		
		
	}
	
}
