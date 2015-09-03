import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleworld = new World();
        Turtle turtle1 = new Turtle(turtleworld);
        Turtle turtle2 = new Turtle(turtleworld);
        Turtle turtle3 = new Turtle(turtleworld);
        Turtle turtle4 = new Turtle(turtleworld);
        Turtle turtle5 = new Turtle(turtleworld);
        Turtle turtle6 = new Turtle(turtleworld);
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        turtle1.setBodyColor(Color.BLUE);
        turtle2.setBodyColor(Color.BLUE);
        turtle3.setShellColor(Color.BLUE);
        turtle4.setShellColor(Color.BLUE);
        turtle3.setBodyColor(Color.BLUE);
        turtle4.setBodyColor(Color.BLUE);
        turtle5.setBodyColor(Color.BLUE);
        turtle5.setShellColor(Color.BLUE);
        turtle6.setBodyColor(Color.BLUE);
        turtle6.setShellColor(Color.BLUE);
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle4.penDown();
        turtle5.penDown();
        turtle6.penDown();
        turtle1.setPenWidth(20);
        turtle1.forward(100);
        turtle1.backward(200);
        turtle2.turn(90);
        turtle2.forward(40);
        turtle2.turn(-90);
        turtle2.setPenWidth(20);
        turtle2.forward(75);
        turtle2.backward(150);
        turtle3.turn(90);
        turtle3.forward(80);
        turtle3.turn(-90);
        turtle3.setPenWidth(20);
        turtle3.forward(50);
        turtle3.backward(100);
        turtle4.turn(90);
        turtle4.forward(120);
        turtle4.turn(-90);
        turtle4.setPenWidth(20);
        turtle4.forward(25);
        turtle4.backward(50);
        turtle5.turn(-90);
        turtle5.forward(40);
        turtle5.turn(-90);
        turtle5.setPenWidth(20);
        turtle5.forward(125);
        turtle5.backward(250);
        turtle6.turn(-90);
        turtle6.forward(80);
        turtle6.turn(-90);
        turtle6.setPenWidth(20);
        turtle6.forward(150);
        turtle6.backward(300);
        
    }
}

