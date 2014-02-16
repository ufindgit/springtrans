/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.dao;

import org.jl.controllers.StudentTo;

/**
 *
 * @author Rishitha
 */
public interface StudentDAOI {
    
    public void saveStudentDet(StudentTo st ) throws Exception;
    public void saveStudentDetCopy(StudentTo st ) throws Exception;
    
}
