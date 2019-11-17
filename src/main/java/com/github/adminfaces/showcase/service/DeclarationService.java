package com.github.adminfaces.showcase.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.adminfaces.showcase.model.Declaration;

public class DeclarationService  implements  Serializable {
	
	public List<Declaration> declarationsList (int size) {
		List<Declaration>  liste = new ArrayList<>()  ; 
		
		for (int i = 0; i < size; i++) {
			
			Declaration declaration   = new Declaration() ; 
			declaration.setId(i);
			declaration.setNumero_vi("E1123");
			declaration.setAn_manif(2006);
			declaration.setCode_bur(2);
			declaration.setDate_heur(new Date());
			declaration.setDate_marquage(new Date());
			declaration.setFap("Fap");
			declaration.setFlag(true);
			declaration.setNom_agent("Agent");
			declaration.setNum_bl(123);
			declaration.setNum_cts("cts");
			declaration.setNum_decl(111);
			declaration.setNum_group(111);
			declaration.setNum_ligne(112);
			declaration.setNum_manif(113);
			declaration.setType_decl("DSTR");
        
			liste.add(declaration)   ; 
		}

		return liste ; 
	}

}
