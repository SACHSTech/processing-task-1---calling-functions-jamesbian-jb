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
    background(255, 255, 255);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(200);
    ellipse(160, 200, 70, 150);  

    stroke(122);
    ellipse(160, 160, 40, 40); 

    stroke(200);
    ellipse(180, 285, 30, 60); 
    ellipse(140, 285, 30, 60); 
    ellipse(400, 70, 90, 90); 

    rect(0, 300, 500, 100);
    
  }
  
  // define other methods down here.
}