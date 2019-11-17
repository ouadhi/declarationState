package Metier.Test;

import Metier.Model.DelaisDao;

public class Test {

	public static void main(String[] args) {
	
		DelaisDao Dao  =  new DelaisDao() ; 
		System.out.println(Dao.findByYear(2018).size());
		
	}
	
}
