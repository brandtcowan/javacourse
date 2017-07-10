package javacourse;

public class Bed {
	private String size;
	 private int pillows;
	 private int height;
	 private int sheets;
	 private int quilt;
 private String style;
 
 public Bed(String style, String size, int pillows, int height, int sheets, int quilt) {
	super();
	this.style = style;
	this.size = size;
	this.pillows = pillows;
	this.height = height;
	this.sheets = sheets;
	this.quilt = quilt;
}

public String getSize() {
	return size;
}

public int getPillows() {
	return pillows;
}

public int getHeight() {
	return height;
}

public int getSheets() {
	return sheets;
}

public int getQuilt() {
	return quilt;
}

public String getStyle() {
	return style;
}

 public void make() {
	 System.out.println("Bed -> Making");
 }
}
