package MachineProb_4;
import java.awt.*;

public class SpaceCraftCanva extends Canvas {
    

    public void paint(Graphics g) {
        super.paint(g);

        // Set the color of the line
        g.setColor(Color.BLACK);
        // Draw the line from (50, 50) to (200, 200)
        g.drawLine(100, 400, 800, 400); // First Main Horizontal Line

        g.drawLine(100, 490, 800, 490); // Second Main Horizontal Line

        g.drawLine(800, 400, 800, 490); // Line at Plane Tip

        // Set the color of the triangle
        g.setColor(Color.BLUE);
        g.drawLine(800, 400, 840, 450); // First Line for Triangle at Plane Tip
        g.drawLine(800, 490, 840, 450); // Second Line for Triangle at plane Tip

        // Set the color of the wings
        g.setColor(Color.RED);
        g.drawLine(700, 400, 300, 200); // Line 1 For Wings 
        g.drawLine(700, 490, 300, 700); // line 2 for Wings 
        g.drawLine(300, 490, 300, 700); // line 1 for Wings Cover
        g.drawLine(300, 400, 300, 200); // line 2 for Wings Cover

        // Set the color of the thruster
        g.setColor(Color.ORANGE);
        g.drawLine(100, 400, 100, 490); // Final line thruster line 

        // Set the color of the plane flaps
        g.setColor(Color.GREEN);
        g.drawLine(200, 400, 100, 300); // Line 1 for Plane Flaps
        g.drawLine(100, 400, 100, 300);// Line 1 for cover Plane flap 1 
        g.drawLine(200, 490, 100, 590); // Line 1 for plane Flaps 
        g.drawLine(100, 490, 100, 590);
      }


      public static void main(String[] args) {
        Frame frame = new Frame("Santos Justin Submission for Machine Problem #4 ");
        SpaceCraftCanva canvas = new SpaceCraftCanva();
        frame.add(canvas);
        frame.setSize(900, 900);
        frame.setVisible(true);
      }

}
