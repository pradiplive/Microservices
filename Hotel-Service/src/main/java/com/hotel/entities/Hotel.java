package com.hotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hotels")
@Data
@Getter
@Setter
public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;


}
