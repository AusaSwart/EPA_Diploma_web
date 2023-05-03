package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.NoticeEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticeEventService {

    private final NoticeEventRepository noticeEventRepository;


}
