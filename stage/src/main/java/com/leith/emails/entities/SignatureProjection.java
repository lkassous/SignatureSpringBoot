package com.leith.emails.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomSign",types= {Signature.class})
public class SignatureProjection {
	public String getNomcomp() {
		return null;
	}


}
