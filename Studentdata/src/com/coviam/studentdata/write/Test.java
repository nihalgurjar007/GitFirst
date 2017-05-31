//Created by: Nihal Gurjar

package com.coviam.studentdata.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class Test implements Writer {

	@Override
	public boolean write(StudentDetails studentDetails) {

		CSVWriter writer = null;
		String filepath = "/Users/coviam/Documents/a/b/StudentDetails1.csv";
		try {
			File file = new File(filepath);
			file.getParentFile().mkdirs();
			writer = new CSVWriter(new FileWriter(file, true));
			String[] record = { String.valueOf(studentDetails.getStudentID()), studentDetails.getFirstName(),
					studentDetails.getLastName(), studentDetails.getMiddleName(), studentDetails.getCollege(),
					studentDetails.getCourse() };
			writer.writeNext(record);

			System.out.println("CSV file was created successfully !!!");
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;

		} finally {

			try {
				writer.close();

			} catch (IOException e) {

				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {

		StudentDetails s1 = new StudentDetails("Nihalgggg", "Gurjar", "", "IIIT", "btech", 1);
		StudentDetails s2 = new StudentDetails("Sai", "Krishna", "Reddy", "IIIT", "btech", 2);
		StudentDetails s3 = new StudentDetails("Gaurav", "Yadav", "", "IIIT", "btech", 3);

		Test cs = new Test();
		cs.write(s1);
		cs.write(s2);
		cs.write(s3);
	}

}
