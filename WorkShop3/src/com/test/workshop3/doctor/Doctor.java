package com.test.workshop3.doctor;

public class Doctor {
    
    private String name;
    private String department;
    //public Doctor() {
    	
   // }
    
    public Doctor( String name, String department ) {
        this.name = name;
        this.department = department;
    }
    
    public void treatPatient() {
        System.out.println( "환자를 진료합니다." );
    }

    @Override 
    public String toString() {
    //	System.out.println("Doctor");
        return department + " : " + name + " 선생님";
    }
}