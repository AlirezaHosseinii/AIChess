package com.example.aichess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.aichess.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout chessBoard = findViewById(R.id.chessBoard);
        createChessBoard(chessBoard);
    }

    private void createChessBoard(TableLayout chessBoard){
        for (int row = 0; row < 8; row++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    1.0f
            ));

            for (int column = 0; column < 8; column++) {
                ImageView square = new ImageView(this);
                square.setLayoutParams(new TableRow.LayoutParams(
                        0    ,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        1.0f
                ));

                if ((row + column) % 2 == 0) {
                    square.setBackgroundResource(R.drawable.white_square);
                } else {
                    square.setBackgroundResource(R.drawable.black_square);
                }
                tableRow.addView(square);
            }
            chessBoard.addView(tableRow);
        }
    }
}
