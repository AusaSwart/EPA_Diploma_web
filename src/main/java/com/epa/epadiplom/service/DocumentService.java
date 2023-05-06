package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.Document;
import com.epa.epadiplom.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public boolean saveDocument(Document document){
        if(documentRepository.findById(document.getId()).isPresent()) {

            return false;
        }
        documentRepository.save(document);
        return true;
    }
}
