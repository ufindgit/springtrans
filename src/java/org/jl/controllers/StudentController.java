/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.controllers;

import org.jl.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Rishitha
 */
@Controller
public class StudentController {
    @Autowired
    StudentService regService;
    @Autowired
    DataSourceTransactionManager ptm;
    @RequestMapping("/studentReg.spring")
    
        String saveStudentRegDetails(StudentTo st){
        TransactionStatus td = ptm.getTransaction(new DefaultTransactionDefinition());
        
        try{
            //This calls dao and tries
            //to insert student details in to 2 tables
            //student
            regService.registerStudent(st);
        }catch(Exception e ){
            ptm.rollback(td);
            return "failure";
        }
        ptm.commit(td);
        return "success";
        
    }
    
}
