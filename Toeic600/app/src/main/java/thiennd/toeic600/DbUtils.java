package thiennd.toeic600;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

import thiennd.toeic600.models.TopicModel;

public class DbUtils extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "toeic_600.db";
    private static final int DATABASE_VERSION = 1;

    final public static String TABLE_TOPIC = "tbl_topic";
    final public static String TABLE_WORD = "tbl_word";

    public static final String TAG = "SQL";

    SQLiteDatabase sqLiteDatabase;
    private static DbUtils dbUtils;

    public DbUtils(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static DbUtils getInstance(Context context) {
        if (dbUtils == null) dbUtils = new DbUtils(context);
        return dbUtils;
    }

    public List<TopicModel> getListTopic() {
        ArrayList<TopicModel> listTopic = new ArrayList<>();
        sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_TOPIC, null);
        cursor.moveToFirst();
        String[] names = cursor.getColumnNames();
        for (String name : names) {
            Log.d(TAG, "getListTopic: " + name);
        }
        while (!cursor.isAfterLast()) {
            TopicModel topicModel = new TopicModel(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6)
            );
            Log.d(TAG, "getListTopic: "+topicModel.toString());
            listTopic.add(topicModel);
            cursor.moveToNext();
        }
        return listTopic;
    }

}
