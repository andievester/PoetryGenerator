package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QuizMaker {


	public QuizMaker() {
	
	}

	public static void main(String[] args) throws IOException {
		QuizMaker quizMaker = new QuizMaker();


		String filePath1 = "questions1.txt";
		File quizFile1 = quizMaker.getQuizFile(filePath1);
		Scanner fileInput1 = new Scanner(quizFile1);
		while (fileInput1.hasNextLine()) {
			String quizQuestionFromFile = fileInput1.nextLine();
			System.out.println(quizQuestionFromFile);
		}
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String ans1 = obj1.nextLine();
		
		String filePath2 = "questions2.txt";
		File quizFile2 = quizMaker.getQuizFile(filePath2);
		Scanner fileInput2 = new Scanner(quizFile2);
		while (fileInput2.hasNextLine()) {
			String quizQuestionFromFile = fileInput2.nextLine();
			System.out.println(quizQuestionFromFile);
		}
		
		Scanner obj2 = new Scanner(System.in);
		System.out.println("\nEnter a number: ");
		String ans2 = obj1.nextLine();	
	
		
		String filePathSmile = "a-smile-to-remember.txt";
		File poemFileSmile = quizMaker.getQuizFile(filePathSmile);
		Scanner smileInput = new Scanner(poemFileSmile);
		
		String filePathAlone = "alone-with-everybody.txt";
		File poemFileAlone = quizMaker.getQuizFile(filePathAlone);
		Scanner aloneInput = new Scanner(poemFileAlone);
		
		String filePathBluebird = "bluebird.txt";
		File poemFileBluebird = quizMaker.getQuizFile(filePathBluebird);
		Scanner bluebirdInput = new Scanner(poemFileBluebird);
		
		String filePathMusic = "faint-music.txt";
		File poemFileMusic = quizMaker.getQuizFile(filePathMusic);
		Scanner musicInput = new Scanner(poemFileMusic);
		
		String filePathJoy = "joy-and-sorrow.txt";
		File poemFileJoy = quizMaker.getQuizFile(filePathJoy);
		Scanner joyInput = new Scanner(poemFileJoy);
		
		String filePathMeditation = "meditation-at-lagunitas.txt";
		File poemFileMeditation = quizMaker.getQuizFile(filePathMeditation);
		Scanner meditationInput = new Scanner(poemFileMeditation);
		
		String filePathWoman = "phenomenal-woman.txt";
		File poemFileWoman = quizMaker.getQuizFile(filePathWoman);
		Scanner womanInput = new Scanner(poemFileWoman);
		
		String filePathSong = "song-of-the-builders.txt";
		File poemFileSong = quizMaker.getQuizFile(filePathSong);
		Scanner songInput = new Scanner(poemFileSong);
		
		String filePathSurvivor = "survivor-2014.txt";
		File poemFileSurvivor = quizMaker.getQuizFile(filePathSurvivor);
		Scanner survivorInput = new Scanner(poemFileSurvivor);
		
		String filePathFork = "the-sound-of-one-fork.txt";
		File poemFileFork = quizMaker.getQuizFile(filePathFork);
		Scanner forkInput = new Scanner(poemFileFork);
		
		String filePathTradition = "the-tradition.txt";
		File poemFileTradition = quizMaker.getQuizFile(filePathTradition);
		Scanner traditionInput = new Scanner(poemFileTradition);
		
		String filePathRemember = "remember.txt";
		File poemFileRemember = quizMaker.getQuizFile(filePathRemember);
		Scanner rememberInput = new Scanner(poemFileRemember);
		 
		
		if ((ans1.equals("4") && ans2.equals("2")) || (ans1.equals("9") && ans2.equals("1"))) {
			while (smileInput.hasNextLine()) {
				String poemFromFile = smileInput.nextLine();
				System.out.println(poemFromFile);
			}
		} else if ((ans1.equals("6") && ans2.equals("1"))) {
			while (meditationInput.hasNextLine()) {
				String poemFromFile = meditationInput.nextLine();
				System.out.print(poemFromFile);
			}
		}else if ((ans1.equals("1") && ans2.equals("1")) || (ans1.equals("2") && ans2.equals("2"))) {
			while (survivorInput.hasNextLine()) {
				String poemFromFile = survivorInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("2") && ans2.equals("1")) || (ans1.equals("1") && ans2.equals("2"))) {
			while (aloneInput.hasNextLine()) {
				String poemFromFile = aloneInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("3") && ans2.equals("1")) || (ans1.equals("9") && ans2.equals("2"))) {
			while (bluebirdInput.hasNextLine()) {
				String poemFromFile = bluebirdInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("4") && ans2.equals("1"))) {
			while (joyInput.hasNextLine()) {
				String poemFromFile = joyInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("3") && ans2.equals("2"))) {
			while (songInput.hasNextLine()) {
				String poemFromFile = songInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("5") && ans2.equals("1")) || (ans1.equals("6") && ans2.equals("2")) || (ans1.equals("8") && ans2.equals("2"))) {
			while (traditionInput.hasNextLine()) {
				String poemFromFile = traditionInput.nextLine();
				System.out.print(poemFromFile);
			}
		}  else if ((ans1.equals("7") && ans2.equals("1"))) {
			while (forkInput.hasNextLine()) {
				String poemFromFile = forkInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("7") && ans2.equals("2"))) {
			while (musicInput.hasNextLine()) {
				String poemFromFile = musicInput.nextLine();
				System.out.print(poemFromFile);
			}
		} else if ((ans1.equals("8") && ans2.equals("1"))) {
			while (womanInput.hasNextLine()) {
				String poemFromFile = womanInput.nextLine();
				System.out.print(poemFromFile);
			}
		} 
		 
		
	}
		 

	public File getQuizFile(String filePath) throws IOException {
		File quizFile = new File(filePath);

		if (!quizFile.exists()) {
			throw new FileNotFoundException("Search file: " + filePath + " does not exist.");
		}

		if (!quizFile.isFile()) {
			throw new IOException("Search file: " + filePath + " exists but is not a file.");
		}

		return quizFile;
	}

}