package io.github.jerrychin.testbackendjava.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * User, also used as Profile (it would be better to create new table).
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GenericGenerator(name = "user_id", strategy = "io.github.jerrychin.testbackendjava.generator.UserIdGenerator")
    @GeneratedValue(generator = "user_id")
    private String id;

    private LocalDateTime createdAt;

    /**
     * unique user name.
     */
    private String name;

    /**
     * date of birth.
     */
    private LocalDate dob;

    /**
     * user contact address
     */
    private String address;

    private String description;

    /**
     * associated account id.
     */
    private Long accountId;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
