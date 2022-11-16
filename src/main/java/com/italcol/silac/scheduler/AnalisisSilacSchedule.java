package com.italcol.silac.scheduler;

import com.italcol.silac.service.AnalisisQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnalisisSilacSchedule {
    @Autowired
    private AnalisisQueryService service;


    public void cronJobSch() {
    }
}
