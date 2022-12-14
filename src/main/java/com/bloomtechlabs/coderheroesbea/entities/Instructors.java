package com.bloomtechlabs.coderheroesbea.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "instructors")
public class Instructors {
    private int instructor_id;
    private String instructor_name;
    private int rating;
    private String availability;
    private String bio;
    private Profiles profile;
    private String status;
    private Date created_on;
    private Admins admin;

    /**
     * Constructor.
     * Default constructor is required to have Hibernate initialize the entity.
     */
    public Instructors() {

    }

    /**
     * Constructor with instructor_id.
     * @param instructor_id - primary key, auto-increments, generated by database
     */
    public Instructors(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    /**
     * Constructor with all fields.
     * @param instructor_id - primary key, auto-increments, generated by database
     * @param instructor_name - string
     * @param rating - integer
     * @param availability - string
     * @param bio - string
     * @param profile - integer (required, foreign key)
     * @param status - string (not null, default: 'pending')
     * @param created_on - timestamp (auto-generated)
     * @param admin - integer
     */
    public Instructors(int instructor_id, String instructor_name, int rating, String availability, String bio,
                       Profiles profile, String status, Date created_on, Admins admin) {
        this.instructor_id = instructor_id;
        this.instructor_name = instructor_name;
        this.rating = rating;
        this.availability = availability;
        this.bio = bio;
        this.profile = profile;
        this.status = status;
        this.created_on = created_on;
        this.admin = admin;
    }
    @Id
    @Column(name = "instructor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }
    @Column(name = "instructor_name", nullable = false)
    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    @Column(name = "availability")
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    @Column(name = "bio", nullable = false)
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name ="profile_id", referencedColumnName = "profile_id", nullable = false, unique = true)
    public Profiles getProfile() {
        return profile;
    }

    public void setProfile(Profiles profile) {
        this.profile = profile;
    }
    @Column(name = "status", columnDefinition = "varchar(255) default 'pending'")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Column(name = "created_on", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name ="approved_by", referencedColumnName = "admin_id")
    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }
}
