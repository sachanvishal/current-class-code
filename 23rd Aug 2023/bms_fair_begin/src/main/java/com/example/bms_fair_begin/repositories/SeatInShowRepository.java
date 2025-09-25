package com.example.bms_fair_begin.repositories;

import com.example.bms_fair_begin.models.SeatInShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Long is for id can use it also
public interface SeatInShowRepository extends JpaRepository<SeatInShow, Long> {
    //Hibernate would write the query for you or it would provide the implementation for methods which you overwrite here.
    @Override
    List<SeatInShow> findAllById(Iterable<Long> longs);

    @Override
    SeatInShow save(SeatInShow entity);
}
