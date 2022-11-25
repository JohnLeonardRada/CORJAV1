package utility;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;

import model.StudentBean;
	
public class Reader {

	private static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static String readString(String message) {
		String input = null;
		try {
			System.out.print(message + ": ");
			input = getReader().readLine();
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		return input; 
	}
	
	public static int readInt(String message){
		System.out.print(message+ ": ");
		
		int input = 0; 
		try {
			input = Integer.parseInt(getReader().readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}
	
	public static double readDouble(String message) throws IOException {
		System.out.print(message);
		
		//the method Integer.parseInt() converts a String value 
		//to a double primitive value
		return Double.parseDouble(getReader().readLine());
	}
	
	public static void createXMLDatabaseFile(StudentBean estudyante[]) {
		System.out.println("Please wait... Creating an XML database...");		
		
		try {
			XMLEncoder encoder = null;
			encoder = new XMLEncoder(
				new BufferedOutputStream(
			    //
						new FileOutputStream("C:\\Users\\akin2\\Desktop\\Leonard\\Codes\\JAVA\\ProjStudentRegistration.xml")));		

			 encoder.writeObject(estudyante);
			 encoder.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static StudentBean[] readXMLDatabaseFile(StudentBean students[]) {
		System.out.println("Please wait... Creating an XML database...");
		
		try {
			XMLDecoder decoder = new XMLDecoder(
                new BufferedInputStream(
                new FileInputStream("C:\\\\Users\\\\akin2\\\\Desktop\\\\Leonard\\\\Codes\\\\JAVA\\\\ProjStudentRegistration.xml")));
			
			/*
			 The code (StudentBean[])decoder.readObject() will perform a data
			 type explicit/narrowing conversion from the generic java.lang.Object to
			 model.StudentBean array.
			 */
			students = (StudentBean[])decoder.readObject();
			
			decoder.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		return students;
	}	
	
	public static void createPDFStudentList(StudentBean students[]) {
		Document document = new Document();

	    try {
	      PdfWriter.getInstance(document,
	          new FileOutputStream("C:\\Users\\akin2\\Desktop\\Leonard\\Codes\\JAVA\\StudentListReports" 
	          + new java.util.Date().getTime()+ ".pdf"));

	      document.open();
	      
	      document.add(Image.getInstance("C:\\Users\\akin2\\Desktop\\Leonard\\Codes\\JAVA\\images\\jlr.jpg"));
	      Image image = Image.getInstance("C:\\\\Users\\\\akin2\\\\Desktop\\\\Leonard\\\\Codes\\\\JAVA\\\\images\\\\jlr.jpg");
	      image.setAbsolutePosition(150, 150);
	      image.scaleToFit(150, 150);
	      
	      document.add(new Paragraph("Student Registration Database System"));
	      document.add(new Paragraph("Programmed by: John Leonard Rada"));
	      document.add(new Paragraph("Student Details"));
	      document.add(new Paragraph("ID: "+students[0].getStudId()+"\n"));
	      document.add(new Paragraph("Last Name: "+students[0].getLastName()+"\n"));
	      document.add(new Paragraph("First Name: "+students[0].getFirstName()+"\n"));
	      document.add(new Paragraph("Course: "+students[0].getCourse()+"\n"));
	      document.add(new Paragraph("Year Level: "+students[0].getYearLevel()+"\n"));
	      document.add(new Paragraph("Name: "+students[0].getUnitsEnrolled()+"\n"));
	      
	      document.close();
	    
	    } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	}
	
}



