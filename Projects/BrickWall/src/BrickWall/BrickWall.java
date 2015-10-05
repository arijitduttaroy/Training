package BrickWall;

import java.util.*;

public class BrickWall  {
  protected ArrayList<String> wall;
  protected Boolean toggle = false;
  public BrickWall(){
	  this.wall = new ArrayList<String>();
  }
  
  public void addElementsToList(String city){
	  this.wall.add(city);
  }
  
  public  ArrayList<String> getArrayList(){
	  return this.wall;
  }
  
  public void display(){
	for(Object e : this.wall.toArray()){
		  System.out.print((String)e+" ");
	}
  }  
  public synchronized void addRedElement(){
	    
	 while(toggle)
		 try{wait();}catch(Exception e){System.out.println(e);}
	 
	  this.wall.add("RED");
	  this.toggle = true;
	  notify();
	  
  }
  
  public synchronized void addBlueElement(){
	  while(!toggle)
		  try{wait();}catch(Exception e){System.out.println(e);}
	  
	  this.wall.add("BLACK");
	  this.toggle = false;
	  notify();
  }
  
  
}
