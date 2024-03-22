package com.sitas.checkin.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
@Table (name = "LUGGAGE_INFO")
public class LuggageInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int luggageInfoId;

    @Column(name = "SHIPPING_ADDRESS")
    @NonNull
    private String shippingAddress;

    @Column (name = "LUGGAGE_ID")
    private int luggageId;
}
