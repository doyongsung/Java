package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("ȫ�浿"));
//        System.out.println(dent.get(0));
//        dent.get(0).treatPatient();
//        dent.get(0).pullOutTooth();
        dent.add(new Dentist("����ġ"));
//        System.out.println(dent.get(1));
//        dent.get(0).treatPatient();
//        dent.get(0).pullOutTooth();
        for(Dentist d : dent) {
        	System.out.println(d);
        	d.treatPatient();
        	d.pullOutTooth();
        }   
        surg.add(new Surgeon("�Ӳ���"));
//        System.out.println(surg.get(0));
//        surg.get(0).treatPatient();
//        surg.get(0).performSurgery();
        surg.add(new Surgeon("ȫ���"));
//        System.out.println(surg.get(1));
//        surg.get(0).treatPatient();
//        surg.get(0).performSurgery();
        surg.add(new Surgeon("������"));
//        System.out.println(surg.get(2));
//        surg.get(0).treatPatient();
//        surg.get(0).performSurgery();
        for(Surgeon e : surg) {
        	System.out.println(e);
        	e.treatPatient();
        	e.performSurgery();
        }
        
//      System.out.println(dent.get(0));
//      System.out.println(dent.get(1));
        
//        Doctor doctor = new Doctor("�̼���","ġ��"); �̷��Ժҷ��ü�������
//        System.out.println(doctor); 
//        Object o = doctor;
//        System.out.println(o.toString());

    }
}