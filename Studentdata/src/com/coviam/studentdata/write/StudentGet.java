package com.coviam.studentdata.write;


	import java.lang.reflect.Constructor;
	import java.lang.reflect.Method;

	public class StudentGet {

		
	        public static void main(String args[]){
	        	
	    		StudentDetails std = new StudentDetails("Nihal","Gurjar","","IIITDM","Btech",111);
	    		
	            Class<? extends StudentDetails> cls = std.getClass();
	            
	        System.out.println("ClassName:"+cls.getName());
	 
	        
			try {
				Constructor<?>[] constructor =  cls.getConstructors();
				for (Constructor cons:constructor){
					System.out.println("Constructor Name :  " +
	                        cons.getName());
					
		        	}
				

			} catch (SecurityException e) {
				
				e.printStackTrace();
			}
	        
	        System.out.println("Methods : ");
	 
	        Method[] methods = cls.getMethods();
	 
	        for (Method method:methods)
	            System.out.println(method.getName()+"\t"+method.getReturnType()+"\t"+method.getParameterCount());
	 
	        	}
		}




