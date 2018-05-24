package com.example.marcelomonier.iisemanademeioambiente;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marcelomonier on 15/05/18.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Ifmacapf.db";
    public static final String TABLE_NAME = "discentes_table";

    public static final String COL_1 = "MATRICULA";
    public static final String COL_2 = "NOME";
    public static final String COL_3 = "PASSWORD";
    public static final String COL_4 = "OCUPACAO";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME +
                " (MATRICULA INTEGER PRIMARY KEY, NOME TEXT, PASSWORD TEXT, OCUPACAO TEXT)");

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    public boolean insertData(String matricula, String nome, String password, String ocupacao) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, matricula);
        contentValues.put(COL_2, nome);
        contentValues.put(COL_3, password);
        contentValues.put(COL_4, ocupacao);
        long result = db.insert(TABLE_NAME, null, contentValues);
        db.close();



        if (result == -1){
            return false;
        } else {
            return true;
        }





    }

    public boolean updateData(String matricula, String nome, String password, String ocupacao){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, nome);
        contentValues.put(COL_3, password);
        contentValues.put(COL_4, ocupacao);

        int result = db.update(TABLE_NAME, contentValues, "ID =? ", new String[]{matricula});

        //long result = db.update(TABLE_NAME, contentValues, "ID=?", new String[]{id});



        if (result > 0){
            return  true;
        } else {
            return false;
        }


    }

    public Integer deleteData(String matricula){

        SQLiteDatabase db = this.getWritableDatabase();
        int i = db.delete(TABLE_NAME, "MATRICULA=?", new String[]{matricula});


        return i;
    }






    public Cursor getMatricula() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select MATRICULA from " + TABLE_NAME, null);
        return res;
    }

    public Cursor getPassword() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select PASSWORD from " + TABLE_NAME, null);
        return res;
    }

    public Cursor getAllData() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from " + TABLE_NAME, null);

        return res;

    }

}
