package org.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root= new BorderPane();
        HBox hBox= new HBox();
        hBox.setSpacing(10);
        Label labelNom=new Label("Name");
        Label labelprice=new Label("Price");
        TextField textFieldNom= new TextField();
        TextField textFieldPc=new TextField();
        Button button=new Button("Add");
        Button button1=new Button("Delete");
        hBox.getChildren().addAll(labelNom,textFieldNom,labelprice,textFieldPc,button,button1);
        root.setTop(hBox);
        ObservableList<String> data= FXCollections.observableArrayList();
        root.setPadding(new Insets(20));
        hBox.setPadding(new Insets(10));
        ListView<String> listView=new ListView<>(data);
        root.setCenter(listView);
        Scene scene=new Scene(root,400,500);
        stage.setScene(scene);
        stage.setTitle("MyStore");
        stage.show();

        button.setOnAction(actionEvent ->{
            String Name=textFieldNom.getText();
            String Price= textFieldPc.getText();
            if (Name.trim().equals("")){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setContentText("champs obligatoire");
                alert.show();
            }else {
                data.addAll(Name,Price);
                textFieldNom.setText("");
                textFieldPc.setText("");}
        } );

        button1.setOnAction(actionEvent -> {
            int index= listView.getSelectionModel().getSelectedIndex();
            if (index==1){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setContentText("select the item");
                alert.show();
            }else {
                data.remove(index);
            }

                });


    }

    public static void main(String[] args) {
        launch(args);
    }
}