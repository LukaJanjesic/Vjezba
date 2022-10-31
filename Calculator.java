package JAVA;

// Importaj 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//Baki bio blazen
class calculator extends JFrame implements ActionListener {
	// okvir
	static JFrame F;
	// prostor di idu brojevi
	static JTextField T;
	// store operator and operands (Ovo nisam siguran zasto, al vjerojatno cu koristit za mat. radnje )
	String num1, operator, num2;

	calculator()
	{
		num1 = operator = num2 = "";
	}

		public static void main(String args[])
	{
		// dodaj okvir
		F = new JFrame("calculator");
		F.setResizable(false);
		// napraviti objekt  klase
		calculator c = new calculator();
		// napraviti  textfield
		T = new JTextField(16);
		//  textfield je noneditable
		T.setEditable(false);
		// Dodaj brojeve, operatore, jednako i tocku
		JButton d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, da, ds, dd, dm, de, dc, deq;
		// Dodijeli vrijednost za brojeve
		d0 = new JButton("0");
		d1 = new JButton("1");
		d2 = new JButton("2");
		d3 = new JButton("3");
		d4 = new JButton("4");
		d5 = new JButton("5");
		d6 = new JButton("6");
		d7 = new JButton("7");
		d8 = new JButton("8");
		d9 = new JButton("9");
		//  Dodijeli vrijednost za =
		deq = new JButton("=");
		//  Dodijeli vrijednost za operatore
		da = new JButton("+");
		ds = new JButton("-");
		dd = new JButton("/");
		dm = new JButton("*");
		dc = new JButton("C");
		//  Dodijeli vrijednost za .
		de = new JButton(".");
		// Dodati panel (nisam ovo znao)
		JPanel p = new JPanel();
		// add action listeners
		dm.addActionListener(c);
		dd.addActionListener(c);
		ds.addActionListener(c);
		da.addActionListener(c);
		d9.addActionListener(c);
		d8.addActionListener(c);
		d7.addActionListener(c);
		d6.addActionListener(c);
		d5.addActionListener(c);
		d4.addActionListener(c);
		d3.addActionListener(c);
		d2.addActionListener(c);
		d1.addActionListener(c);
		d0.addActionListener(c);
		de.addActionListener(c);
		dc.addActionListener(c);
		deq.addActionListener(c);

		// dodajem sve elemente na panel
		p.add(T);
		p.add(da);
		p.add(d1);
		p.add(d2);
		p.add(d3);
		p.add(ds);
		p.add(d4);
		p.add(d5);
		p.add(d6);
		p.add(dm);
		p.add(d7);
		p.add(d8);
		p.add(d9);
		p.add(dd);
		p.add(de);
		p.add(d0);
		p.add(dc);
		p.add(deq);


		// dodati panel okviru to sam googlo
		F.add(p);

		F.setSize(220, 280);
		F.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();

		// if ako je vrijednost broj
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if ako je oprtator prisutan dodaj na drugi broj 
			if (!num1.equals(""))
				num2 = num2 + s;
			else
				num1 = num1 + s;

			// postaviti vrijednost teksta
			T.setText(num1 + operator + num2);
		}
		else if (s.charAt(0) == 'C') {
			//Ocisti 
			num1 = operator = num2 = "";

			T.setText(num1 + operator + num2);
		}
		else if (s.charAt(0) == '=') {

			double te;

			// moro sam guglat parseDouble da znam sta je a vidio sam da se koristi u puno primjera
			if (operator.equals("+"))
				te = (Double.parseDouble(num1) + Double.parseDouble(num2));
			else if (operator.equals("-"))
				te = (Double.parseDouble(num1) - Double.parseDouble(num2));
			else if (operator.equals("/"))
				te = (Double.parseDouble(num1) / Double.parseDouble(num2));
			else
				te = (Double.parseDouble(num1) * Double.parseDouble(num2));

	
			T.setText(num1 + operator + num2 + "=" + te);

			
			num1 = Double.toString(te);

			operator = num2 = "";
		}
		else {
			
			if (operator.equals("") || num2.equals(""))
				operator = s;
			
			else {
				double te;

				
				if (operator.equals("+"))
					te = (Double.parseDouble(num1) + Double.parseDouble(num2));
				else if (operator.equals("-"))
					te = (Double.parseDouble(num1) - Double.parseDouble(num2));
				else if (operator.equals("/"))
					te = (Double.parseDouble(num1) / Double.parseDouble(num2));
				else
					te = (Double.parseDouble(num1) * Double.parseDouble(num2));

			
				num1 = Double.toString(te);

				
				operator = s;

				
				num2 = "";
			}

			T.setText(num1 + operator + num2);
		}
	}
}
