package annotation.com.tour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by java- on 5/26/2017.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<City> locations = new ArrayList<City>();
        //adds restaurants info to the arraylist
        locations.add(new City(getString(R.string.asmak_resturant), getString(R.string.asmak), R.drawable.a1));
        locations.add(new City(getString(R.string.lusin), getString(R.string.food), R.drawable.a2));
        locations.add(new City(getString(R.string.kudu), getString(R.string.concept), R.drawable.a3));
        locations.add(new City(getString(R.string.mooyah), getString(R.string.sandwiches), R.drawable.a4));
        locations.add(new City(getString(R.string.shayah), getString(R.string.arabian), R.drawable.a5));
        locations.add(new City(getString(R.string.faisaliah), getString(R.string.serves), R.drawable.a6));

        CityAdapter cityAdapter = new CityAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cityAdapter);
    }
}
