package BrickWall;

public class Red implements Runnable {
  
  protected BrickWall e;
  
  public Red(BrickWall e){
	  this.e = e;
	  new Thread(this,"RED").start();
  }
	
  public void run(){
	e.addRedElement();
  }
}
