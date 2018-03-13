package annotation.com.tour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by java- on 5/26/2017.
 */

public class PublicPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<City> locations = new ArrayList<City>();
        //adds PublicPlaces info to the arraylist
        locations.add(new City(getString(R.string.deerah_souk), getString(R.string.deerah_souk_about), R.drawable.p1));
        locations.add(new City(getString(R.string.sky_bridge_kingdom_center), getString(R.string.sky_bridge_kingdom_center_about), R.drawable.p2));
        locations.add(new City(getString(R.string.the_largest_integrated_farm_World), getString(R.string.the_largest_integrated_farm_World_about), R.drawable.p3));
        locations.add(new City(getString(R.string.quad_biking_red_sand_dunes), getString(R.string.quad_biking_red_sand_dunes_about), R.drawable.p4));
        locations.add(new City(getString(R.string.edge_world), getString(R.string.edge_world_about), R.drawable.p5));
        locations.add(new City(getString(R.string.walk_historical_diriyah), getString(R.string.walk_historical_diriyah_about), R.drawable.p6));

        CityAdapter adapter = new CityAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
