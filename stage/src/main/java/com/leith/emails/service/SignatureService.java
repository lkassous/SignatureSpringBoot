package com.leith.emails.service;

import java.util.List;

import com.leith.emails.dto.SignatureDTO;
import com.leith.emails.entities.Signature;

public interface SignatureService {
	SignatureDTO saveSignature(SignatureDTO s);
	SignatureDTO updateSignature(SignatureDTO s);
	void deleteSignature(Signature s);
	void deleteSignatureById(Long id);
	SignatureDTO getSignature(Long id);
	List<SignatureDTO> getAllSignature();
	SignatureDTO convertEntityToDto (Signature signature);
	Signature convertDtoToEntity(SignatureDTO signatureDTO);

}
