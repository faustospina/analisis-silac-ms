package com.italcol.silac.service;

import com.italcol.silac.common.NotificationCode;
import com.italcol.silac.entity.AnalisisSilacEntity;
import com.italcol.silac.exception.ItalcolBusinessException;
import io.spring.guides.italcol.producing_web_service.Silac;
import io.spring.guides.italcol.producing_web_service.SilacResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SilacViewServiceImpl implements SilacViewService{



    @Autowired
    private AnalisisQueryService service;





    @Override
    public SilacResponse getAnalitycsView(Integer numSilac) throws ItalcolBusinessException {

        SilacResponse silacResponse=new SilacResponse();

                   service.getAllAnalisis(numSilac).forEach(entity -> {


                    /*GregorianCalendar gCalendar = new GregorianCalendar();
                    gCalendar.setTime(entity.getNirAnalisisTime());
                    XMLGregorianCalendar xmlCalendar = null;
                    try {
                        xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
                    } catch (DatatypeConfigurationException e) {
                        e.printStackTrace();
                    }*/


                       Silac silac = new Silac();
                       silac.setNumSilac(entity.getNumSilac());
                       silac.setProductName(entity.getProductName());
                       //silac.setNirAnalisisTime(xmlCalendar);
                       silac.setTipoSolicitud(entity.getTipoSolicitud());
                       silac.setLineaProducto(entity.getLineaProducto());
                       silac.setPresentacion(entity.getPresentacion());
                       silac.setNumeroOrder(entity.getNumeroOrder());
                       silac.setOrderProduccion(entity.getOrderProduccion());
                       silac.setNumeroFormula(entity.getNumeroFormula());
                       silac.setLote(entity.getLote());
                       silac.setLoteGenerado(entity.getLoteGenerado());
                       silac.setAnalisis(entity.getAnalisis());
                       silac.setValor(entity.getValor());
                       silacResponse.getListaSilac().add(silac);
                   });


            return silacResponse;
    }


}
