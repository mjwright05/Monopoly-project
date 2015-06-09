import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
public class Driver implements ActionListener {
	JFrame boardFrame = new JFrame("Monopoly");
	JFrame p1Frame = new JFrame("Player 1");
	JFrame p2Frame = new JFrame("Player2");
	JPanel p1Panel = new JPanel();
	JPanel p2Panel = new JPanel();
	BoardPanel boardPanel;
	DefaultListModel[] dList = new DefaultListModel[40];
	JList[] myList = new JList[40];
	JButton[] squares = new JButton[40];
	GridBagConstraints c = new GridBagConstraints();
	FlowLayout Layout = new FlowLayout();
	JLabel p1Money = new JLabel("$1500");
	JLabel p2Money = new JLabel("$1500");
	JLabel p1Name = new JLabel("                              Player 1                              ");
	JLabel p2Name = new JLabel("                              Player 2                              ");
	JButton p1BuyHouse = new JButton("                  Buy House/Hotel                  ");
	JButton p1BuyStreet = new JButton("                  Buy Street                  ");
	JButton roll = new JButton("Roll");
	JButton p2BuyHouse = new JButton("                  Buy House/Hotel                  ");
	JButton p2BuyStreet = new JButton("                  Buy Street                  ");
	JButton p1EndTurn = new JButton("                  End Turn                  ");
	JButton p2EndTurn = new JButton("                  End Turn                  ");
	JFrame p1Properties = new JFrame("P1 Properties");
	JPanel p1PropertiesPanel = new JPanel();
	JLabel p1PropLabel = new JLabel("     Player 1 Properties:     ");
	ArrayList<JButton> p1Prop = new ArrayList();
	MonopolyGame myGame = new MonopolyGame();
	JFrame p2Properties = new JFrame("P2 Properties");
	JPanel p2PropertiesPanel = new JPanel();
	JLabel p2PropLabel = new JLabel("     Player 2 Properties:     ");
	ArrayList<JButton> p2Prop = new ArrayList();
	boolean canRoll = true;
	int turn = 0;
	int numP1 = 0;
	int numP2 = 0;
	public static void main(String[] args) {
		new Driver();
	}
	
