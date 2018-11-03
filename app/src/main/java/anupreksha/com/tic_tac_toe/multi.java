package anupreksha.com.tic_tac_toe;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class multi extends AppCompatActivity {
    int turn;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        turn=1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b1.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b1.setText("o");

                    }
                }
                endGame();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("x");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("o");

                    }
                }
                endGame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b3.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b3.setText("o");

                    }
                }
                endGame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b4.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b4.setText("o");

                    }
                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b5.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b5.setText("o");

                    }

                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b6.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b6.setText("o");

                    }
                }
                endGame();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("x");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("o");

                    }
                }
                endGame();


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b8.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b8.setText("o");

                    }
                    endGame();
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")){
                    if (turn==1){
                        turn=2;
                        b9.setText("x");
                    }
                    else if(turn==2){
                        turn=1;
                        b9.setText("o");

                    }
                }
                endGame();

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

            }
        });
    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end=false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        if (c.equals("x") && b.equals("x") && a.equals("x")) {
            Toast.makeText(multi.this, "Winner Player x", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (d.equals("x") && e.equals("x") && f.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
       else if (g.equals("x") && h.equals("x") && i.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (c.equals("o") && b.equals("o") && a.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;
        }
        if (d.equals("o") && e.equals("o") && f.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }

        if (g.equals("o") && d.equals("o") && a.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (b.equals("o") && h.equals("o") && e.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (c.equals("o") && f.equals("o") && i.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (g.equals("x") && d.equals("x") && a.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (b.equals("x") && h.equals("x") && e.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (c.equals("x") && f.equals("x") && i.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (a.equals("x") && e.equals("x") && i.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (g.equals("x") && c.equals("x") && e.equals("x")) {
            Toast.makeText(multi.this, "X wins", Toast.LENGTH_LONG).show();
            end=true;
        }
        if (a.equals("o") && e.equals("o") && i.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }
        if (c.equals("o") && g.equals("o") && e.equals("o")) {
            Toast.makeText(multi.this, "O wins", Toast.LENGTH_LONG).show();
            end=true;

        }
       if(!a.equals("")&&!b.equals("")&&!c.equals("")&&!d.equals("")&&!e.equals("")&&!f.equals("")&&!g.equals("")&&!h.equals("")&&!i.equals("")&&!end){
           Toast.makeText(multi.this, "It's a draw", Toast.LENGTH_LONG).show();
        }

    }





}



