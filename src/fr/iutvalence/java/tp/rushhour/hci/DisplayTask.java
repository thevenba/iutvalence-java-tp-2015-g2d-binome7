/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

import fr.iutvalence.java.tp.rushhour.Board;
import fr.iutvalence.java.tp.rushhour.Level2;
import fr.iutvalence.java.tp.rushhour.interfaces.ControlOfRushHour;

/**
 * @author thevenba
 *
 */
public class DisplayTask implements ActionListener, Runnable, KeyListener
{
	/* private final ControlOfRushHour controller;*/
	
	private JFrame window;
	
	private BoardHci boardHci;
	
	private JSplitPane splitPane;

	private ControlButtonsHci controlButtonsHci;
	
	private Board board;

	/**
	 * 
	 */
	public DisplayTask(Board board)
	{
		this.board = board;
	}
	
	public void initGraphicInterface()
	{
		this.window = new JFrame();
		this.window.setTitle("Rush Hour");
		this.window.setSize(600, 600);
		this.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.window.setResizable(false);
		this.boardHci = new BoardHci(this, this.board);
		this.boardHci.setFocusable(false);
		this.controlButtonsHci = new ControlButtonsHci(this);
		this.splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, this.boardHci, this.controlButtonsHci);
		this.splitPane.setEnabled(false);
		this.splitPane.setResizeWeight(1.0);
		this.window.getContentPane().add(this.splitPane);
		this.window.addKeyListener(this);
		this.window.setVisible(true);
	}
	
	public void run()
	{
		this.initGraphicInterface();
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JComponent source = (JComponent) event.getSource();
		if (source.getParent() == this.controlButtonsHci.getResetButton())
		{
			this.boardHci.setBoardToDisplay(board);
			return;
		}
		if (source instanceof RhButton)
		{
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
