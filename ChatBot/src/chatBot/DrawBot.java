/**
	 * Java. Chatbot
	 * 
	 * Class DrawBot
	 * @author Antonius
	 * @version 0.1 dated May 01, 2017
	 */
package chatBot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class DrawBot extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	final String TITLE_OF_PROGRAM = "BotAntik: chatbot";
	final int START_LOCATION = 200;
	final int WINDOW_WIDTH = 350;
	final int WINDOW_HEIGHT = 450;

	JTextPane dialogue; 			// area for dialog
	JCheckBox ai; 					// enable/disable AI
	JTextField message; 			// field for entering messages
	ChatBot ibot; 					// chat-bot class
	SimpleAttributeSet botStyle; 	// style bot-text

	public DrawBot() {
		setTitle(TITLE_OF_PROGRAM);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// area for dialog
		dialogue = new JTextPane();
		dialogue.setEditable(false);
		dialogue.setContentType("text/html");
		JScrollPane scrollBar = new JScrollPane(dialogue);

		// style for bot messages
		botStyle = new SimpleAttributeSet();
		StyleConstants.setItalic(botStyle, true);
		StyleConstants.setBold(botStyle, true);
		StyleConstants.setForeground(botStyle, Color.orange);
		StyleConstants.setAlignment(botStyle, StyleConstants.ALIGN_RIGHT);

		// panel for checkbox, message field and button
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		ai = new JCheckBox("AI");
		ai.doClick();
		message = new JTextField();
		message.addActionListener(this);
		JButton enter = new JButton("Enter");
		enter.addActionListener(this);

		// adding all elements to the window
		buttonPanel.add(ai);
		buttonPanel.add(message);
		buttonPanel.add(enter);

		add(BorderLayout.CENTER, scrollBar);
		add(BorderLayout.SOUTH, buttonPanel);
		setVisible(true);
		ibot = new ChatBot(); 	// creating object
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (message.getText().trim().length() > 0) {
			try {
				StyledDocument doc = dialogue.getStyledDocument();
				doc.insertString(doc.getLength(), message.getText() + "\n", new SimpleAttributeSet());
				doc.insertString(doc.getLength(),
						TITLE_OF_PROGRAM.substring(0, 9) + ibot.sayInReturn(message.getText(), ai.isSelected()) + "\n",
						botStyle);
			} catch (Exception e) {
			}
		}
		message.setText("");
		message.requestFocusInWindow();
	}

}