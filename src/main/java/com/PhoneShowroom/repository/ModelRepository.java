package com.PhoneShowroom.repository;

import com.PhoneShowroom.repository.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long> {
}
