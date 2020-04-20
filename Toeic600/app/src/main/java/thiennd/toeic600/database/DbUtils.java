package thiennd.toeic600.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DbUtils extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "toeic_600.db";
    private static final int DATABASE_VERSION = 1;

    final public static String TABLE_TOPIC = "tbl_topic";
    final public static String TABLE_WORD = "tbl_word";

    SQLiteDatabase sqLiteDatabase;

    public DbUtils(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
