package com.leith.emails.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.leith.emails.entities.Signature;

@RepositoryRestResource(path = "rest")
public interface SignatureRepository extends JpaRepository<Signature, Long> {
 
}
