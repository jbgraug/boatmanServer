package com.graujuan.boatman.service.rest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.graujuan.boatman.business.Boat;

//@RepositoryRestResource(collectionResourceRel = "boats", path = "boats")
public interface BoatRepository extends PagingAndSortingRepository<Boat, Long> {

	List<Boat> findByCode(@Param("code") String code);

}