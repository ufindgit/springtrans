/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import jdbcsample.DBUtil;
import org.jl.controllers.StudentTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rishitha
 */
@Repository
public class StudentJDBCDAO implements StudentDAOI{
    @Autowired
    private JdbcTemplate jt;
    public void saveStudentDet(StudentTo st) throws SQLException {
        //jt.execute("INSERT INTO studentdet values('"+st.getSname()+"','"+st.getScity()+"')");
        
        Connection con = DBUtil.getConnection();
        String query = "INSERT INTO studentdet values('"+st.getSname()+"','"+st.getScity()+"')";
        Statement sts = con.createStatement();
        sts.executeUpdate(query);
        
    }

    public void saveStudentDetCopy(StudentTo st) throws SQLException {
         //jt.execute("INSERT INTO studentdetcop values('"+st.getSname()+"','"+st.getScity()+"')");
        Connection con = DBUtil.getConnection();
        String query = "INSERT INTO studentdetcop values('"+st.getSname()+"','"+st.getScity()+"')";
        Statement sts = con.createStatement();
        sts.executeUpdate(query);
        
    }

  
    
}
