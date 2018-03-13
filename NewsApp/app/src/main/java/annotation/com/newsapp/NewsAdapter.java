package annotation.com.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by java- on 5/5/2017.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(@NonNull Context context, @NonNull List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        News currentNews = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_list, parent, false);
        }

        TextView title = (TextView)convertView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());
        TextView category = (TextView)convertView.findViewById(R.id.category);
        category.setText(currentNews.getCategory());

        TextView publishDate = (TextView)convertView.findViewById(R.id.publishDate);
        publishDate.setText(currentNews.getPublishDate());

        return convertView;
    }

}
