package com.example.tictactoeapp;

import android.content.DialogInterface;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    //    Declaring .xml view Variable
    TextView txtrealScoreX;
    TextView txtrealScoreO;

    ImageView btnImg1;
    ImageView btnImg2;
    ImageView btnImg3;
    ImageView btnImg4;
    ImageView btnImg5;
    ImageView btnImg6;
    ImageView btnImg7;
    ImageView btnImg8;
    ImageView btnImg9;

    Button btnReset;

    //    by default value startGame is "x"
    String startGame = "X";
    //    assining by default value in int Variable
    int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, xCount = 0, oCount = 0, i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        finding .xml id's in .java code
        txtrealScoreX = findViewById(R.id.realScoreX);
        txtrealScoreO = findViewById(R.id.realScoreO);

        btnImg1 = findViewById(R.id.btnImg1);
        btnImg2 = findViewById(R.id.btnImg2);
        btnImg3 = findViewById(R.id.btnImg3);
        btnImg4 = findViewById(R.id.btnImg4);
        btnImg5 = findViewById(R.id.btnImg5);
        btnImg6 = findViewById(R.id.btnImg6);
        btnImg7 = findViewById(R.id.btnImg7);
        btnImg8 = findViewById(R.id.btnImg8);
        btnImg9 = findViewById(R.id.btnImg9);

        btnReset = findViewById(R.id.btnReset);

//         ClickListener on btReset to Restart and Reset the game
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                setting ImageResource null
                btnImg1.setImageDrawable(null);
                btnImg2.setImageDrawable(null);
                btnImg3.setImageDrawable(null);
                btnImg4.setImageDrawable(null);
                btnImg5.setImageDrawable(null);
                btnImg6.setImageDrawable(null);
                btnImg7.setImageDrawable(null);
                btnImg8.setImageDrawable(null);
                btnImg9.setImageDrawable(null);

//                calling resetValues() method
                resetValues();

//                setting 0 score values on, Button clicked
                xCount = 0;
                oCount = 0;

                //                setting Score X and O player to 0, on Reset Button Clicked
                txtrealScoreX.setText(String.valueOf(xCount));
                txtrealScoreO.setText(String.valueOf(oCount));
            }
        });


//        Event listener on btnImg1
        btnImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                calling   clickedSound(); method
                clickedSound();

//                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
//                    setting ImageResource as a letter_x
                    btnImg1.setImageResource(R.drawable.letter_x);
//                    set value of variable b1=1
                    b1 = 1;
//                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg1.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b1=0
                    b1 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

//                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

//        Event listener on btnImg2
        btnImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();
                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg2.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b2=1
                    b2 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg2.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b2=0
                    b2 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

//        Event listener on btnImg3
        btnImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg3.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b3=1
                    b3 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg3.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b3=0
                    b3 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

        //        Event listener on btnImg4
        btnImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg4.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b4=1
                    b4 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg4.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b4=0
                    b4 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

        //        Event listener on btnImg5
        btnImg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg5.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b5=1
                    b5 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg5.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b5=0
                    b5 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

//        Event listener on btnImg6
        btnImg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg6.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b6=1
                    b6 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg6.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b6=0
                    b6 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

//        Event listener on btnImg7
        btnImg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg7.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b7=1
                    b7 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg7.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b7=0
                    b7 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });


        //        Event listener on btnImg8
        btnImg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg8.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b8=1
                    b8 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg8.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b8=0
                    b8 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

//        Event listener on btnImg9
        btnImg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //                calling   clickedSound(); method
                clickedSound();

                //                if the startGame == X then, set ImageResource as a letter_x, if not then, set ImageResource as a letter_o
                if (startGame.equals("X")) {
                    //                    setting ImageResource as a letter_x
                    btnImg9.setImageResource(R.drawable.letter_x);
                    //                    set value of variable b9=1
                    b9 = 1;
                    //                    post increament i++ by 1
                    i++;
                } else {
                    //                    setting ImageResource as a letter_o
                    btnImg9.setImageResource(R.drawable.letter_o);
                    //                    set value of variable b9=0
                    b9 = 0;
                    //                    post increament i++ by 1
                    i++;
                }

                //                calling choosePlayer() method
                choosePlayer();
                //                calling winningGame() method
                winningGame();
            }
        });

    }


