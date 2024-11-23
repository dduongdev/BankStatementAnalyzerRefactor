package com.dduongdev;

import java.io.IOException;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        BankStatementParser bankStatementParser = new BankStatementCSVParser();
        bankStatementAnalyzer.analyze("transactions.csv", bankStatementParser);
	}
}
