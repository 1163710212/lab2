

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Studentjjlianxi extends JFrame implements ActionListener {

	JPanel mb1,mb2;
	JTextField huida;
	JLabel bq1,bq2,bq3,bq4,bq5;
	JButton but,but1;
	int a,b,c,d,f;
	float g;
	String RorF=null,jj="+";
	public static void main(String[] args)
	{
		Studentjjlianxi sj=new Studentjjlianxi();
	}
	
	public Studentjjlianxi()
	{
		mb1=new JPanel();
		mb2=new JPanel();
		mb1.setLayout(new GridLayout(1,5));
		mb2.setLayout(new GridLayout(1,3));
		jjrandom();
       
		String astr=a+"";
		String bstr=b+"";
		bq1=new JLabel(astr,JLabel.CENTER);
		bq2=new JLabel(bstr,JLabel.CENTER);
		bq4=new JLabel(jj,JLabel.CENTER);
		bq3=new JLabel(RorF,JLabel.CENTER);
		bq5=new JLabel("=",JLabel.CENTER);
	//	mb1.setBackground(Color.RED);
		
		huida=new JTextField();
		
		but=new JButton("提交");
		but1=new JButton("下一题");
		
		but.addActionListener(this);
		but.setActionCommand("1");
		
		but1.addActionListener(this);
		but1.setActionCommand("2");
		
        mb1.add(bq1);
        mb1.add(bq4);
        mb1.add(bq2);
        mb1.add(bq5);
        mb1.add(huida);
        mb2.add(bq3);
        mb2.add(but);
        mb2.add(but1);
        mb1.setBounds(0, 0, 400, 80);
        mb2.setBounds(0, 80, 400, 80);
        this.setLayout(null);
        this.add(mb1);
        this.add(mb2);
        this.setSize(400,200);
        this.setLocation(500, 300);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
		
	}
	public void jjrandom(){
		a=(int) (Math.random()*100);
		b=(int) (Math.random()*100);
		if(a<b)
		{
			int change=a;
			a=b;
			b=change;
		}
		c=a+b;
		d=a-b;
		f=a*b;
		g=(float)a/(float)b;
		g=(float)( Math.round(g*10))/10;
	    System.out.println(g);
		
		int d=(int)(Math.random()*4+1);
		System.out.println(d);
		if(d==1){
			jj="+";
		}else if(d==2){
			jj="-";
		}else if(d==3)
		{
			jj="*";
		}else {
			jj="/";
		}
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("1"))
		{
			String hdstr=huida.getText();
			float hdint =0;
			try {
			     hdint = Float.parseFloat(hdstr);
			  //   System.out.println(hdint);
			} catch (NumberFormatException et) {
			    et.printStackTrace();
			}
			if(hdint==c&&jj.equals("+"))
			{
				RorF="√";
			}else if(hdint!=c&&jj.equals("+"))
			{
				RorF="×";
			}else if(hdint==d&&jj.equals("-"))
			{
				RorF="√";
			}else if(hdint!=d&&jj.equals("-"))
			{
				RorF="×";
			}else if(hdint==f&&jj.equals("*"))
			{
				RorF="√";
			}else if(hdint!=f&&jj.equals("*"))
			{
				RorF="×";
			}else if(hdint==g&&jj.equals("/"))
			{
				RorF="√";
			}else if(hdint!=g&&jj.equals("/"))
			{
				RorF="×";
			}
			System.out.println("fdsf");
			bq3.setText(RorF);
		}
		if(e.getActionCommand().equals("2"))
		{
			huida.setText("");
			System.out.println("fdfl");
			jjrandom();
			String as=a+"";
			String bs=b+"";
			System.out.println(as);
			RorF=null;
			bq3.setText(RorF);
			bq1.setText(as);
			bq2.setText(bs);
			bq4.setText(jj);
		}
		
	}

}
