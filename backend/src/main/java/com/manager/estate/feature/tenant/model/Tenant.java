package com.manager.estate.feature.tenant.model;
import com.manager.estate.feature.apartment.model.Apartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private String documentId;
    private LocalDate birthday;
    @ManyToOne
    private Apartment apartment;
}