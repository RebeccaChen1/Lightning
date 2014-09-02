import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=150;
int startY=60;
int endX=150;
int endY=0;

public void setup()
{
  size(300,300);
  background(0);
  strokeWeight(5);
}
public void draw()
{
  background(0);
  clouds();
  while(endY<300)
  {
    stroke((int)(random(255)),(int)(random(255)),(int)(random(255)));
    endX = startX+(int)(random(-9,9));
    endY = startY+(int)(random(0,9));
    line(startX,startY,endX,endY);
    startX = endX;
    startY = endY;
  }
}
public void mouseMoved()
{
  startX=150;
  startY=60;
  endX=150;
  endY=0;
  background(255,255,255);
}
public void clouds()
{
 noStroke();
 fill(70,70,70);
 ellipse(30,20,80,80);
 ellipse(80,20,80,70);
 ellipse(140,20,80,80);
 ellipse(190,20,80,70);
 ellipse(210,20,80,90);
 ellipse(250,20,80,90);
 ellipse(280,20,80,60);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
