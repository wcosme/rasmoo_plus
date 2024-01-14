package com.client.ws.rasmoo.plus.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscription_type")
public class SubscriptionType implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscription_type_id")
    private Long id;
    private String name;

    @Column(name = "access_month")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "prduct_key")
    private String prductKey;

}
