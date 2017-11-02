import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaCalc extends JFrame 
{
	private JTextField tfin,tfin1,tfout;
	private JButton plbtn,minbtn,mulbtn,divbtn,eqbtn,clrbtn;
	private double result=0;
	private char flag='F';

	public JavaCalc()
	{
		Container cp= getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(new JLabel ("Input1"));
		tfin1=new JTextField(10);
		cp.add(tfin1);

		cp.add(new JLabel ("Input2"));
		tfin=new JTextField(10);
		cp.add(tfin);

		plbtn=new JButton("+");
		cp.add(plbtn);

		minbtn=new JButton("-");
		cp.add(minbtn);

		mulbtn=new JButton("*");
		cp.add(mulbtn);

		divbtn=new JButton("/");
		cp.add(divbtn);

		eqbtn=new JButton("=");
		cp.add(eqbtn);

		clrbtn=new JButton("CLR");
		cp.add(clrbtn);

		cp.add(new JLabel ("Result"));
		tfout=new JTextField(10);
		tfout.setEditable(false);
		cp.add(tfout);

		//Action Listeners
		plbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='+';
			}
		});

		minbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='-';
			}
		});

		mulbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='*';
			}
		});

		divbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='/';
			}
		});

		clrbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				tfin.setText("");
				tfin1.setText("");
				tfout.setText("");
			}
		});

		eqbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				double num1=Double.parseDouble(tfin1.getText());
				double num2=Double.parseDouble(tfin.getText());
				switch(flag)
				{
					case '+':result=num1+num2;break;
					case '-':result=num1-num2;break;
					case '*':result=num1*num2;break;
					case '/':result=num1/num2;break;
				}
				tfout.setText(result+"");
			}
		});

		tfin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				double num1=Double.parseDouble(tfin1.getText());
				double num2=Double.parseDouble(tfin.getText());
				switch(flag)
				{
					case '+':result=num1+num2;break;
					case '-':result=num1-num2;break;
					case '*':result=num1*num2;break;
					case '/':result=num1/num2;break;
				}
				tfout.setText(result+"");
			}
		});

		//frame.setIconImage(ImageIO.read(new File("/Downloads/cal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setSize(200,250);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new JavaCalc();
			}
		});
	}
}
