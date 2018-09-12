package com.mbps.cd.userservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author EdisonZhou
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
