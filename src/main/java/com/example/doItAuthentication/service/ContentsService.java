package com.example.doItAuthentication.service;

import com.example.doItAuthentication.domain.Contents;
import com.example.doItAuthentication.domain.Member;
import com.example.doItAuthentication.respository.ContentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentsService {

    private final ContentsRepository contentsRepository;

    public List<Contents> contentsList(){
        return contentsRepository.findContents();
    }

    public Contents findOne(String id){
        return contentsRepository.findOne(id);
    }

    public void updateItem(String id, String getContents){
        Contents contents = contentsRepository.findOne(id);
        contents.setListId(id);
        contents.setContents(getContents);
    }
}
