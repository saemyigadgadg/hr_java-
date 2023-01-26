package com.my.hr6.domain;

import java.time.LocalDate;

public record Laborer(int laborerId, String laborerName, LocalDate hireDate) {
	public String toString() {
		return String.format("%2d %-5d %d", laborerId, laborerName, hireDate);
	}
}