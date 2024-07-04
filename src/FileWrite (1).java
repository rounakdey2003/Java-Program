import java.io.*;
class FileWrite {

    public static void main(String[] args) throws IOException {

     FileInputStream input = new FileInputStream("Q8.txt");
     FileOutputStream output = new FileOutputStream("Qoutput.txt");
      int i = 0;
      while ((i=input.read())!= -1){
          output.write((byte)i);
      }
	System.out.println("Successful");
      input.close();
    }
}
