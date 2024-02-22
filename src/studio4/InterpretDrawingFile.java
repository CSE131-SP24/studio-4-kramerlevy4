package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.*;
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape=in.next();
		
		if(shape.equals("ellipse")) {
			int red=in.nextInt();
			int green=in.nextInt();
			int blue=in.nextInt();
			boolean filled=in.nextBoolean();
			double d1=in.nextDouble();
			double d2=in.nextDouble();
			double d3=in.nextDouble();
			double d4=in.nextDouble();
			
			StdDraw.setPenColor(red, green, blue);
			StdDraw.filledEllipse(d1, d2, d3, d4);
		}
		
		else if(shape.equals("triangle")){
			int red=in.nextInt();
			int green=in.nextInt();
			int blue=in.nextInt();
			boolean filled=in.nextBoolean();
			double d1=in.nextDouble();
			double d2=in.nextDouble();
			double d3=in.nextDouble();
			double d4=in.nextDouble();
			double d5=in.nextDouble();
			double d6=in.nextDouble();
			
			double[] array1 = {d1,d2,d3};
			double[] array2= {d4,d5,d6};
					
			
			StdDraw.setPenColor(red, green, blue);
			StdDraw.polygon(array1, array2);
		}
		
		//StdDraw.ellipse(double x, double y, double semiMajorAxis, double semiMinorAxis)
		//StdDraw.square(double x, double y, double halfLength)
		//StdDraw.rectangle(double x, double y, double halfWidth, double halfHeight)
		
	}
}
