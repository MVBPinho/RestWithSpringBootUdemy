package br.com.erudio.request.converters;

import org.springframework.stereotype.Service;

@Service
public class NumberConverter {

	public Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeic(number)) return Double.parseDouble(number);
		return 0D;
	}

	public boolean isNumeic(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
