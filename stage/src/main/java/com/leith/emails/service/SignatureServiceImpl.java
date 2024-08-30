package com.leith.emails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.leith.emails.dto.SignatureDTO;
import com.leith.emails.entities.Signature;
import com.leith.emails.repos.SignatureRepository;

@Service
public class SignatureServiceImpl implements SignatureService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    SignatureRepository signatureRepository;
    
    @Autowired
    PasswordEncoder passwordEncoder; // Injection du PasswordEncoder

    @Override
    public SignatureDTO saveSignature(SignatureDTO s) {
        return convertEntityToDto(signatureRepository.save(convertDtoToEntity(s)));
    }

    @Override
    public SignatureDTO updateSignature(SignatureDTO s) {
        return convertEntityToDto(signatureRepository.save(convertDtoToEntity(s)));
    }

    @Override
    public void deleteSignature(Signature s) {
        signatureRepository.delete(s);
    }

    @Override
    public void deleteSignatureById(Long id) {
        signatureRepository.deleteById(id);
    }

    @Override
    public SignatureDTO getSignature(Long id) {
        return convertEntityToDto(signatureRepository.findById(id).orElse(null));
    }

    @Override
    public List<SignatureDTO> getAllSignature() {
        return signatureRepository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public SignatureDTO convertEntityToDto(Signature signature) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(signature, SignatureDTO.class);
    }

    @Override
    public Signature convertDtoToEntity(SignatureDTO signatureDTO) {
        Signature signature = modelMapper.map(signatureDTO, Signature.class);
        
        if (signatureDTO.getPass() != null && !signatureDTO.getPass().isEmpty()) {
            signature.setPass(passwordEncoder.encode(signatureDTO.getPass()));
        }
        
        return signature;
    }
}
