package chessboard_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessBoard extends JFrame {
    private JPanel chessBoard;
    private final int boardSize = 8;
    private final Color lightSquareColor = Color.WHITE;
    private final Color darkSquareColor = Color.BLACK;

    public ChessBoard() {
        setTitle("Chess Board");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createChessBoard();
        getContentPane().add(chessBoard);

        setLocationRelativeTo(null);
    }

    private void createChessBoard() {
        chessBoard = new JPanel(new GridLayout(boardSize, boardSize));
        chessBoard.setPreferredSize(new Dimension(400, 400));

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                JPanel square = new JPanel();
                square.setBackground((row + col) % 2 == 0 ? lightSquareColor : darkSquareColor);
                chessBoard.add(square);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChessBoard board = new ChessBoard();
            board.setVisible(true);
        });
    }
}
