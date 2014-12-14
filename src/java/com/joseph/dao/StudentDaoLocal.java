/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseph.dao;

import com.joseph.model.Student;
import java.sql.ResultSet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joseph
 */
@Local
public interface StudentDaoLocal {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(int studentId);

    Student getStudent(int studentId);

    List<Student> getAllStudents();
    
    /**
     *
     * @param id
     * @return
     */
    String executeFetchQuery(int id);
    
}
