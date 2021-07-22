import java.io.*;

class appendText {
	public static void main(String[] args) throws IOException {
		try(FileWriter fw = new FileWriter("textfile.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("Add this");

			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
	}
	
}


