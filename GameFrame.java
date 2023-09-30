package com.java.SnakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	GameFrame(){
		
		
//		GamePanel panel = new GamePanel();
//		this.add(panel);
		//The above both statements are equivalent to
		
		this.add(new GamePanel());
		
		this.setTitle("Snake");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
		
		this.pack();
		
		this.setVisible(true);
		
		this.setLocationRelativeTo(null) ;
	}
}
