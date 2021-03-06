package gui.dialogs;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmDialog {
	private Stage window;
	public boolean confirm = false;
	
	public void display(String title, String message){
		Stage window = new Stage();
		this.window = window;
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		window.setMinHeight(100);
		window.setMaxWidth(500);
		
		Label label = new Label();
		label.setText(message);
		label.setMaxWidth(350);
		label.setWrapText(true);
		Button yesButton = new Button("Yes");
		Button noButton = new Button("Cancel");
		
		yesButton.setOnAction(e -> confirm());
		noButton.setOnAction(e -> window.close());
		
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(yesButton, noButton);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(10));
		VBox vbox = new VBox(15);
		vbox.getChildren().addAll(label, hbox);
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox);
		window.setScene(scene);
		window.showAndWait();
		
	}
	
	public void confirm(){
		
		this.confirm = true;
		this.window.close();
	}

	
	
}
