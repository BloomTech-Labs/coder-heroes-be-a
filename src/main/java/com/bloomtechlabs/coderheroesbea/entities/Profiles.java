package com.bloomtechlabs.coderheroesbea.entities;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profiles {
    private int profile_id;
    private String email;
    private String name;
    private String okta_id;
    private Roles role;
    private String avatarUrl;
    private String pending;

    /**
     * Constructor.
     * Default constructor is required to have Hibernate initialize the entity.
     */
    public Profiles() {

    }

    /**
     * Constructor with profile_id.
     * @param profile_id - primary key (auto-increments, generated by database)
     */
    public Profiles(int profile_id) {
        this.profile_id = profile_id;
    }

    /**
     * Constructor with all fields.
     * @param profile_id - primary key (auto-increments, generated by database)
     * @param email - string
     * @param name - string
     * @param okta_id - string (unique)
     * @param role - foreign key (table 'roles')
     * @param avatarUrl - string (defaults to: 'https://i.stack.imgur.com/frlIf.png')
     * @param pending - string
     */
    public Profiles(int profile_id, String email, String name, String okta_id, Roles role,
                    String avatarUrl, String pending) {
        this.profile_id = profile_id;
        this.email = email;
        this.name = name;
        this.okta_id = okta_id;
        this.role = role;
        this.avatarUrl = avatarUrl;
        this.pending = pending;
    }

    @Id
    @Column(name = "profile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "okta_id", unique = true)
    public String getOkta_id() {
        return okta_id;
    }

    public void setOkta_id(String okta_id) {
        this.okta_id = okta_id;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name ="role_id", nullable = false)
    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Column(name = "avatarurl", columnDefinition = "varchar(255) default 'https://i.stack.imgur.com/frlIf.png'")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Column(name = "pending")
    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }
}
