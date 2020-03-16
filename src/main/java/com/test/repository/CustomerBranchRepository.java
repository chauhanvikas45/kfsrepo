package com.test.repository;

import com.test.entity.CustomerBranch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBranchRepository extends CrudRepository<CustomerBranch, String> {

}
