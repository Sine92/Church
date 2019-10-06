package com.church.church.Repository;

import com.church.church.Domain.Pastor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastorRepo extends JpaRepository<Pastor, String> {

}
