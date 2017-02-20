package juan.com.clase3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Diseño multimedial on 20/02/2017.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_FILENAME = "dbFile.db";
    private static final int CURRENT_VERSION = 1;
    private static final String CREATE_USER_TABLE_SQL = " ";
    public DbHelper(Context context) {
        super(context, DATABASE_FILENAME, null, CURRENT_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
