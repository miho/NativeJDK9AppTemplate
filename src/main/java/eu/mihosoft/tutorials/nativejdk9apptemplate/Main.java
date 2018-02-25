package eu.mihosoft.tutorials.nativejdk9apptemplate;

import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Main application class.
 * 
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // create a button 
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        // define action (btn clicked)
        btn.setOnAction((ActionEvent event) -> {
            primaryStage.setTitle("Button Pressed at " + new Date());
        });
        
        // container element for the button
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        // main scene
        Scene scene = new Scene(root, 450, 250);
        
        // configure & display stage
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
