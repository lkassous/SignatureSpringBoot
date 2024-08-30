package com.leith.emails;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leith.emails.entities.Signature;
import com.leith.emails.repos.SignatureRepository;

@SpringBootTest
class StageApplicationTests {
    @Autowired
    private SignatureRepository signatureRepository;
    @Test
    public void testFindSignature()
    {
    Signature s = signatureRepository.findById(1L).get();

    System.out.println(s);
    }
    
    @Test
    public void testDeleteProduit()
    {
    	signatureRepository.deleteById(1L);;
    }
    @Test
    public void testListerTousProduits()
    {
    List<Signature> signs = signatureRepository.findAll();
    for (Signature s : signs)
    {
    System.out.println(s);
    }
    
}
   
}
