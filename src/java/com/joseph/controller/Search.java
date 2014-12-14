/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseph.controller;

import com.joseph.dao.StudentDaoLocal;
import com.joseph.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import static java.time.Clock.system;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Joseph
 */
@WebServlet(name = "Sear", urlPatterns = {"/Searchf"})
public class Search extends HttpServlet {
    @EJB
    private StudentDaoLocal studentDao;
    private int x =0; 
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String studentIdStr = request.getParameter("studentId");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String yearLevelStr = request.getParameter("yearLevel");
        int v=Integer.parseInt(studentIdStr); 
        PrintWriter out = response.getWriter();
    

  
        int studentId=0;
         if(studentIdStr!=null && !studentIdStr.equals("")){
            studentId=Integer.parseInt(studentIdStr); 
          }
         int yearLevel=0;
        if(yearLevelStr!=null && !yearLevelStr.equals("")){
            yearLevel=Integer.parseInt(yearLevelStr);
        }
      
        String fName = studentDao.executeFetchQuery(v);
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet getdata</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("fname: "+ fName);
            out.println("</body>");
            out.println("</html>");


            
        
        
        
        //String firstname = request.getParameter("firstname");
        //String lastname = request.getParameter("lastname");
        //String yearLevelStr = request.getParameter("yearLevel");
        //int yearLevel=0;
       
        //Student student = new Student(studentId, firstname, lastname, yearLevel);
        
        
   // if("Search".equalsIgnoreCase(action)){
   //         student = studentDao.getStudent(studentId);
    //    }
    //    request.setAttribute("student", student);
   //     request.setAttribute("allStudents", studentDao.getAllStudents());
   //     request.getRequestDispatcher("searchres.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
