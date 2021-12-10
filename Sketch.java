import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(245, 245, 245);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  
    //Rocket parts
    stroke(200);
    fill(255,105,105);
    ellipse(180, 325, 30, 60); 
    ellipse(140, 325, 30, 60);
    fill(245,245,245);
    stroke(122);
    ellipse(160, 240, 70, 150);

    //Window
    fill(197,224,255);
    ellipse(160, 210, 40, 40);

    //Moon 
    fill(255,250,180);
    ellipse(400, 70, 90, 90); 

    //Ground
    fill(210,105,30);
    stroke(100);
    rect(0, 350, 500, 150);
    
    //Building made with rect()
    fill(192, 192, 192);
    rect(290, 200, 90, 150);

    //Recreate same rectangle using line() to fit the assignment
    line(380, 200, 380, 350);
    line(290, 200, 290, 350);
    line(290, 200, 380, 200);
    
    
    
    
  }
  
}