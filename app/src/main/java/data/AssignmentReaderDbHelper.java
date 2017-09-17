package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import data.AssignmentContract.AssignmentEntries;

public class AssignmentReaderDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AssignmentReader.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + AssignmentContract.AssignmentEntries.TABLE_NAME + " (" +
                    AssignmentEntries._ID + " INTEGER PRIMARY KEY," +
                    AssignmentEntries.ASSIGNMENT_TITLE + " TEXT," +
                    AssignmentEntries.START_DATE + " TEXT," +
                    AssignmentEntries.END_DATE + " TEXT," +
                    AssignmentEntries.COURSES + " TEXT," +
                    AssignmentEntries.NOTES + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + AssignmentContract.AssignmentEntries.TABLE_NAME;

    public AssignmentReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
