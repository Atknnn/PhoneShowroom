package com.PhoneShowroom.repository;

import com.PhoneShowroom.repository.entity.Telefon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TelefonRepository extends JpaRepository<Telefon,Long> {

    @Query("select new com.room2.PhoneShowroom.repository.view.VwTelefon(t.id,t.yil,t.markaId,t.modelId) from Telefon t")
    List<Telefon> findAllFromTelefonView();

}
