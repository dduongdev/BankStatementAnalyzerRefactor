package com.dduongdev;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
	private LocalDate date;
	private double amount;
	private String category;
	
	public BankTransaction(LocalDate date, double amount, String category) {
		this.date = date;
		this.amount = amount;
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "BankTransaction [date=" + date + ", amount=" + amount + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, category, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankTransaction other = (BankTransaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(category, other.category) && Objects.equals(date, other.date);
	}
}
