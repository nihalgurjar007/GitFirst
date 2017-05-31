package com.coviam.studentdata.write;

public class StudentDetails {
    private String firstName;
    private String middleName;
    private String lastName;
    private String college;
    private String course;
    private int studentID;
    
    public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCollege() {
		return college;
	}

	public String getCourse() {
		return course;
	}

	public int getStudentID() {
		return studentID;
	}

    public String toString(){ 
    	  return firstName+","+middleName+","+lastName+","+college+","+course+","+studentID;  
    	 } 
	

	public StudentDetails(String firstName, String lastName, String middleName, String college, String course, int studentID){
        
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.college=college;
        this.course=course;
        this.studentID=studentID;
    }
    }
