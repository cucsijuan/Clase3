package juan.com.clase3;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHelper dbHelper = new DbHelper(this);

        SQLiteDatabase dbRead = dbHelper.getReadableDatabase();
        SQLiteDatabase dbWrite =  dbHelper.getWritableDatabase();
        
    }
}
