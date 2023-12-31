package com.gh.ridesharing.entity;

import com.gh.ridesharing.enums.BookingStatus;

import com.gh.ridesharing.enums.RideType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Duration;

@Entity
@Data
public class Booking extends BaseEntity {

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Driver driver;

    @Column(name = "booking_status")
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Column(name = "booking_date_time")
    private LocalDateTime bookingDateTime;

    @Column(name = "pickup_location")
    private String pickupLocation;

    @Column(name = "dropoff_location")
    private String dropoffLocation;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "booking_source")
    private String bookingSource;

    @Column(name = "additional_notes")
    private String additionalNotes;

    @Column(name = "trip_duration")
    private Duration tripDuration;

    @Column(name = "driver_rating")
    private Integer driverRating;

    @Column(name = "customer_feedback")
    private String customerFeedback;

    @Column(name = "ride_type")
    @Enumerated(EnumType.STRING)
    private RideType type;
}


