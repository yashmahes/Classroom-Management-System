/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomproject;

import java.util.ArrayList;


public class Teacher extends Person {
    
    Classroom class_teacher_classroom;
    ArrayList<String> subjects;
    Classroom assigned_classroom;

    public Teacher(Classroom class_teacher_classroom, ArrayList<String> subjects, Classroom assigned_classroom, String name, int age, String address, String gender) {
        super(name, age, address, gender);
        this.class_teacher_classroom = class_teacher_classroom;
        this.subjects = subjects;
        this.assigned_classroom = assigned_classroom;
    }

    

    public Classroom getClass_teacher_classroom() {
        return class_teacher_classroom;
    }

    public void setClass_teacher_classroom(Classroom class_teacher_classroom) {
        this.class_teacher_classroom = class_teacher_classroom;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public Classroom getAssigned_classroom() {
        return assigned_classroom;
    }

    public void setAssigned_classroom(Classroom assigned_classroom) {
        this.assigned_classroom = assigned_classroom;
    }

    @Override
    public String toString() {
        String c1 = "";
        if(assigned_classroom != null)
        {
            c1 = assigned_classroom.name;
        }
        String c2 = "";
        if(class_teacher_classroom != null)
        {
            c2 = class_teacher_classroom.name;
        }
        
        return name + "," + age + "," + address + "," + gender + "," + c1 + "," + c2 + "," + subjects;
    }
    
    

    
}
