import javax.swing.*;
import java.util.Random;

public class MovieGuessGame {
    public static void main(String[] args) {
        //An Array Of String containing all movies
        String[] movies={
                "Inception",
                "Gladiator",
                "Titanic",
                "The Matrix",
                "Interstellar",
                "Joker",
                "Avatar",
                "Dunkirk",
                "Se7en",
                "Braveheart",
                "Jaws",
                "Casablanca",
                "Alien",
                "Die Hard",
                "Rocky",
                "Zodiac",
                "Psycho",
                "Scarface",
                "Skyfall",
                "Heat"
        };
        //Random to pick a random no. to random movie from array of movies
        Random rand=new Random();
        int r= rand.nextInt(movies.length);
        //Assigning random movie to a String
        String movie= movies[r];
        //for creating blanks and showing vowels
        char[] guessed= new char[movie.length()];
        for (int i = 0; i < movie.length(); i++) {
            if (movie.charAt(i)==' '||movie.charAt(i)=='a'||movie.charAt(i)=='e'||movie.charAt(i)=='i'||movie.charAt(i)=='o'||movie.charAt(i)=='u') {
                guessed[i]=movie.charAt(i);
            }
            else{
                guessed[i]='_';
            }
        }
        //attempts
        int attempts=5;
        //GUI
        JOptionPane.showMessageDialog(null,"Welcome to guess the movie game by Sanchit\nYou have "+attempts+" tries");
        //logic
        while (attempts>0){
            boolean rg=false;
            boolean ag=false;
            String guess=JOptionPane.showInputDialog("Guess the Following Movie:\nAttempts : "+attempts+"\n"+new String(guessed));
            for (int i = 0; i < movie.length(); i++) {
                if (guess.charAt(0)==guessed[i]){
                    ag=true;
                    break;
                }
            }
            if (ag){
                attempts--;
                JOptionPane.showMessageDialog(null,guess.charAt(0)+"is Already Guessed\n"+attempts+" Left!");
                continue;
            }
            for (int i = 0; i < movie.length(); i++) {
                if(guess.charAt(0)==movie.charAt(i)){
                    guessed[i]=guess.charAt(0);
                    rg=true;
                }
            }
            if (!rg){
                attempts--;
                JOptionPane.showMessageDialog(null,"Wrong guess!\n"+attempts+" Left");
            }
            if (new String(guessed).equals(movie)){
                JOptionPane.showMessageDialog(null,"Congratulations!! You Won!\nAttempts : "+attempts+"\nMovie : "+movie);
                return;
            }
        }
        if (attempts==0){
            JOptionPane.showMessageDialog(null,"Better Luck Next Time! you loose.\nMovie was :"+movie);
        }
    }
}
