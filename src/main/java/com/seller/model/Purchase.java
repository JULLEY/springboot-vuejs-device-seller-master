package com.seller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)   // it is only for foreign key
    private User user;

    @Column(name = "device_id", nullable = false)
    private Long deviceId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "id", insertable = false, updatable = false)   // it is only for foreign key
    private Device device;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "colour", nullable = false)
    private String colour;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}
