
package Main;


import BrickWall.Red;
import BrickWall.Black;
import BrickWall.BrickWall;

public class Main {
  public static void main(String[] args){
	  BrickWall e = new BrickWall();
	  for(int i = 0 ; i < 10; i++){
		  new Red(e);
		  new Black(e);
	  }
	  e.display();
  }
}
