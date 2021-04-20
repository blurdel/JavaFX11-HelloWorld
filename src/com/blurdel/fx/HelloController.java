package com.blurdel.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {

	@FXML
	private Label label;
	
	
	public void initialize() {
		String version = System.getProperty("java.version");
        String fxVersion = System.getProperty("javafx.version");
        
        label.setText("Java version:" + version + "\nJavaFX version:" + fxVersion + ".");		
	}
	
}
