package HousePainting;
import java.awt.*;
import java.awt.event.*;
public class HousePainting extends Frame {
////////////////////CONSTRUCTOR //////////////////////////
	HousePainting(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		setSize(500, 300);
		setVisible(true);
	}
//////////////METHOD MAIN FOR CODE RUNNING ////////////////
	public static void main(String[] args) {
		HousePainting painter = new HousePainting("AutoPainter");
	}
	//// variables for intialization //////////////
	int yCabina = 60, cabinaHeight = 50;
	int xMotor = 100, motorWight = 290, motorHeight = 70;
	int diameter = 50;
	int shiftMotorCabina = 70, shiftMotorLeftWheel = 30;
	//////////// variables for calculation //////////////////
	int xCabina = xMotor + shiftMotorCabina;
	int cabinaWight = motorWight - shiftMotorCabina * 2;
	int yMotor = yCabina + cabinaHeight;
	int xLeftWheel = xMotor + shiftMotorLeftWheel;
	int yWheel = yMotor + motorHeight;
	int xRightWheel = xMotor + motorWight - shiftMotorLeftWheel - diameter;
///////// METHOD PAINT FOR SHAPES PAINT //////////////
	public void paint(Graphics painter) { /// API (aplication programm interface)
		painter.drawRect( xCabina, yCabina, cabinaWight, cabinaHeight); /////// cabina
		//                   x  	  y  	 width 		   height
		painter.drawRect( xMotor, yMotor, motorWight, motorHeight); /////// motor
		painter.drawOval( xLeftWheel, yWheel, diameter, diameter); ////// left wheel
		painter.drawOval( xRightWheel, yWheel, diameter, diameter); ////// right wheel
	}
}
