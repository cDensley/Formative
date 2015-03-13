package formative.controller;

import javax.swing.JOptionPane;

public class Formative
{

	
	public void start()
	{
		formativeGUI();
	}
	
	private void formativeGUI()
	{
		String myAnswer = JOptionPane.showInputDialog(null, "What is your major? Insert m for mathematics, c for computer science, or i for information technology.");
		if(myAnswer.equals("m"))
		{
			JOptionPane.showMessageDialog(null, "Nice! Mathematics have always interested me.");
		}
		else if(myAnswer.equals("m"))
		{
			JOptionPane.showMessageDialog(null, "Good for you! Code is so useful in so many ways.");
		}
		else if(myAnswer.equals("i"))
		{
			JOptionPane.showMessageDialog(null, "That's awesome! My cousin majored in that and she loved it.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That wasn't one of the choices!");
		}
		
		String myAnswer1 = JOptionPane.showInputDialog(null, "What year are you in school? Insert 1 for freshman, 2 for sophomore, 3 for junior, or 4 for senior.");
		if(myAnswer1.equals("1"))
		{
			JOptionPane.showMessageDialog(null, "Fresh meat, eh?");
		}
		else if(myAnswer1.equals("2"))
		{
			JOptionPane.showMessageDialog(null,  "Ah, so you're getting the hang of things now?" );
		}
		else if(myAnswer1.equals("3"))
		{
			JOptionPane.showMessageDialog(null,  "Cool, just two years to go!" );
		}
		else if(myAnswer1.equals("2"))
		{
			JOptionPane.showMessageDialog(null,  "That's great! Final year!" );
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "That wasn't one of the choices!" );
		}
	}
}
