package BrickWall;

public class Black implements Runnable {
  
  protected BrickWall e;
  
  public Black(BrickWall e){
	  this.e = e;
	  new Thread(this,"BLACK").start();
  }
	
  public void run(){
	e.addBlueElement();
  }
}
