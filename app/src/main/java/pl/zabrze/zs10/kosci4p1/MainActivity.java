package pl.zabrze.zs10.kosci4p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    public Button buttonRzuc;
    public TextView textViewWynik;
    public Kosc[] kostki ;
    public ImageView[] obrazyKosci = new ImageView[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kostki = new Kosc[]{
                new Kosc(),new Kosc(),new Kosc(),new Kosc(),new Kosc()
        };
        obrazyKosci[0] = findViewById(R.id.imageButton1);
        obrazyKosci[1] = findViewById(R.id.imageButton2);
        obrazyKosci[2] = findViewById(R.id.imageButton3);
        obrazyKosci[3] = findViewById(R.id.imageButton4);
        obrazyKosci[4] = findViewById(R.id.imageButton5);
        textViewWynik = findViewById(R.id.textView);
        buttonRzuc = findViewById(R.id.button);
        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int suma =0;

                        for (Kosc k: kostki) {
                            k.rzucKoscia();
                            suma = suma + k.getWartosc();
                        }


                        for (int i = 0; i <obrazyKosci.length ; i++) {
                            obrazyKosci[i].setImageResource(kostki[i].getIdObrazka());
                        }

                        textViewWynik.setText(Integer.toString(suma));
                    }
                }
        );

        for (int i = 0; i < obrazyKosci.length; i++) {
            final int indeks = i;
            obrazyKosci[i].setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            kostki[indeks].zablokujKosc();
                            if(kostki[indeks].isZablokowana() == true) {
                                obrazyKosci[indeks].setImageAlpha(50);
                            }
                            else{
                                obrazyKosci[indeks].setImageAlpha(200);
                            }
                        }
                    }
            );
        }
    }
}