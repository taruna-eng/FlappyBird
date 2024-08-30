import javax.swing.*;   //for making gui in java like buttons, labels,textfields

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;              //because yeh hmare background image ki dimension hai.
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true); 
		frame.setSize(boardWidth, boardHeight);       
        frame.setLocationRelativeTo(null);          //center me rakhne ke liye used
        frame.setResizable(false);          //user resize nhi kar sakta window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //user jab x button ko click karega then program closed.

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();                        //width and height not including the title bar
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}