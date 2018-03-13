package annotation.com.tour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by java- on 5/26/2017.
 */

public class TourismActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<City> locations = new ArrayList<City>();
        //adds Tourism info to the arraylist
        locations.add(new City(getString(R.string.park), getString(R.string.interest), R.drawable.t1));
        locations.add(new City(getString(R.string.national), getString(R.string.fun), R.drawable.t2));
        locations.add(new City(getString(R.string.hanifa), getString(R.string.riyadh), R.drawable.t4));

        CityAdapter cityAdapter = new CityAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cityAdapter);
    }
}
