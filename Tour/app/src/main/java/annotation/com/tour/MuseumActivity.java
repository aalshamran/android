package annotation.com.tour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by java- on 5/26/2017.
 */

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<City> locations = new ArrayList<City>();
        //adds Museum info to the arraylist
        locations.add(new City(getString(R.string.national_museumActivity), getString(R.string.hotspot), R.drawable.m1));
        locations.add(new City(getString(R.string.museumActivity), getString(R.string.currencies), R.drawable.m2));
        locations.add(new City(getString(R.string.masmak), getString(R.string.prominent), R.drawable.m3));
        locations.add(new City(getString(R.string.jazeera), getString(R.string.affiliated), R.drawable.m3));

        CityAdapter cityAdapter = new CityAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cityAdapter);
    }
}
