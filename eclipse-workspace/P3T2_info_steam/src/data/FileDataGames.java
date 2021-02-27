package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import Controller.GameController;

public class FileDataGames {

	public static void main(String[] args) throws IOException {

		GameController gc = new GameController();

		gc.save(0, "Apex", 56.2);

		gc.save(1, "CSGO", 24.0);

		gc.save(2, "Age of Empires II DE", 14.6);

		FileWriter fw = new FileWriter("D:/GamesST.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(Arrays.toString(gc.list())); // tambien funciona println
		bw.close();

	}
	
	

}
