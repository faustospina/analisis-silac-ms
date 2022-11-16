package com.italcol.silac.service;

import com.italcol.silac.entity.AnalisisSilacEntity;
import com.italcol.silac.exception.ItalcolBusinessException;

import java.util.List;

public interface AnalisisQueryService {

    List<AnalisisSilacEntity> getAllAnalisis(Integer numSilac) throws ItalcolBusinessException;


}
