package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0.0, 0.0, 0.2, 0.2);
		StdDraw.filledRectangle(0.4, 0.4, 0.2, 0.2);
		StdDraw.filledRectangle(0.8, 0.8, 0.2, 0.2);
		
		double[] array1 = {0.2,0.6,0.8};
		double[] array2= {0.0,0.2,0.6};
		StdDraw.filledPolygon(array1, array2);
		
		double[] array3 = {0.0,0.2,0.6};
		double[] array4= {0.2,0.6,0.8};
		StdDraw.filledPolygon(array3, array4);
		
	}
}