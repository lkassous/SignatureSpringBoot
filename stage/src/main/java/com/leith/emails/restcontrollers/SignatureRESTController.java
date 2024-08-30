package com.leith.emails.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leith.emails.dto.SignatureDTO;
import com.leith.emails.entities.Signature;
import com.leith.emails.service.SignatureService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") 
public class SignatureRESTController {
	
	@Autowired
	SignatureService signatureService;
	 @RequestMapping(path="all",method =RequestMethod.GET)
	public List<SignatureDTO> getAllSignatures() {
		return signatureService.getAllSignature();
	}
	 @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public SignatureDTO getSignatureById(@PathVariable("id") Long id) {
		return signatureService.getSignature(id);
	 }
	 @RequestMapping(path="/addsign",method = RequestMethod.POST)
	public SignatureDTO createSignature(@RequestBody SignatureDTO signature) {
			return signatureService.saveSignature(signature);
	}
	 @RequestMapping(path="/updatesign",method = RequestMethod.PUT)
	public SignatureDTO updateSignature(@RequestBody SignatureDTO signature) {
	return signatureService.updateSignature(signature);
	}
	 @RequestMapping(value="/delsign/{id}",method = RequestMethod.DELETE)
	public void deleteSignature(@PathVariable("id") Long id)
	{
		signatureService.deleteSignatureById(id);
	}

	
}
