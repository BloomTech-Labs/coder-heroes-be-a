package com.bloomtechlabs.coderheroesbea.controllers;

import com.bloomtechlabs.coderheroesbea.entities.Profiles;
import com.bloomtechlabs.coderheroesbea.services.ProfilesService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfilesController {

    private ProfilesService service;

    public void ProfilesController(ProfilesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Profiles>> getAllProfiles() {
        List<Profiles> profiles = service.findAll();
        return ResponseEntity.ok().body(profiles);
    }

    @GetMapping(value = "/{profiles_id}")
    public ResponseEntity<Object> getProfileByID(@PathVariable("profiles_id") Long profile_id) {
        Optional<Profiles> profile = service.find(profile_id);
        return ResponseEntity.of(Optional.ofNullable(profile));

    }

    @GetMapping(value = "/role/{role_id}")
    public ResponseEntity<List<Profiles>> getProfilesByRoleId(@PathVariable("role_id") Long role_id) {
        List<Profiles> profiles = service.findProfilesByRoleId(role_id);
        return ResponseEntity.ok().body(profiles);
    }

    @PostMapping
    public ResponseEntity<Profiles> createProfile(@Valid @RequestBody Profiles profile) {
        Profiles newProfile = service.createProfile(profile);
        URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newProfile.getProfile_id())
                .toUri();
        return ResponseEntity.ok().build();

    }

    @PutMapping(value = "/{profile_id}")
    public ResponseEntity<Profiles> updateProfile(@PathVariable("profile_id") Long profile_id,
                                                  @Valid @RequestBody Profiles updateProfile) {
      Optional<Profiles> updated = service.updateProfile(profile_id, updateProfile);
      return ResponseEntity.of(updated);
    }


}
