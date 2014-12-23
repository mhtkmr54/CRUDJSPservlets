/*
<%-- 
    Document   : DYNAMIC TABLE WEB-APPLICATION
    Created on : Dec 20, 2014, 2:52:59 PM
    Author     : MOHIT KUMAR & HITESH KHANDELWAL ,iit madras
                 
--%>
 */
package com.joseph.dao;

import com.joseph.model.Student;
import java.util.List;
import javax.ejb.Local;


@Local
public interface StudentDaoLocal {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(int studentId);

    Student getStudent(int studentId);

    List<Student> getAllStudents();
    
}
