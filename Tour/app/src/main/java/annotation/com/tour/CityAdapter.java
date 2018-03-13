package annotation.com.tour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by java- on 5/26/2017.
 */

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        City curentLocation = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(curentLocation.getmLocationName());

        TextView about = (TextView) listItemView.findViewById(R.id.about);
        about.setText(curentLocation.getmAbout());

        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.image);

        if(curentLocation.hasImage()){
            locationImage.setImageResource(curentLocation.getmImage());
            locationImage.setVisibility(View.VISIBLE);
        }else{
            locationImage.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
