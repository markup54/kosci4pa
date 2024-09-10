package pl.zabrze.zs10.kosci4p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    public Button buttonRzuc;
    public TextView textViewWynik;
    public Kosc[] kostki = new Kosc[5];
    public ImageView[] obrazyKosci = new ImageView[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}