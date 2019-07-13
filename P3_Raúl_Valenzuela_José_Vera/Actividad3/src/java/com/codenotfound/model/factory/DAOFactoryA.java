package com.codenotfound.model.factory;




public abstract class DAOFactoryA {
    public static final int Academics_REPOSITORY = 1;

    public static DAOFactoryA getDAOFactoryA(int tipo) {
        switch (tipo) {
	        case Academics_REPOSITORY:
	            return new AcademicsDaoFactoryImpl();            
	        default:
	            return null;
        }
    }


    

}
