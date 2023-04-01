import javax.swing.*;

public class Game
{
    public static int min = 1;
    public static int max = 100;
    static double systemOutput = ((int)(Math.floor(Math.random() *(max - min + 1) + min)));
    static int attempts = 5;
    static boolean correctAnswer = false;

    public static void pointsSystem()
    {
        JFrame f;
        if(attempts == 5 && correctAnswer)
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 50 points!");
        }
        else if(attempts == 4 && correctAnswer)
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 40 points!");
        }
        else if(attempts == 3 && correctAnswer)
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 30 points!");
        }
        else if(attempts == 2 && correctAnswer)
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 20 points!");
        }
        else if(attempts == 1 && correctAnswer)
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 10 points!");
        }
        else
        {
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"You scored 0 points");
        }
    }

    public static void main(String[] args)
    {
            JFrame f = new JFrame("Guess The Number!");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(f,"Welcome to the Number Guessing Game!");
            while(!correctAnswer && attempts>0)
            {
                String playerInput = JOptionPane.showInputDialog("Guess the number between 1-100: ");
                int finalPlayerInput = Integer.parseInt(playerInput);
                System.out.println("Number: " + playerInput);

                if(finalPlayerInput == systemOutput && attempts>0)
                {
                    f=new JFrame();
                    JOptionPane.showMessageDialog(f,"You guessed it right!");
                    correctAnswer = true;
                }
                if(systemOutput>finalPlayerInput && attempts>0)
                {
                    f=new JFrame();
                    JOptionPane.showMessageDialog(f,"Enter a higher number!");
                    attempts--;
                }
                if(systemOutput<finalPlayerInput && attempts>0)
                {
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f,"Enter a lower number!");
                    attempts--;
                }
                if(attempts<1)
                {
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f,"You ran out of attempts!");
                    JOptionPane.showMessageDialog(f,"Correct number was: " + (int)(systemOutput));
                }
            }
            pointsSystem();
    }
}
