package com.certificate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.certificate.model.X509RevokedCertificate;
import com.certificate.repository.X509RevokedCertificateRepository;

@Service
public class X509RevokedCertificateImpl implements X509RevokedCertificateService {
	
	
	private X509RevokedCertificateRepository x509Cert;
	

	@Override
	public void save(X509RevokedCertificate cert) {
		// TODO Auto-generated method stub
		x509Cert.save(cert);
	}

	@Override
	public X509RevokedCertificate findBySerialNumber(Long serialNumber) {
		return x509Cert.findBySerialNumber(serialNumber);
	}

}
