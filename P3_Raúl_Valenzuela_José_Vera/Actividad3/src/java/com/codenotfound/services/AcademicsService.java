package com.codenotfound.services;

import java.util.List;

import com.codenotfound.model.Academics;
import com.codenotfound.model.dao.AcademicsDao;
import com.codenotfound.model.dao.AcademicsDaoImpl;

import org.springframework.stereotype.Service;

@Service
public class AcademicsService {

  
    private AcademicsDao dao = new AcademicsDaoImpl();

    public List<Academics> getAcademicsList() {
        return this.dao.findAll();
    }

}