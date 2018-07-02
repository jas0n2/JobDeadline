package com.example.jason.jobdeadline;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class DabaseHelper extends SQLiteOpenHelper {
    private static final String DBNAME ="stock";
    private static String TABLENAME ="stocks";
    private static String COL1 ="id";
    private static String COL2 ="name";
    private static String COL3 ="sync_statr";

    public DabaseHelper(Context context) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "+TABLENAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT,"+COL2+" TEXT,"+COL3+" TEXT)");

    }

    public Cursor getData(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cursor =  sqLiteDatabase.rawQuery("Select * from "+TABLENAME,null);
            return  cursor;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insertData(String name,String status){
        ContentValues values = new ContentValues();
        values.put(COL2,name);
        values.put(COL3,status);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Long insert  = sqLiteDatabase.insert(TABLENAME,null,values);
        if(insert != -1) {

            return true;
        }else
            return false;

    }
}
