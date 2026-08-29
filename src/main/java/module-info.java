module amine.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    // Open packages containing FXML files so JavaFX FXMLLoader can access them
    opens amine.todolist.view to javafx.fxml;
    opens amine.todolist.controller to javafx.fxml;

    // Export packages so JavaFX can access your View classes
    exports amine.todolist.view;
    exports amine.todolist.model;
    exports amine.todolist.controller;
}