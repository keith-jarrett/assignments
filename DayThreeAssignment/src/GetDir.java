import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class GetDir {

	public static void main(String[] args) throws Exception {
		// System.getProperty returns a string. "user.dir" is a keyword that works with System.getProperty to return 
		// the current directory
		System.out.println("Please enter a path name, or leave blank and press enter for current list of subdirectories: ");
		Path currentPath = Paths.get(System.getProperty("user.dir"));	
		listDir(currentPath, 0);
	}

	public static void listDir(Path path, int depth) throws Exception {
		// the next line with BasicFileAttributes is general syntax for storing info about an object
		// 'attr' is an arbitrary varible holding the values. 'path' is the object.
		// BasicFileAttributes has a number of methods, in this case we are using isDirectory()
		BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

		// if directory, list the files, and traverse down inside each of those
		if(attr.isDirectory()) {
			// Files.newDirectoryStream opens a directory, returning a DirectoryStream to iterate over all entries in the directory
			// <> the angle brackers mean 'of type', so DirectoryStream of type Path
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			// path.getFileName() returns the file name
			System.out.println(spacesForDepth(depth) + " > " + path.getFileName());
			// this is a for-each loop using type Path, temporary variable tempPath and the 
			// DirectoryStream iterable 'paths'
			for(Path tempPath: paths) {
				// listDir is this class calling itself, making this recursive
				listDir(tempPath, depth + 1);
			}

		} else {
			System.out.println(spacesForDepth(depth) + " -- " + path.getFileName());
		}
	}

	public static String spacesForDepth(int depth) {
		// StringBuilder is a way to make a string mutable. We can use it with .append()
		// This is used to set the number of indentations for each subdirectory in the output
		StringBuilder builder = new StringBuilder();
		for(int i =0; i < depth; i++) {
			builder.append("    ");
		}
		// toString is a StringBuilder method to return the object to type String
		return builder.toString();
	}
}