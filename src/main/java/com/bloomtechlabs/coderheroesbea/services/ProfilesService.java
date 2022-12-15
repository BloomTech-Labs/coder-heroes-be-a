package com.bloomtechlabs.coderheroesbea.services;

import com.bloomtechlabs.coderheroesbea.entities.Profiles;
import com.bloomtechlabs.coderheroesbea.repositories.ProfilesRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfilesService {

    private ProfilesRepository repository;

    public ProfilesService(ProfilesRepository repository) {
        this.repository = repository;
    }


    public  Profiles createProfile(Profiles profile) {
        return repository.save(profile);
    }

    public List<Profiles> findAll() {
        return repository.findAll();
    }

    public Optional<Profiles> find(Long profileId)  {
        if (profileId == null) {
          throw new RuntimeException(" Invalid Profile Id Cannot Be Null ");
        }
        return repository.findById(profileId);
    }

    public List<Profiles> findProfilesByRoleId(Long roleID) {
        if (roleID == null) {
            throw new RuntimeException(" Invalid Role Id Cannot Be Null ");
        }
        return repository.findProfilesByRoleId(roleID);
    }

   public Optional<Profiles> updateProfile(Long profileId,Profiles updateProfile) {
        Optional<Profiles> profile = repository.findById(profileId);
        if (profile.isPresent()) {
           updateProfile.setProfile_id(Math.toIntExact(profileId));
           repository.save(updateProfile);
        }
        return profile;
   }

}
