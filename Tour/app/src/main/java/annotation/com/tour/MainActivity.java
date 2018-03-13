package annotation.com.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button restaurant, museum, publicPlaces, tourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurant = (Button) findViewById(R.id.restaurants);
        museum = (Button) findViewById(R.id.museum);
        publicPlaces = (Button) findViewById(R.id.public_places);
        tourism = (Button) findViewById(R.id.tourism);

        //restaurant button, it takes users to RestaurantsActivity activity that displays list of restaurant
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inmm = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(inmm);
            }
        });
        //museum button, it takes users to MuseumActivity activity that displays list of museum
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inmm = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(inmm);
            }
        });
        //publicPlaces button, it takes users to PublicPlacesActivity activity that displays list of publicPlaces
        publicPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent publicPlaces = new Intent(MainActivity.this, PublicPlacesActivity.class);
                startActivity(publicPlaces);
            }
        });
        //tourism button, it takes users to TourismActivity activity that displays list of tourism
        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tourisom = new Intent(MainActivity.this, TourismActivity.class);
                startActivity(tourisom);
            }
        });
    }
}
