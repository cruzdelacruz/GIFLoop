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

public class GIFLoop extends PApplet {

int totalFrames = 120;
int counter = 0;

public void setup(){
    

}

public void draw(){
    float percent = PApplet.parseFloat(counter) / totalFrames;
    render(percent);
    counter++;
    
}

public void render(float percent){
    background(0);
    ellipse(percent*width, height/2, 20, 20);
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GIFLoop" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
