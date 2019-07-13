package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;

public abstract class AcademicsDaoFactory extends DAOFactoryA{
	
    public abstract AcademicsDao getAcademicsDao();
    
}



