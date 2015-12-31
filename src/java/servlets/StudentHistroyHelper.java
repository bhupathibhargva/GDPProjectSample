/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author S519458
 */
public class StudentHistroyHelper 
{
    private int studentKey;
    private int courseNum;
   

    public StudentHistroyHelper(int studentKey, int courseNum) {
        this.studentKey = studentKey;
        this.courseNum = courseNum;
    }

    public int getStudentKey() {
        return studentKey;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setStudentKey(int studentKey) {
        this.studentKey = studentKey;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }
    
}
