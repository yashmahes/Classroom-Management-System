/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomproject;

import java.util.ArrayList;


public class Classroom {
    String name;
    String location;
    Teacher classTeacher;
    int maximum_number_of_students;
    
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> assignedTeachers = new ArrayList<>();

    @Override
    public String toString() {
        return name + "," + location +"," + maximum_number_of_students;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public int getMaximum_number_of_students() {
        return maximum_number_of_students;
    }

    public void setMaximum_number_of_students(int maximum_number_of_students) {
        this.maximum_number_of_students = maximum_number_of_students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getAssignedTeachers() {
        return assignedTeachers;
    }

    public void setAssignedTeachers(ArrayList<Teacher> assignedTeachers) {
        this.assignedTeachers = assignedTeachers;
    }
    
    
    
}
