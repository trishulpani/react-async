package org.solobyte.reactasync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="client")
@Getter
@Setter
@AllArgsConstructor
public class Client {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    /**
     * Mandatory default constructor for JPA Entity
     * otherwise results in {@link org.springframework.orm.jpa.JpaSystemException}: No default constructor for entity 'org.solobyte.reactasync.model.Client'
     */
    public Client(){

    }
}
