/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.services;

import org.jl.controllers.StudentTo;
import org.jl.dao.StudentDAOI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rishitha
 */
@Service
public class StudentService {
    @Autowired
    StudentDAOI sdao;
    public void registerStudent(StudentTo st ) throws Exception{
        sdao.saveStudentDet(st);
        sdao.saveStudentDetCopy(st);
        
        
        
    }
    public StudentService(){
        
    }
    public StudentDAOI getSdao() {
        return sdao;
    }

    public void setSdao(StudentDAOI sdao) {
        this.sdao = sdao;
    }
    
    
    
}
