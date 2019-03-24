package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import logic.CalcLogic;

public class MCalcController {
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Button button3;
	@FXML
	Button button4;
	@FXML
	Button button5;
	@FXML
	Button button6;
	@FXML
	Button button7;
	@FXML
	Button button8;
	@FXML
	Button button9;
	@FXML
	Button button0;
	@FXML
	Button button00;
	@FXML
	Button buttonPercent;
	@FXML
	Button buttonMulti;
	@FXML
	Button buttonPlus;
	@FXML
	Button buttonPoint;
	@FXML
	Button buttonDivide;
	@FXML
	Button buttonEqual;
	@FXML
	TextField text_Show;

	String str="";

	CalcLogic calcLogic = new CalcLogic();

	@FXML void onButtonClicked(ActionEvent e){
		if(e.getSource().equals(button1)) {
			str+="1";
		}else if(e.getSource().equals(button2)) {
			str+="2";
		}else if(e.getSource().equals(button3)) {
			str+="3";
		}else if(e.getSource().equals(button4)) {
			str+="4";
		}else if(e.getSource().equals(button5)) {
			str+="5";
		}else if(e.getSource().equals(button6)) {
			str+="6";
		}else if(e.getSource().equals(button7)) {
			str+="7";
		}else if(e.getSource().equals(button8)) {
			str+="8";
		}else if(e.getSource().equals(button9)) {
			str+="9";
		}else if(e.getSource().equals(button0)) {
			str+="0";
		}else if(e.getSource().equals(button00)) {
			str+="00";
		}
		text_Show.setText(str);
	}
}