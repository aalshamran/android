package annotation.com.inventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by java- on 5/19/2017.
 */

public class ProductsDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = ProductsDbHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "store.db";
    private static final int DATABASE_VERSION = 1;

    public ProductsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PRODUCTS_TABLE =  "CREATE TABLE " + ProductsContract.ProductEntry.TABLE_NAME + " ("
                + ProductsContract.ProductEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ProductsContract.ProductEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, "
                + ProductsContract.ProductEntry.COLUMN_PRICE + " TEXT NOT NULL, "
                + ProductsContract.ProductEntry.COLUMN_QUANTITY + " INTEGER NOT NULL DEFAULT 0,"
                + ProductsContract.ProductEntry.COLUMN_IMAGE + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_PRODUCTS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
