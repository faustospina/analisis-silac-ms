package com.italcol.silac.service;

import com.italcol.silac.exception.ItalcolBusinessException;
import io.spring.guides.italcol.producing_web_service.Silac;
import io.spring.guides.italcol.producing_web_service.SilacResponse;

import java.util.List;

public interface SilacViewService {

    SilacResponse getAnalitycsView(Integer numSilac) throws ItalcolBusinessException;
}
