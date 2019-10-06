package com.church.church.Repository;

import com.church.church.Domain.Sermon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SermoRepo extends JpaRepository<Sermon, String> {
}
