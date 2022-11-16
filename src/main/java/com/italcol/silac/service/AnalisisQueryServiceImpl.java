package com.italcol.silac.service;

import com.italcol.silac.common.NotificationCode;
import com.italcol.silac.entity.AnalisisSilacEntity;
import com.italcol.silac.exception.ItalcolBusinessException;
import com.italcol.silac.repository.AnalisisSilacRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AnalisisQueryServiceImpl implements AnalisisQueryService{
    private final AnalisisSilacRepository analisisSilacRepository;


    @Override
    public List<AnalisisSilacEntity> getAllAnalisis(Integer numSilac) throws ItalcolBusinessException {
        List<AnalisisSilacEntity> entities = analisisSilacRepository.getAllAnalisisById(numSilac);
        if (entities.isEmpty()){
            throw new ItalcolBusinessException(NotificationCode.NOT_DATA_MATCH);
        }else{
        return entities;
        }
    }


}
