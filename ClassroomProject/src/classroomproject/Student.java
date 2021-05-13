/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomproject;


public class Student extends Person {
    Classroom assigned_classroom;
    String grade;

    public Student(Classroom assigned_classroom, String grade, String name, int age, String address, String gender) {
        super(name, age, address, gender);
        this.assigned_classroom = assigned_classroom;
        this.grade = grade;
    }

    
    public Classroom getAssigned_classroom() {
        return assigned_classroom;
    }

    public void setAssigned_classroom(Classroom assigned_classroom) {
        this.assigned_classroom = assigned_classroom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + address + "," + gender + "," + grade + "," + assigned_classroom.name;
    }
    
    

    
}
