package com.bloomtechlabs.coderheroesbea.services;

import com.bloomtechlabs.coderheroesbea.entities.Profiles;
import com.bloomtechlabs.coderheroesbea.repositories.ProfilesRepository;
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

    public Optional<Profiles> find(Long profileId) {
        return repository.findById(profileId);
    }

    public List<Profiles> findProfilesByRoleId(Long roleID) {
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
