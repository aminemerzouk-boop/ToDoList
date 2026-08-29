package amine.todolist.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToDoController {

    @FXML
    private TextField taskInput;

    @FXML
    private ListView<String> taskListView;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    private final ObservableList<String> tasks = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Automatically called after the FXML file is loaded
        taskListView.setItems(tasks);
    }

    @FXML
    private void handleAddTask() {
        String text = taskInput.getText().trim();
        if (!text.isEmpty()) {
            tasks.add(text);
            taskInput.clear();
        }
    }

    @FXML
    private void handleDeleteTask() {
        int selectedIndex = taskListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
        }
    }
}