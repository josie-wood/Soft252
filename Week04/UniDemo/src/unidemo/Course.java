/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author jwood20
 */
public class Course {
    private String code;
    private Lecturer teacher;
    private String coursework;
    private String room;

    //CONSTRUCTORS

    public Course(String code, String room) {
        this.code = code;
        this.room = room;
        this.teacher = null;
        this.coursework = null;
    }
    
    
    
    // GETTERS AND SETTERS
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Lecturer getTeacher() {
        return teacher;
    }

    public void setTeacher(Lecturer teacher) {
        this.teacher = teacher;
    }

    public String getCoursework() {
        return coursework;
    }

    public void setCoursework(String coursework) {
        this.coursework = coursework;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    
}
