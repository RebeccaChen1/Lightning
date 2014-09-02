int startX=150;
int startY=60;
int endX=150;
int endY=0;

void setup()
{
  size(300,300);
  background(0);
  strokeWeight(5);
}
void draw()
{
  background(0);
  clouds();
  stroke((int)(random(255)),(int)(random(255)),(int)(random(255)));
  while(endY<300)
  {
    endX = startX+(int)(random(-9,9));
    endY = startY+(int)(random(0,9));
    line(startX,startY,endX,endY);
    startX = endX;
    startY = endY;
  }
}
void mouseMoved()
{
  startX=150;
  startY=60;
  endX=150;
  endY=0;
  background(255,255,255);
}
void clouds()
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
