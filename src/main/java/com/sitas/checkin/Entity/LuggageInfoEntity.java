package com.sitas.checkin.Entity;
import jakarta.persistence.*;

@Entity
@Table (name = "LUGGAGE_INFO")
public class LuggageInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int luggageInfoId;

    @Column(name = "SHIPPING_ADDRESS")
    private String shippingAddress;

    public int getLostLuggageId() {
        return luggageInfoId;
    }

    public void setLostLuggageId(int lostLugageId) {
        this.luggageInfoId = lostLugageId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "LuggageInfoEntity{" +
                "lostLugageId=" + luggageInfoId +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
