package com.example.morrisons.items;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// item repository
@Repository
public interface ItemsRepository extends CrudRepository<ItemsInfo, String> {

}
