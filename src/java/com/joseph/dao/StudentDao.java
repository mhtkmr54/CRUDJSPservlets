/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseph.dao;

import com.joseph.model.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

/**
 *
 * @author Joseph
 */
@Stateless
public class StudentDao implements StudentDaoLocal {
     @Resource(name="jdbc/studentDB")
    private DataSource datasource;
    
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addStudent(Student student) {
        em.persist(student);
    }

    @Override
    public void editStudent(Student student) {
        em.merge(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        em.remove(getStudent(studentId));
    }

    @Override
    public Student getStudent(int studentId) {
        return em.find(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return em.createNamedQuery("Student.getAll").getResultList();
    }
    
    /**
     *
     * @param id
     * @return
     */
   
     @Override
   public String executeFetchQuery(int id){
   String firstName = null;
  try{ 
    Connection conn = datasource.getConnection();
    String sql = "SELECT * FROM STUDENT WHERE STUDENTID = '" + id +"'";
    ResultSet rs = conn.createStatement().executeQuery(sql);
    if(rs.next()){
    firstName = rs.getString("firstname");
    }
    conn.close();
  }catch (Exception e) {
    System.err.println(e.getMessage());
  }
  return firstName;
}
      
       
      /*
      public Student getStudent1(int id){
        Student student = new Student();
        String sql = "SELECT * FROM STUDENT WHERE STUDENTID = '" + id +"'";
        System.out.println(sql);
        ResultSet rs = executeFetchQuery(sql);
        try {
            if (rs.next()){
                student.setStudentId(id));
                student.setFirstname(rs.getString("firstname"));
                student.setLastname(rs.getString("lastname"));
                student.setLastname(rs.getString("yearLevel"));
                
            }
        }catch (Exception e) {
           System.err.println(e.getMessage());
       }
      return student;
    }
      */

}
