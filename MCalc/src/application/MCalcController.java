package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import logic.CalcLogic;

public class MCalcController {
	int flag = 0;
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
	Button buttonMinus;
	@FXML
	Button buttonEqual;
	@FXML
	Button buttonAC;
	@FXML
	Button buttonC;
	@FXML
	TextField text_Show;

	String str = "";

	CalcLogic calcLogic = new CalcLogic();

	class Item {
		final static int PLUS = 1;
		final static int MINUS = 2;
		final static int MULTI = 3;
		final static int DIVIDE = 4;

		int sign;
		int num;
	}

	Item[] items = new Item[2];
	int now = 1;

	public MCalcController() {
		items[0] = new Item();
		items[1] = new Item();
	}

	@FXML
	void onButtonClicked(ActionEvent e) {
		if (flag == 1) {
			str = "";
			flag = 0;
		}
		if (e.getSource().equals(button1)) {
			str += "1";
		} else if (e.getSource().equals(button2)) {
			str += "2";
		} else if (e.getSource().equals(button3)) {
			str += "3";
		} else if (e.getSource().equals(button4)) {
			str += "4";
		} else if (e.getSource().equals(button5)) {
			str += "5";
		} else if (e.getSource().equals(button6)) {
			str += "6";
		} else if (e.getSource().equals(button7)) {
			str += "7";
		} else if (e.getSource().equals(button8)) {
			str += "8";
		} else if (e.getSource().equals(button9)) {
			str += "9";
		} else if (e.getSource().equals(button0)) {
			str += "0";
		} else if (e.getSource().equals(button00)) {
			str += "00";
		}

		if (e.getSource().equals(buttonPlus)) {
			if (now == 1) {
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.PLUS;
				str = "";
				now = 2;
			} else if (now == 2) {
				items[1].num = Integer.valueOf(str);
				switch (items[1].sign) {
				case Item.PLUS:
					str = String.valueOf(items[0].num + items[1].num);
					break;
				case Item.MINUS:
					str = String.valueOf(items[0].num - items[1].num);
					break;
				case Item.MULTI:
					str = String.valueOf(items[0].num * items[1].num);
					break;
				case Item.DIVIDE:
					str = String.valueOf(items[0].num / items[1].num);
					break;
				}
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.PLUS;
				flag = 1;
			}
		}
		if (e.getSource().equals(buttonMinus)) {
			if (now == 1) {
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.MINUS;
				str = "";
				now = 2;

			} else if (now == 2) {
				items[1].num = Integer.valueOf(str);
				switch (items[1].sign) {
				case Item.PLUS:
					str = String.valueOf(items[0].num + items[1].num);
					break;
				case Item.MINUS:
					str = String.valueOf(items[0].num - items[1].num);
					break;
				case Item.MULTI:
					str = String.valueOf(items[0].num * items[1].num);
					break;
				case Item.DIVIDE:
					str = String.valueOf(items[0].num / items[1].num);
					break;
				}
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.MINUS;
				flag = 1;
			}
		}
		if (e.getSource().equals(buttonMulti)) {
			if (now == 1) {
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.MULTI;
				str = "";
				now = 2;
			} else if (now == 2) {
				items[1].num = Integer.valueOf(str);
				switch (items[1].sign) {
				case Item.PLUS:
					str = String.valueOf(items[0].num + items[1].num);
					break;
				case Item.MINUS:
					str = String.valueOf(items[0].num - items[1].num);
					break;
				case Item.MULTI:
					str = String.valueOf(items[0].num * items[1].num);
					break;
				case Item.DIVIDE:
					str = String.valueOf(items[0].num / items[1].num);
					break;
				}
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.MULTI;
				flag = 1;

			}
		}
		if (e.getSource().equals(buttonDivide)) {
			if (now == 1) {
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.DIVIDE;
				str = "";
				now = 2;
			} else if (now == 2) {
				items[1].num = Integer.valueOf(str);
				switch (items[1].sign) {
				case Item.PLUS:
					str = String.valueOf(items[0].num + items[1].num);
					break;
				case Item.MINUS:
					str = String.valueOf(items[0].num - items[1].num);
					break;
				case Item.MULTI:
					str = String.valueOf(items[0].num * items[1].num);
					break;
				case Item.DIVIDE:
					str = String.valueOf(items[0].num / items[1].num);
					break;
				}
				items[0].num = Integer.valueOf(str);
				items[1].sign = Item.DIVIDE;
				flag = 1;
			}
		}
		if (e.getSource().equals(buttonEqual)) {
			if (now == 2) {
				items[1].num = Integer.valueOf(str);
				switch (items[1].sign) {
				case Item.PLUS:
					str = String.valueOf(items[0].num + items[1].num);
					break;
				case Item.MINUS:
					str = String.valueOf(items[0].num - items[1].num);
					break;
				case Item.MULTI:
					str = String.valueOf(items[0].num * items[1].num);
					break;
				case Item.DIVIDE:
					str = String.valueOf(items[0].num / items[1].num);
					break;
				}
				items[0].num = Integer.valueOf(str);
				flag = 1;
			}
		}
		if (e.getSource().equals(buttonAC)) {
			str = "";
			items[0].num = 0;
			items[1].num = 0;
			now = 1;

		}
		if (e.getSource().equals(buttonC)) {
			//TODO クリアボタン(現在の項のみ)
		}
		text_Show.setText(str);
	}
}