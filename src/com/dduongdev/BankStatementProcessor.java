package com.dduongdev;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
	private List<BankTransaction> bankTransactions;
	
	public BankStatementProcessor(List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}
	
	public double calculateTotalAmount() {
		double total = 0;
		for (BankTransaction bankTransaction : bankTransactions) {
			total += bankTransaction.getAmount();
		}
		return total;
	}
	
	public double calculateTotalInMonth(Month month) {
		double total = 0;
		for (BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}
	
	public double calculateTotalForCategory(String category) {
		double total = 0;
		for (BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getCategory().equals(category)) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}
}
