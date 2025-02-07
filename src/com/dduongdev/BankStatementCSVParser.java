package com.dduongdev;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	@Override
	public BankTransaction parseFrom(String line) {
		String[] columns = line.split(",");
		LocalDate date = LocalDate.parse(columns[0], formatter);
		double amount = Double.parseDouble(columns[1]);
		String category = columns[2];
		return new BankTransaction(date, amount, category);
	}

	@Override
	public List<BankTransaction> parseLinesFrom(List<String> lines) {
		List<BankTransaction> bankTransactions = new ArrayList<BankTransaction>();
		for (String line : lines) {
			bankTransactions.add(parseFrom(line));
		}
		return bankTransactions;
	}
	
}
