package com.cap.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cap.enums.BookingState;

@Entity
@Table(name="seat")

public class Seat {

	@Id
	@GeneratedValue
	
	private Integer seatId;
	private BookingState seatStatus;
	private Double seatPrice;
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public BookingState getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(BookingState seatStatus) {
		this.seatStatus = seatStatus;
	}
	public Double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatStatus=" + seatStatus + ", seatPrice=" + seatPrice + "]";
	}

	
	
	
	
}
