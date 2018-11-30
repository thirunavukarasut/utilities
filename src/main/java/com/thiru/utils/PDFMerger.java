package com.thiru.utils;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public class PDFMerger {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		if(args.length < 2) {
			System.out.println("Usage: java PDFMerger <file1.pdf> <file2.pdf> [<file3.pdf> ...].");
			System.exit(-1);
		}
		
		PDFMergerUtility mergerUtility = new PDFMergerUtility();
		String mergedFileName = "merged-output.pdf";
		mergerUtility.setDestinationFileName(mergedFileName);

		for(int i=0;i<args.length;i++) {
			mergerUtility.addSource(new File(args[i]));
		}
		mergerUtility.mergeDocuments(null);
		System.out.println("Merged PDF output written to "+mergedFileName);
	}

}
