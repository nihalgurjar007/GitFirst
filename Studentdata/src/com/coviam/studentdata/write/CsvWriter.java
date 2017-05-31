//Created by: Nihal Gurjar

package com.coviam.studentdata.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter implements Writer {

	@Override
	public boolean write(StudentDetails studentDetails) {

		FileWriter fileWriter = null;
		String filepath = "/Users/coviam/Desktop/StudentDetails.csv";
		try {
			File file = new File(filepath);
			file.getParentFile().mkdirs();
			fileWriter = new FileWriter(file, true);

//			fileWriter.write(studentDetails.getStudentID() + "," + studentDetails.getFirstName() + ","
//					+ studentDetails.getLastName() + "," + studentDetails.getMiddleName() + ","
//					+ studentDetails.getCollege() + "," + studentDetails.getCourse() + "\n");

			fileWriter.write(studentDetails.toString());
			fileWriter.append("\n");
			System.out.println("CSV file was created successfully !!!");
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;

		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();

			} catch (IOException e) {

				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {

		StudentDetails s1 = new StudentDetails("Nihal", "Gurjar", "", "IIIT", "btech", 1);
		StudentDetails s2 = new StudentDetails("Sai", "Krishna", "Reddy", "IIIT", "btech", 2);
		StudentDetails s3 = new StudentDetails("Gaurav", "Yadav", "", "IIIT", "btech", 3);

		CsvWriter cs = new CsvWriter();
		cs.write(s1);
		cs.write(s2);
		cs.write(s3);
	}

}
