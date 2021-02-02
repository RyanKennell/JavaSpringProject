package com.kennell.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
	
	@Inject
	CdiDAO cdidao;

	public CdiDAO getCdidao() {
		return cdidao;
	}

	public void setCdidao(CdiDAO cdidao) {
		this.cdidao = cdidao;
	}
	
}
