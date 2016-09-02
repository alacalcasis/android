package android.pruebas.mimapaguiado2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;


public class SplitMapaCamaraActivity extends AppCompatActivity {

    private static final LatLng SANTANA = new LatLng(9.933299, -84.197926);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_mapa_camara);
    }
}
