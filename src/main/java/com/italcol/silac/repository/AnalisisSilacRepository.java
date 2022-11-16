package com.italcol.silac.repository;

import com.italcol.silac.entity.AnalisisSilacEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnalisisSilacRepository extends CrudRepository<AnalisisSilacEntity,Integer> {

    @Query("SELECT U FROM AnalisisSilacEntity U WHERE U.numSilac = :numSilac ")
    List<AnalisisSilacEntity> getAllAnalisisById(@Param("numSilac") Integer numSilac);

}
