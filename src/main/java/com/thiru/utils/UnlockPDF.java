package com.thiru.utils;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public class UnlockPDF {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		if(args.length < 2) {
			System.out.println("Usage: java UnlockPDF <file.pdf> <password>.");
			System.exit(-1);
		}
		
		PDDocument source = PDDocument.load(new File(args[0]), args[1]);
		//TODO create a clone of source without password
	}

}
