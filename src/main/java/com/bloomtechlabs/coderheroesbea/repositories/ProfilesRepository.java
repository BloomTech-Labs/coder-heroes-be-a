package com.bloomtechlabs.coderheroesbea.repositories;

import com.bloomtechlabs.coderheroesbea.entities.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides data exchange with the table 'profiles'
 */
@Repository
public interface ProfilesRepository extends JpaRepository<Profiles, Long> {

    List<Profiles> findProfilesByRoleId(Long roleId);
}
