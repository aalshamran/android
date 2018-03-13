package annotation.com.inventoryapp;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import annotation.com.inventoryapp.data.ProductsContract;

/**
 * Created by java- on 5/19/2017.
 */

public class ProductCursorAdapter extends CursorAdapter {

    public ProductCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }
    private Button buy;
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.row_list, parent, false);
    }

    @Override
    public void bindView(View view, final Context context, Cursor cursor) {
        // Find individual views that we want to modify in the list item layout
        TextView nameTextView = (TextView) view.findViewById(R.id.product);
        TextView priTextView = (TextView) view.findViewById(R.id.price);
        TextView quanTextView = (TextView) view.findViewById(R.id.quantity);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        final int id = cursor.getInt(cursor.getColumnIndex(ProductsContract.ProductEntry._ID));
        String name = cursor.getString(cursor.getColumnIndex(ProductsContract.ProductEntry.COLUMN_PRODUCT_NAME));
        final int quantity = cursor.getInt(cursor.getColumnIndex(ProductsContract.ProductEntry.COLUMN_QUANTITY));
        String price = cursor.getString(cursor.getColumnIndex(ProductsContract.ProductEntry.COLUMN_PRICE));
        image.setImageURI(Uri.parse(cursor.getString(cursor.getColumnIndex(ProductsContract.ProductEntry.COLUMN_IMAGE))));

        nameTextView.setText(name);
        priTextView.setText(price);
        quanTextView.setText(String.valueOf(quantity));

        buy = (Button) view.findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = ContentUris.withAppendedId(ProductsContract.ProductEntry.CONTENT_URI, id);
                buyProduct (context, uri, quantity-1);
            }
        });

    }

    //buy a product
    private int buyProduct(Context context, Uri uri, int buyItem){

        if(buyItem < 0){
            return 0;
        }

        int result;

        ContentValues values = new ContentValues();
        values.put(ProductsContract.ProductEntry.COLUMN_QUANTITY, buyItem);
        result = context.getContentResolver().update(uri, values, null, null);

        return result;
    }
}
