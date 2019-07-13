package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;
import com.codenotfound.model.dao.AcademicsDaoImpl;

public class AcademicsDaoFactoryImpl extends AcademicsDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public AcademicsDao getAcademicsDao(){
    	return new AcademicsDaoImpl();
    }


}