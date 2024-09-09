/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingo;

/**
 *
 * @author Abdurrokhman
 */
public class BingoMain {
    public static void main(String[] args) {
        String lirik;
        
        lirik = "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "B-I-N-G-O\n" +
                "B-I-N-G-O\n" +
                "B-I-N-G-O\n" +
                "And Bingo was his name-o.\n\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-I-N-G-O\n" +
                "(clap)-I-N-G-O\n" +
                "(clap)-I-N-G-O\n" +
                "And Bingo was his name-o.\n\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-N-G-O\n" +
                "(clap)-(clap)-N-G-O\n" +
                "(clap)-(clap)-N-G-O\n" +
                "And Bingo was his name-o.\n\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "And Bingo was his name-o.\n\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "And Bingo was his name-o.\n\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "And Bingo was his name-o.";
        
        Bingo lagu = new Bingo(lirik);
        lagu.nyanyi();
    }
    
}
