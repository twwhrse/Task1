import java.awt.*;
import javax.swing.*;

public class LandscapeDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSky(g);
        drawSun(g);
        drawGrass(g);
        drawMountains(g);
        drawTrees(g);
        drawBirds(g);
        drawHouse(g);
        drawWindow(g);
    }

    public void drawSky(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);
    }

    public void drawGrass(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() - 100, getWidth(), 100);
    }

    public void drawMountains(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillPolygon(new int[]{0, 200, 400}, new int[]{getHeight() - 100, getHeight() - 300, getHeight() - 100}, 3);
    }

    public void drawTrees(Graphics g) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect(100, getHeight() - 200, 20, 200);
        g.setColor(Color.GREEN);
        g.fillOval(80, getHeight() - 250, 60, 60);
        g.fillOval(100, getHeight() - 300, 60, 60);
        g.fillOval(120, getHeight() - 250, 60, 60);
    }

    public void drawBirds(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(400, 100, 420, 80);
        g.drawLine(400, 100, 420, 120);
    }

    public void drawHouse(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(500, getHeight() - 300, 200, 200);
    }

    public void drawWindow(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(610, getHeight()  - 230, 60, 60);
        g.fillRect(530, getHeight()  - 230, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Landscape Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        LandscapeDrawing landscape = new LandscapeDrawing();
        frame.add(landscape);
        frame.setVisible(true);
    }
}