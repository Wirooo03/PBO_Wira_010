package com.main;


import data.Admin;
import data.Student;
import exception.custom.IllegalAdminAccess;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class LibrarySystem extends Application {

    public static String NIM;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Admin adminObj = new Admin();
        Student studentObj = new Student();

        primaryStage.setTitle("UMM Library");

        //Label
        Label sceneTitle    = new Label("UMM Library");
        Label usernameLabel = new Label("Username");
        Label passwordLabel = new Label("Password");

        //Notification label
       Label errorLoginMessage   = new Label("Pengguna tidak ditemukan");

        //Field
        TextField usernameField     = new TextField();
        PasswordField passwordField = new PasswordField();

        //Font Style
        sceneTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        usernameLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        passwordLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        errorLoginMessage.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 12));


        //Font Color
        sceneTitle.setStyle("-fx-text-fill: #A11D9A;");
        errorLoginMessage.setStyle("-fx-text-fill: #FF1E1E;");

        //Font visible Settings
        errorLoginMessage.setVisible(false);

        //Button


        //Vbox
        final HBox hbox = new HBox(10);
        Button loginButtom = new Button("Login");
        hbox.getChildren().addAll(loginButtom);
        loginButtom.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        //loginButtom.setStyle("-fx-text-fill: #A11D9A;");
        loginButtom.setStyle("-fx-background-color: #A11D9A;");


        //Grid Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);

        grid.add(sceneTitle, 0,0);

        grid.add(usernameLabel, 0,1);
        grid.add(passwordLabel, 0,2);
        grid.add(errorLoginMessage, 0,3);

        grid.add(usernameField, 1,1);
        grid.add(passwordField, 1,2);

        grid.add(loginButtom, 1,3);

        grid.setVgap(10);
        grid.setHgap(5);

        //Create Window
        Scene scene =  new Scene(grid,1360,720);
        primaryStage.setScene(scene);
        primaryStage.show();


        //Action Button
        loginButtom.setOnAction(event ->{
            if(usernameField.getText().equals(Admin.adminusername) && passwordField.getText().equals(Admin.adminpassword)) {
                adminObj.menu();
                primaryStage.close();

            }else if(usernameField.getText().length() == 15 && passwordField.getText().length() < 15){

                try {
                    if(studentObj.isStudents(usernameField)){
                        studentObj.menu();
                        primaryStage.close();
                    }else{
                        errorLoginMessage.setVisible(true);
                    }
                } catch (IllegalAdminAccess pesanError) {
                    errorLoginMessage.setText(pesanError.getMessage());
                    errorLoginMessage.setVisible(true);
                }
            }else{
                errorLoginMessage.setVisible(true);
            }
        });

    }
}