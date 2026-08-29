package amine.todolist.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaskModel {

    // ObservableList allows the View/Controller to observe changes automatically
    private final ObservableList<String> tasks = FXCollections.observableArrayList();

    public ObservableList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task.trim());
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}