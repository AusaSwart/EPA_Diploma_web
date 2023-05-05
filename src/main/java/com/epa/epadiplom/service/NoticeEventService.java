package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.NoticeEvent;
import com.epa.epadiplom.repository.NoticeEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticeEventService {

    private final NoticeEventRepository noticeEventRepository;

    public boolean saveNoticeEvent (NoticeEvent noticeEvent){
        if(noticeEventRepository.findById(noticeEvent.getId()).isPresent())
            return false;
        noticeEventRepository.save(noticeEvent);
        return true;
    }
}
