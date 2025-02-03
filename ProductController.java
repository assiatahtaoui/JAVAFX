package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.demo.Tp.Product;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable{
    @FXML
    private TextField FieldNom;
    @FXML
    private TextField FieldPrice;
    @FXML
    private ListView<Product> productListView;
    @FXML
    private TextField FieldSearch;


    public ObservableList<Product> productList= FXCollections.observableArrayList();


    public void addPro(){
        String name=FieldNom.getText();
        double price= Double.parseDouble(FieldNom.getText());
            Product product1=new Product("hp" , 10);

            productList.add(product1);
            productListView.setItems(productList);

            FieldNom.clear();
            FieldPrice.clear();

        }

    public void searchPro(){
        String searchText=FieldSearch.getText();
        ObservableList<Product> filteredlist= FXCollections.observableArrayList();
        for (Product p: productList){
            if (p.getName().contains(searchText)){
                filteredlist.add(p);
            }
        }
        productListView.setItems(filteredlist);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        productListView.setItems(productList);
    }
}