	public Driver(){
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("monopoly.jpg"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		boardPanel = new BoardPanel(img);
		boardPanel.setLayout(new GridBagLayout());
		c.gridx = 10;
		c.gridy = 10;
		c.ipady = 15;
		c.ipadx = 70;
		dList[0] = new DefaultListModel();
		dList[0].addElement("p1");
		dList[0].addElement("p2");
		myList[0] = new JList(dList[0]);
		//myList[i].setPreferredSize(new Dimension(30, 45));
		myList[0].setLayoutOrientation(JList.VERTICAL);
		myList[0].setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		myList[0].setOpaque(false);
		myList[0].setBorder(BorderFactory.createLineBorder(Color.black));
		for(int i = 1; i < 40;i++)
		{
			squares[i] = new JButton("");
			squares[i].setPreferredSize(new Dimension(70, 60));
			squares[i].setOpaque(false);
			squares[i].setContentAreaFilled(false);
			dList[i] = new DefaultListModel();
			dList[i].addElement("  ");
			dList[i].addElement("  ");
			myList[i] = new JList(dList[i]);
			//myList[i].setPreferredSize(new Dimension(30, 45));
			myList[i].setLayoutOrientation(JList.VERTICAL);
			myList[i].setOpaque(false);
			myList[i].setBorder(BorderFactory.createLineBorder(Color.black));
		}
		//boardPanel.add(squares[0],c);
		boardPanel.add(myList[0],c);
		c.gridx = 9;
		c.gridy = 10;
		c.ipadx = 54;
		for(int i = 1; i <11; i++)
		{
			//boardPanel.add(squares[i],c);
			boardPanel.add(myList[i],c);
			c.gridx--;
			if(c.gridx == 0)
			{
				c.ipadx = 70;
			}
		}
		c.ipadx = 70;
		c.gridx = 0;
		c.gridy = 9;
		//boardPanel.add(squares[11],c);
		boardPanel.add(myList[11],c);
		c.gridx = 0;
		c.gridy = 8;
		//boardPanel.add(squares[12],c);
		boardPanel.add(myList[12],c);
		c.gridx = 0;
		c.gridy = 7;
		//boardPanel.add(squares[13],c);
		boardPanel.add(myList[13],c);
		c.gridx = 0;
		c.gridy = 6;
		//boardPanel.add(squares[14],c);
		boardPanel.add(myList[14],c);
		c.gridx = 0;
		c.gridy = 5;
		//boardPanel.add(squares[15],c);
		boardPanel.add(myList[15],c);
		c.gridx = 0;
		c.gridy = 4;
		//boardPanel.add(squares[16],c);
		boardPanel.add(myList[16],c);
		c.gridx = 0;
		c.gridy = 3;
		//boardPanel.add(squares[17],c);
		boardPanel.add(myList[17],c);
		c.gridx = 0;
		c.gridy = 2;
		//boardPanel.add(squares[18],c);
		boardPanel.add(myList[18],c);
		c.gridx = 0;
		c.gridy = 1;
		//boardPanel.add(squares[19],c);
		boardPanel.add(myList[19],c);
		c.gridx = 0;
		c.gridy = 0;
		for(int i = 20; i <30; i++)
		{
			boardPanel.add(myList[i],c);
			c.gridx++;
			if(c.gridx == 10)
			{
				c.ipadx =70;
			}
			else
			{
				c.ipadx = 54;
			}
		}
		//boardPanel.add(squares[30],c);
		boardPanel.add(myList[30],c);
		c.gridx = 10;
		c.gridy = 1;
		//boardPanel.add(squares[31],c);
		boardPanel.add(myList[31],c);
		c.gridx = 10;
		c.gridy = 2;
		//boardPanel.add(squares[32],c);
		boardPanel.add(myList[32],c);
		c.gridx = 10;
		c.gridy = 3;
		//boardPanel.add(squares[33],c);
		boardPanel.add(myList[33],c);
		c.gridx = 10;
		c.gridy = 4;
		//boardPanel.add(squares[34],c);
		boardPanel.add(myList[34],c);
		c.gridx = 10;
		c.gridy = 5;
		//boardPanel.add(squares[35],c);
		boardPanel.add(myList[35],c);
		c.gridx = 10;
		c.gridy = 6;
		//boardPanel.add(squares[36],c);
		boardPanel.add(myList[36],c);
		c.gridx = 10;
		c.gridy = 7;
		//boardPanel.add(squares[37],c);
		boardPanel.add(myList[37],c);
		c.gridx = 10;
		c.gridy = 8;
		//boardPanel.add(squares[38],c);
		boardPanel.add(myList[38],c);
		c.gridx = 10;
		c.gridy = 9;
		//boardPanel.add(squares[39],c);
		boardPanel.add(myList[39],c);
		c.gridx = 4;
		c.gridy = 5;
		c.gridwidth = 3;
		c.ipady = 25;
		int x = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getX()-650);
		int y = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getY()-310); 
		roll.addActionListener(this);
		p1BuyHouse.addActionListener(this);
		p1BuyStreet.addActionListener(this);
		p2BuyHouse.addActionListener(this);
		p2BuyStreet.addActionListener(this);
		p1EndTurn.addActionListener(this);
		p2EndTurn.addActionListener(this);
		boardPanel.add(roll, c);
		boardFrame.add(boardPanel);
		p1Panel.add(p1Name);
		p1Panel.add(p1Money);
		p1Panel.add(p1BuyHouse);
		p1Panel.add(p1BuyStreet);
		p1Panel.add(p1EndTurn);
		p1Frame.add(p1Panel);
		p1Frame.setSize(250, 200);
		p1Frame.setLocation(x,y);
		p1Frame.setVisible(true);
		p1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1Frame.setResizable(false);
		p1PropertiesPanel.add(p1PropLabel);
		p1Properties.add(p1PropertiesPanel);
		x = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getX()-650);
		y = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getY()-100); 
		p1Properties.setSize(250, 400);
		p1Properties.setLocation(x,y);
		p1Properties.setVisible(true);
		p1Properties.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1Properties.setResizable(false);
		p2PropertiesPanel.add(p2PropLabel);
		p2Properties.add(p2PropertiesPanel);
		p2Properties.setSize(250, 400);
		x = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getX()+400);
		y = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getY()-100); 
		p2Properties.setLocation(x,y);
		p2Properties.setVisible(true);
		p2Properties.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p2Properties.setResizable(false);
		p2Panel.add(p2Name);
		p2Panel.add(p2Money);
		p2Panel.add(p2BuyHouse);
		p2Panel.add(p2BuyStreet);
		p2Panel.add(p2EndTurn);
		x = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getX()+400);
		y = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().getY()-310); 
		p2Frame.add(p2Panel);
		p2Frame.setSize(250, 200);
		p2Frame.setLocation(x,y);
		p2Frame.setVisible(true);
		p2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p2Frame.setResizable(false);
		boardFrame.setSize(770,660);
		boardFrame.setLocationRelativeTo(null);
		boardFrame.setVisible(true);
		boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardFrame.setResizable(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() ==roll )
		{
			if(canRoll)
			{
				myGame.playRound();
				for(int i =0; i<40;i++)
				{
					if(myGame.getPlayer(0).getLocation() == i)
					{
						dList[i].setElementAt("p1", 0);
						myList[i].setModel(dList[i]);
					}
					else
					{
						dList[i].setElementAt(" ", 0);
						myList[i].setModel(dList[i]);
					}
					
					if(myGame.getPlayer(1).getLocation() == i)
					{
						dList[i].setElementAt("p2", 1);
						myList[i].setModel(dList[i]);
					}
					else
					{
						dList[i].setElementAt("  ", 1);
						myList[i].setModel(dList[i]);
					}
					canRoll = false;
				}
				
				if(myGame.getTurn() % 2 ==0 )
				{
					if((myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation())).getOwner() == myGame.getPlayer(1) && ((myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation())).getOwner() != null))
					{
						myGame.getPlayer(0).pay(((Street)myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation())).getRent());
						myGame.getPlayer(1).addMoney(((Street)myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation())).getRent());
					}
				}
				else if(myGame.getTurn() % 2 ==1 )
				{
					if((myGame.getBoard().getSquare(myGame.getPlayer(1).getLocation())).getOwner() == myGame.getPlayer(0) && ((myGame.getBoard().getSquare(myGame.getPlayer(1).getLocation())).getOwner() != null))
					{
						myGame.getPlayer(1).pay(((Street)myGame.getBoard().getSquare(myGame.getPlayer(1).getLocation())).getRent());
						myGame.getPlayer(0).addMoney(((Street)myGame.getBoard().getSquare(myGame.getPlayer(1).getLocation())).getRent());
					}
				}
				p1Money.setText("$" + myGame.getPlayer(0).getMoney());
				p2Money.setText("$" + myGame.getPlayer(1).getMoney());
			}
			
		}
		
		if(e.getSource() == p1EndTurn)
		{
			if(myGame.getTurn() %2 == 0)
			{
				myGame.endTurn();
				canRoll = true;
			}
			
			if(((Jail)(myGame.getBoard().getJail())).getPrisoner() == myGame.getPlayer(1))
			{
				if(myGame.getPlayer(0).getLocation() != 10)
				{
					dList[10].setElementAt("p2", 1);
					myList[10].setModel(dList[10]);
				}
				else
				{
					dList[10].setElementAt("p1", 0);
					dList[10].setElementAt("p2", 1);
					myList[10].setModel(dList[10]);
				}
				Object[] options = {"Roll",
	                    "Use get out card",
	                    "pay $50"};
				int reply = JOptionPane.showOptionDialog(null,"You are in Jail.  Pick a way to get out.","Jail",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				if(reply == JOptionPane.YES_OPTION)
				{
					int roll = ((Jail)myGame.getBoard().getJail()).roll();
					myGame.getPlayer(1).move(roll);
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
				else if(reply == JOptionPane.NO_OPTION)
				{
					myGame.getPlayer(1).takeTurn();
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
				else if(reply == JOptionPane.CANCEL_OPTION)
				{
					myGame.getPlayer(1).pay(50);
					p2Money.setText("$"+myGame.getPlayer(1).getMoney());
					myGame.playRound();
					((Jail)myGame.getBoard().getJail()).letOut();
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
			}
		}
		if(e.getSource() == p2EndTurn)
		{
			if(myGame.getTurn() %2 == 1)
			{
				myGame.endTurn();
				canRoll = true;
			}
			
			if(((Jail)(myGame.getBoard().getJail())).getPrisoner() == myGame.getPlayer(0))
			{
				if(myGame.getPlayer(1).getLocation() != 10)
				{
					dList[10].setElementAt("p1", 0);
					myList[10].setModel(dList[10]);
				}
				else
				{
					dList[10].setElementAt("p1", 0);
					dList[10].setElementAt("p2", 1);
					myList[10].setModel(dList[10]);
				}
				Object[] options = {"Roll",
	                    "Use get out card",
	                    "pay $50"};
				int reply1 = JOptionPane.showOptionDialog(null,"You are in Jail.  Pick a way to get out.","Jail",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				if(reply1 == JOptionPane.YES_OPTION)
				{
					int roll1 = ((Jail)myGame.getBoard().getJail()).roll();
					myGame.getPlayer(0).move(roll1);
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
				else if(reply1 == JOptionPane.NO_OPTION)
				{
					myGame.getPlayer(0).takeTurn();
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
				else if(reply1 == JOptionPane.CANCEL_OPTION)
				{
					myGame.getPlayer(0).pay(50);
					p1Money.setText("$"+myGame.getPlayer(0).getMoney());
					myGame.playRound();
					((Jail)myGame.getBoard().getJail()).letOut();
					for(int i =0; i<40;i++)
					{
						if(myGame.getPlayer(0).getLocation() == i)
						{
							dList[i].setElementAt("p1", 0);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt(" ", 0);
							myList[i].setModel(dList[i]);
						}
						
						if(myGame.getPlayer(1).getLocation() == i)
						{
							dList[i].setElementAt("p2", 1);
							myList[i].setModel(dList[i]);
						}
						else
						{
							dList[i].setElementAt("  ", 1);
							myList[i].setModel(dList[i]);
						}
						canRoll = false;
					}
				}
			}
		}
		if(e.getSource() == p1BuyStreet)
		{
			if(myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation()).getOwner() == null)
			{
			myGame.playerBuyLocation(myGame.getPlayer(0).getLocation());
			p1Money.setText("$"+myGame.getPlayer(0).getMoney());
			p1Prop.add(new JButton("   "+myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation()).getName()+"   "));
			p1Prop.get(numP1).addActionListener(this);
			p1PropertiesPanel.add(p1Prop.get(numP1));
			myList[myGame.getPlayer(0).getLocation()].setBackground(Color.red);
			p1Properties.revalidate();
			p1Properties.repaint();
			numP1++;
			}
		}
		if(e.getSource() == p2BuyStreet)
		{
			if(myGame.getBoard().getSquare(myGame.getPlayer(0).getLocation()).getOwner() == null)
			{
			myGame.playerBuyLocation(myGame.getPlayer(1).getLocation());
			p2Money.setText("$"+myGame.getPlayer(1).getMoney());
			p2Prop.add(new JButton("     "+myGame.getBoard().getSquare(myGame.getPlayer(1).getLocation()).getName()+"     "));
			p2Prop.get(numP2).addActionListener(this);
			p2PropertiesPanel.add(p2Prop.get(numP2));
			myList[myGame.getPlayer(1).getLocation()].setBackground(Color.blue);
			p2Properties.revalidate();
			p2Properties.repaint();
			numP2++;
			}
		}
		
		for(int i = 0; i < p1Prop.size(); i++)
		{
			if(e.getSource() == p1Prop.get(i))
			{
				int reply2 = JOptionPane.showConfirmDialog(null,"Number of Houses: "+((Street) (myGame.getPlayer(0).getProperty(i))).getHouses()+ "\n Would you like to buy another house?","Houses",JOptionPane.YES_NO_OPTION);
				if(reply2 == JOptionPane.YES_OPTION)
				{
					myGame.getPlayer(0).buyHouse(i);
					p1Money.setText("$" + myGame.getPlayer(0).getMoney());
				}
			}
		}
		for(int i = 0; i < p2Prop.size(); i++)
		{
			if(e.getSource() == p2Prop.get(i))
			{
				int reply = JOptionPane.showConfirmDialog(null,"Number of Houses: "+((Street) (myGame.getPlayer(1).getProperty(i))).getHouses()+ "\n Would you like to buy another house?","Houses",JOptionPane.YES_NO_OPTION);
				if(reply == JOptionPane.YES_OPTION)
				{
					myGame.getPlayer(1).buyHouse(i);
					p2Money.setText("$" + myGame.getPlayer(1).getMoney());
				}
			}
		}
	}
	
}

