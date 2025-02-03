package org.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.demo.Tp.Product;

public class tp3  extends Application {
        public static void main(String[] args) {
            launch(args);

        }
        @Override
        public void start(Stage stage) throws Exception {
            BorderPane root= FXMLLoader.load(getClass().getResource("products-view.fxml"));
            Scene scene=new Scene(root,400,500);
            stage.setScene(scene);
            stage.setTitle("my 2 store");
            stage.show();

        }
    }


