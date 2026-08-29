package amine.todolist.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToDoView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file relative to this class package
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoView.fxml"));
        VBox root = loader.load();

        Scene scene = new Scene(root, 400, 450);
        primaryStage.setTitle("JavaFX To-Do List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}