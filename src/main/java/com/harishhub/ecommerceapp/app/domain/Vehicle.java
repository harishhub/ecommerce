package com.harishhub.ecommerceapp.app.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.io.Serializable;

@Entity
@Table(name = "vehicles")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Vehicle extends AbstractAuditable<User, Long> implements Serializable {

    @Id
    private long id;
    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Brand brand = Brand.FORD;


}
