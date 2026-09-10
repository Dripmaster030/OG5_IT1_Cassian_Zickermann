package de.futurehome.tanksimulator;
import java.awt.BorderLayout;
import java.awt.TextArea;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

@SuppressWarnings("serial")
public class TankSimulator extends Frame {
	
	public Tank myTank;
	

	TextArea log = new TextArea(10, 40);
	

	private Label lblUeberschrift = new Label("Tank-Simulator");
	public  Label lblFuellstand = new Label("     ");
	public Label lbProzent = new Label("    "); 
	
	public Button btnBeenden = new Button("Beenden");
	public Button btnEinfuellen = new Button("Einf�llen");
	public Button btnVerbrauchen = new Button("Verbrauchen");
	public Button btnZurücksetzten = new Button("Zurücksetzten");
	
	private Panel pnlNorth = new Panel();
	private Panel pnlCenter = new Panel(new FlowLayout());
	private Panel pnlSouth = new Panel(new GridLayout(1, 0));
	private Panel pnlWest = new Panel(new GridLayout(0, 1));
	
	private MyActionListener myActionListener = new MyActionListener(this);

	public TankSimulator() {
		super("Tank-Simulator");
		
		myTank = new Tank(0);
		
		this.lblUeberschrift.setFont(new Font("", Font.BOLD, 16));
		this.pnlNorth.add(this.lblUeberschrift);
		this.pnlCenter.add(this.lblFuellstand);
		this.pnlWest.add(this.lbProzent);
		this.pnlSouth.add(this.btnEinfuellen);
		this.pnlSouth.add(this.btnVerbrauchen);
		this.pnlSouth.add(this.btnZurücksetzten);
		this.pnlSouth.add(this.btnBeenden);
		
		
		this.add(this.pnlNorth, BorderLayout.NORTH);
		this.add(this.pnlCenter, BorderLayout.CENTER);
		this.add(this.pnlSouth, BorderLayout.SOUTH);
		this.add(this.pnlWest, BorderLayout.WEST);
		this.add(this.log, BorderLayout.EAST);
		this.pack();
		this.setVisible(true);
		
		// Ereignissteuerung
		this.btnEinfuellen.addActionListener(myActionListener);
		this.btnVerbrauchen.addActionListener(myActionListener);
		this.btnBeenden.addActionListener(myActionListener);
		this.btnZurücksetzten.addActionListener(myActionListener);
	}

	public static void main(String argv[]) {
		new TankSimulator();
	}
}