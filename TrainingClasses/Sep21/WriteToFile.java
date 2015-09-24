import java.io.*;

public class WriteToFile{

  protected FileWriter fWriter;
  protected BufferedWriter bWriter;
  protected PrintWriter pWriter;

  public WriteToFile(String path){
    try{
        this.fWriter = new FileWriter(path);
    }catch(IOException e){
        System.out.println("File Doesn't Exist!!!");
    }
    this.bWriter = new BufferedWriter(this.fWriter);
    this.pWriter = new PrintWriter(this.bWriter);
  
  }

  public FileWriter getFileWriter(){
    return this.fWriter;
  }

  public BufferedWriter getBufferedWriter(){
      return this.bWriter;
  }

  public void writeToFile(String content){
    this.pWriter.println(content);     
  }
  
  public void writeToFile(int content){
      this.pWriter.println(content);
  }

  public void closeConnection(){
      
      if(this.pWriter != null)
         this.pWriter.close();

  }

  public static void main(String[] args){
      WriteToFile w = new WriteToFile(args[0]);
      w.writeToFile("james");
      w.writeToFile(1);
      w.closeConnection();
  }

}
