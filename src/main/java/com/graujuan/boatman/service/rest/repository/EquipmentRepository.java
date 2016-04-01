package com.graujuan.boatman.service.rest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.graujuan.boatman.business.Equipment;

@RepositoryRestResource(collectionResourceRel = "equipment", path = "equipment")
public interface EquipmentRepository extends PagingAndSortingRepository<Equipment, Long> {

	List<Equipment> findByName(@Param("name") String name);

}