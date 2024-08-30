package com.leith.emails.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignatureDTO {
    private Long id;
    private String nomcomp;
    private String poste;
    private String adresse;
    private String numTel;
    private String adressephys;
    private String linkedin;
    private String urlentreprise;
    // Les URLs des images
    private String imageUrl;
    private String logoUrl;
    private String department;
    private String urlfb;
    private String numDomicile;
    private String pass;
}