//    creating winningGame() method, in this method, we define all possibilities of Winning
    private void winningGame() {


//        if b1 == 1, b2 == 1 and b3 == 1, then (1. possibilities of X player winning)
        if ((b1 == 1) && (b2 == 1) && (b3 == 1)) {

//            play winning sound by calling winningSound() method
            winningSound();

//            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
//                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
//                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

//                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

//                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("Let's Play Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

//            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
//            showing AlertDialog Box
            alertDialog.show();

//            Counting the Score of X player by 1
            xCount++;
//            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b4 == 1, b4 == 1 and b6 == 1, then (2. possibilities of X player winning)
        } else if ((b4 == 1) && (b5 == 1) && (b6 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog Box
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog Box
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b7 == 1, b8 == 1 and b9 == 1, then (3. possibilities of X player winning)
        } else if ((b7 == 1) && (b8 == 1) && (b9 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b1 == 1, b4 == 1 and b7 == 1, then (4. possibilities of X player winning)
        } else if ((b1 == 1) && (b4 == 1) && (b7 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game
                            resetValues();
                        }
                    })
                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b == 1, b5 == 1 and b8 == 1, then (5. possibilities of X player winning)
        } else if ((b2 == 1) && (b5 == 1) && (b8 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b3 == 1, b6 == 1 and b9 == 1, then (6. possibilities of X player winning)
        } else if ((b3 == 1) && (b6 == 1) && (b9 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog Box
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b == 1, b5 == 1 and b9 == 1, then (7. possibilities of X player winning)
        } else if ((b1 == 1) && (b5 == 1) && (b9 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));

            //        if b3 == 1, b5 == 1 and b7 == 1, then (8. possibilities of X player winning)
        } else if ((b3 == 1) && (b5 == 1) && (b7 == 1)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of X player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player X Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_x)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of X player by 1
            xCount++;
            //            and display score of X player on txtrealScoreX TextView
            txtrealScoreX.setText(String.valueOf(xCount));


            //        if b == 0, b2 == 0 and b3 == 0, then (1. possibilities of O player winning)
        } else if ((b1 == 0) && (b2 == 0) && (b3 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b4 == 0, b5 == 0 and b6 == 0, then (2. possibilities of O player winning)
        } else if ((b4 == 0) && (b5 == 0) && (b6 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting PositiveButton on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b7 == 0, b8 == 0 and b9 == 0, then (1. possibilities of O player winning)
        } else if ((b7 == 0) && (b8 == 0) && (b9 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b1 == 0, b4 == 0 and b7 == 0, then (4. possibilities of O player winning)
        } else if ((b1 == 0) && (b4 == 0) && (b7 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b2 == 0, b5 == 0 and b8 == 0, then (5. possibilities of O player winning)
        } else if ((b2 == 0) && (b5 == 0) && (b8 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b3 == 0, b6 == 0 and b9 == 0, then (6. possibilities of O player winning)
        } else if ((b3 == 0) && (b6 == 0) && (b9 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of X player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b1 == 0, b5 == 0 and b9 == 0, then (7. possibilities of O player winning)
        } else if ((b1 == 0) && (b5 == 0) && (b9 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

            //        if b3 == 0, b5 == 0 and b7 == 0, then (8. possibilities of O player winning)
        } else if ((b3 == 0) && (b5 == 0) && (b7 == 0)) {

            //            play winning sound by calling winningSound() method
            winningSound();

            //            creating AlertDialog Box, after winning of O player
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //            setting message of AlertDialog
            builder.setMessage("Player O Is Win ")
                    //                   also setting Title of AlertDialog Box
                    .setTitle("Congratulation......!!")
                    //                    setting icon on AlertDialog
                    .setIcon(R.drawable.letter_o)

                    //                    setting NegativeButton on AlertDialog Box
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if NegativeButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    })

                    //                    setting Positive Button on AlertDialog Box
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //                            if PositiveButton is clicked, then set ImageResource to null
                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            //                            re-setting all values of game by calling resetValues()
                            resetValues();
                        }
                    });

            //            creating AlertDialog with Icon, Title and Message
            AlertDialog alertDialog = builder.create();
            //            showing AlertDialog Box
            alertDialog.show();

            //            Counting the Score of O player by 1
            oCount++;
            //            and display score of O player on txtrealScoreO TextView
            txtrealScoreO.setText(String.valueOf(oCount));

        } else {

//            else i == 9 means all ImageView is clicked by 9 times and non possibilities arrived, then match get Tie
            if (i == 9) {

                //            creating AlertDialog Box, after Match get Tie
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                //                   also setting Title of AlertDialog Box
                builder.setTitle("Match Tie")
                        //                    setting icon on AlertDialog
                        .setIcon(R.drawable.see_you)
                        //            setting message of AlertDialog
                        .setMessage("Hard Fight.......!!")

                        //                    setting NegativeButton on AlertDialog Box
                        .setNegativeButton("Let's Play Again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                //                            if NegativeButton is clicked, then set ImageResource to null
                                btnImg1.setImageDrawable(null);
                                btnImg2.setImageDrawable(null);
                                btnImg3.setImageDrawable(null);
                                btnImg4.setImageDrawable(null);
                                btnImg5.setImageDrawable(null);
                                btnImg6.setImageDrawable(null);
                                btnImg7.setImageDrawable(null);
                                btnImg8.setImageDrawable(null);
                                btnImg9.setImageDrawable(null);

                                //                            re-setting all values of game by calling resetValues()
                                resetValues();
                            }
                        });

                        //                    setting Positive Button on AlertDialog Box
//                        .setPositiveButton("Surrender Myself", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                                btnImg1.setImageDrawable(null);
//                                btnImg2.setImageDrawable(null);
//                                btnImg3.setImageDrawable(null);
//                                btnImg4.setImageDrawable(null);
//                                btnImg5.setImageDrawable(null);
//                                btnImg6.setImageDrawable(null);
//                                btnImg7.setImageDrawable(null);
//                                btnImg8.setImageDrawable(null);
//                                btnImg9.setImageDrawable(null);
//
//                                resetValues();
//
//                               // finish();
//                            }
//                        });

                //            creating AlertDialog with Icon, Title and Message
                AlertDialog alertDialog = builder.create();
                //            showing AlertDialog Box
                alertDialog.show();

            }
        }

    }

// creating method choosePlayer() to alternate the player turn
    private void choosePlayer() {

//        if the startGame == X, then set startGame = O
        if (startGame.equals("X")) {
//            setting startGame = O
            startGame = "O";
        } else {
//            else set startGame = X
            startGame = "X";
        }

    }


    //    creating method for re-setting all values of game or setting it to default values as above set
    private void resetValues() {

//        setting and assigning default value of variable
        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;

        i = 0;
    }

//    creating method clickedSound(); for playing clicked sound on ImageView get Clicked
    public void clickedSound() {
//        Creating MediaPlayer class instance and calling create() method and provide Media Resource
        MediaPlayer audio = MediaPlayer.create(this, R.raw.cliked_sound);
//        start playing audio
        audio.start();
    }

    //    creating method winningSound(); for playing winning sound, possibilities is match
    public void winningSound() {
        //        Creating MediaPlayer class instance and calling create() method and provide Media Resource
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.winning_sound);
        //        start playing audio
        mediaPlayer.start();
    }
}