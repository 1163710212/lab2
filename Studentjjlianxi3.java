package HuiTu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Timer;
import java.util.TimerTask;

public class Studentjjlianxi3 extends JFrame implements ActionListener {

	JPanel mb1,mb2,mb3;
	JTextField huida;
	JLabel bq1,bq2,bq3,bq4,bq5,bq6,bq7,bq8,bq9;
	JButton but,but1;
	int a,b,c,d,f=0,g=0 ,second=59, min=29;
	float r=0;
	String RorF=null,jj="+";
	boolean but1c=true;
	public static void main(String[] args)
	{
		Studentjjlianxi3 sj=new Studentjjlianxi3();
       
	}
	
	public Studentjjlianxi3()
	{
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		mb1.setLayout(new GridLayout(1,5));
		mb2.setLayout(new GridLayout(1,3));
		mb3.setBackground(Color.GRAY);
		mb3.setLayout(new GridLayout(1,4));
		mb1.setBounds(70, 80, 400, 60);
        mb2.setBounds(270, 170, 300, 50);
        mb3.setBounds(000, 00, 600, 50);
		
		jjrandom();
		
		bq9=new JLabel("ʣ��ʱ�䣺30:00",JLabel.CENTER);
		Timer time=new Timer();
		time.schedule(new TimerTask(){

			public void run() {
			
				if(second==0)
				{
					f=f*2;
					JOptionPane.showMessageDialog(null, "�÷֣�"+f, "�������",JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
				if(second==0)
				{
					second=59;
					min--;
				}else{
					second--;
				}
				if(min>0)
				bq9.setText("ʣ��ʱ�䣺"+min+":"+second);
				
				
			}} , 0, 1000);
		
		
		
		String astr=a+"";
		String bstr=b+"";
		bq1=new JLabel(astr,JLabel.CENTER);
		bq2=new JLabel(bstr,JLabel.CENTER);
		bq4=new JLabel(jj,JLabel.CENTER);
		bq3=new JLabel(RorF,JLabel.CENTER);
		bq5=new JLabel("=",JLabel.CENTER);
		bq6=new JLabel("��Ŀ������50");
		bq7=new JLabel("���������0��");
		bq8=new JLabel("��������0��");
		
		huida=new JTextField();
		
		but=new JButton("�ύ");
		but1=new JButton("��һ��");
		
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
        
        mb3.add(bq6);
        mb3.add(bq7);
        mb3.add(bq8);
        mb3.add(bq9);
        
        
        this.setLayout(null);
        this.add(mb1);
        this.add(mb2);
        this.add(mb3);
        this.setSize(600,270);
        this.setLocation(500, 300);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
		
	}
	public void jjrandom(){
		a=(int) (Math.random()*100);
		b=(int) (Math.random()*100);
		//System.out.println(a);
		if(a<b)
		{
			int change=a;
			a=b;
			b=change;
		}
		c=a+b;
		d=a-b;
		f=a*b;
		r=(float)a/(float)b;
		r=(float)( Math.round(r*10))/10;
	    //System.out.println(r);
		
		int d1=(int)(Math.random()*4+1);
		if(d1==1){
			jj="+";
		}else if(d1==2){
			jj="-";
		}else if(d1==3)
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
			float hdint = 0;
			try {
				hdint = Float.parseFloat(hdstr);
			//	hdint=((float)Math.round(hdint*10))/10;
				
			} catch (NumberFormatException et) {
			    et.printStackTrace();
			}
			
			if(hdint==c&&jj.equals("+"))
			{
				if(but1c)
				{
					RorF="��";
					f++;
					 
					
				}
			}else if(hdint!=c&&jj.equals("+"))
			{
				RorF="��";
			}else if(hdint==d&&jj.equals("-"))
			{
				if(but1c)
				{
					RorF="��";
					f++;
				}
				
			}else if(hdint!=d&&jj.equals("-"))
			{
				RorF="��";
			}else if(hdint==f&&jj.equals("*"))
			{
				RorF="��";
				f++;
			}else if(hdint!=f&&jj.equals("*"))
			{
				RorF="��";
			}else if(hdint==r&&jj.equals("/"))
			{
				RorF="��";
				f++;
			}else if(hdint!=r&&jj.equals("/"))
			{
				RorF="��";
			}
			if(but1c)
			bq3.setText(RorF);
			bq8.setText("���������"+f+"��");
			bq8.setText("��������"+g+"��");
			but1c=false;
		}
		if(e.getActionCommand().equals("2"))
		{
			huida.setText("");
			g++;
			but1c=true;
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
			bq8.setText("��������"+g+"��");
		}
		
	}

}
