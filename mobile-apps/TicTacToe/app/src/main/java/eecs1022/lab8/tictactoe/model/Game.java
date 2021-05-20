package eecs1022.lab8.tictactoe.model;

public class Game {
    private String playerX;
    private String playerO;
    private String currentPlayer;
    private String winner;
    private String status;
    private char[][] board;

    public Game(){

    }

    public Game(String p1, String p2){
        this.playerX = p1;
        this.playerO = p2;
        this.board = new char[][]{
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };
        this.currentPlayer = playerX;
        status = this.currentPlayer + "'s turn to play...";

    }

    public String getCurrentPlayer(){
        return this.currentPlayer;
    }

    public String getStatus(){
        return status;
    }

    public char[][] getBoard(){
        return this.board;
    }

    public String printBoard(){
        String result = "Current Game Board:\n";
        for(int i = 0; i < this.board.length; i ++){
            for(int j = 0; j < this.board[0].length; j++){
                result += this.board[i][j] + " ";
            }
            result += "\n";
        }

        return result;
    }

    public boolean isValid(int num){
        boolean isValid = true;
        if(num != 1 &&  num != 2 && num != 3) {
            isValid = false;
        }
        return isValid;
    }

    public boolean fullBoard(){
        boolean notFull = false;
        for(int row = 0; !notFull && row < 3; row++){
            for(int column = 0; !notFull && column < 3; column ++){
                if(board[row][column] == '_'){
                    notFull = true;
                }
            }
        }
        if(!notFull){
            this.currentPlayer = null;
        }
        return notFull;
    }

    public void checkWinner(){
        //check each row
        boolean sameRow = false;
        for(int row = 0; row <3; row ++){
            if(this.board[row][0] == this.board[row][1] &&  this.board[row][1] ==this.board[row][2] && this.board[row][0] != '_'){
                sameRow = true;
            }
            if(sameRow && board[row][0] == 'x'){
                this.winner = playerX;
            }
            else if(sameRow && board[row][0] == 'o'){
                this.winner = playerO;
            }
        }

        // check each column
        boolean sameColumn = false;
        for(int column = 0; column <3; column ++){
            if(this.board[0][column] == this.board[1][column] &&  this.board[1][column] == this.board[2][column]&& this.board[0][column] != '_'){
                sameColumn = true;
            }
            if(sameColumn && board[0][column] == 'x'){
                this.winner = playerX;
            }
            else if(sameColumn && board[0][column] == 'o'){
                this.winner = playerO;
            }
        }

        // check if one player succeeds in placing three of their marks in a diagonal line
        boolean sameDiagonalLine = false;
        if(board[0][0] == board [1][1] && board [1][1] == board[2][2] && board [1][1] != '_') {
            sameDiagonalLine = true;
            }

        if(board[0][2] == board [1][1] && board [1][1] == board[2][0] && board [1][1] != '_') {
            sameDiagonalLine = true;
            }

        if(sameDiagonalLine && board[1][1] == 'x'){
            this.winner = playerX;
            }

        if(sameColumn && board[1][1] == 'o'){
            this.winner = playerO;
            }

        if(sameColumn || sameDiagonalLine || sameRow){
            this.status = "Game is over with " + this.winner + " being the winner.";
            this.currentPlayer = null;
        }
    }


    public void setWhoPlaysFirst(char player) {
        if (player == 'o') {
            this.currentPlayer = playerO;
            status = currentPlayer + "'s turn to play...";
        }
    }

    public void move(int r, int c){
        boolean notFull = fullBoard();
        if(winner!= null){
            status = "Error: game is already over with a winner.";
        }
        else if(!notFull){
            status = "Error: game is already over with a tie.";
        }
        else if(!isValid(r)){
            status = "Error: row "+ r +" is invalid.";
        }
        else if(!isValid(c)){
            status = "Error: col "+ c +" is invalid.";
        }
        else if(board[r - 1][c - 1] != '_'){
            status = "Error: slot @ (" + r + ", "+ c + ") is already occupied.";
        }
        else{
            if(this.currentPlayer == playerX){
                board[r - 1][c - 1] = 'x';
                this.currentPlayer = playerO;
            }
            else if(this.currentPlayer == playerO){
                board[r - 1][c - 1] = 'o';
                this.currentPlayer = playerX;
            }

            checkWinner();
            if(this.winner != null){

            }
            if(this.winner == null){
                this.status = this.currentPlayer + "'s turn to play...";
            }

            notFull = fullBoard();
            if(!notFull){
                this.currentPlayer = null;
                if(this.winner == null){
                    status = "Game is over with a tie between " + playerX + " and " + playerO +".";

                }
            }
        }



    }






}
