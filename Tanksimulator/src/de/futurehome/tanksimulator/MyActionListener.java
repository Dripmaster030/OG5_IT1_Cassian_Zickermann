package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);

		if (obj == f.btnEinfuellen) {
			double fuellstand = f.myTank.getFuellstand();
			if (fuellstand <200) {
				fuellstand = fuellstand + 5;
				f.log.append("5 Liter in Tank gefültt! \n");
				if ( fuellstand > 200) {
					fuellstand = 200;
				}
				f.myTank.setFuellstand(fuellstand);
				double prozent = fuellstand / 200 * 100;
				f.lbProzent.setText(prozent+"%");
				f.lblFuellstand.setText(""+fuellstand);}else {
					f.lblFuellstand.setText("Ihr Tank ist voll!	Sie haben 200L");
					f.lbProzent.setText(100+"%");
					f.log.append("Tank voll! \n");
				}
		}
		if (obj == f.btnVerbrauchen && f.myTank.getFuellstand() > 1) {
			double verbrauch = f.myTank.getFuellstand();
			verbrauch = verbrauch - 2;
			f.myTank.setFuellstand(verbrauch);
			double prozent = verbrauch / 200 * 100;
			f.lbProzent.setText(prozent+"%");
			f.lblFuellstand.setText(""+verbrauch);
			if (f.myTank.getFuellstand() == 0 || f.myTank.getFuellstand() == 1) {
				f.lblFuellstand.setText("Sie müssen tanken");
			}

		}
		if (obj == f.btnZurücksetzten) {
			double zurueck = f.myTank.getFuellstand();
			zurueck = zurueck - zurueck;
			f.myTank.setFuellstand(zurueck);
			f.lblFuellstand.setText(""+zurueck);
			f.lbProzent.setText(0+"%");
		}


	}

}