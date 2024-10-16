import java.util.Random;
import javax.swing.JOptionPane;

public class gamemovie {
    public static void main(String[] args) {
        String[] movies={
                "Carry On Jatta",
                "Jatt & Juliet",
                "Sardaar Ji",
                "Angrej",
                "Punjab 1984",
                "Qismat",
                "Manje Bistre",
                "Shadaa",
                "Ardaas",
                "Laung Laachi",
                "Nikka Zaildar",
                "Chal Mera Putt",
                "Rabb Da Radio",
                "Surkhi Bindi",
                "Jora 10 Numbaria",
                "Muklawa",
                "Lahoriye",
                "Bambukat",
                "Daana Paani",
                "Uda Aida"
        };
        Random random = new Random();
        int r= random.nextInt(movies.length);
        String smovie= movies[r];
        char[] guess= new char[smovie.length()];
        for (int i = 0; i < smovie.length(); i++) {
            if (smovie.charAt(i)==' '){
                guess[i]=' ';
            } else if (smovie.charAt(i)=='a') {
                guess[i]=smovie.charAt(i);
            }
            else if (smovie.charAt(i)=='e') {
                guess[i]=smovie.charAt(i);
            }
            else if (smovie.charAt(i)=='i') {
                guess[i]=smovie.charAt(i);
            }
            else if (smovie.charAt(i)=='o') {
                guess[i]=smovie.charAt(i);
            }
            else if (smovie.charAt(i)=='u') {
                guess[i]=smovie.charAt(i);
            }
            else{
                guess[i]='_';
            }
        }
        JOptionPane.showMessageDialog(null,"Welcome to guess the Movies game by Sanchit");
        int attemps=5;
        while (attemps>0){
            boolean b= true;
            boolean a=false;
            String att= JOptionPane.showInputDialog("Guess the Following movie:\nAttemps:"+attemps+"\n"+new String(guess));
            for (int i = 0; i < smovie.length(); i++) {
                if (att.charAt(0)==new String(guess).charAt(i)){
                    b=false;
                    break;
                }
            }
            if (!b){
                attemps--;
                JOptionPane.showMessageDialog(null,att+" is Already Guessed\n"+attemps+" Left!");
                continue;
            }
            for (int i = 0; i < smovie.length()&& b; i++) {
                if(att.charAt(0)==smovie.charAt(i)){
                    guess[i]=att.charAt(0);
                    a=true;
                }
            }
            if (!a){
                attemps--;
                JOptionPane.showMessageDialog(null,"Wrong guess!\n"+attemps+" Left");
            }
            if(new String(guess).equals(smovie)){
                JOptionPane.showMessageDialog(null,"Congratulations! You Won.\n"+attemps+" Left\n"+"Movie : "+smovie);
                return;
            }
        }
        if (attemps==0){
            JOptionPane.showMessageDialog(null,"Better Luck Next Time! you loose.\nMovie was "+smovie);
        }



    }
}
