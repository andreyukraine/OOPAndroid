package com.example.bx.shop.dbconnect;


import android.content.Context;
import android.util.Log;
import com.example.core.dbase.DBConnect;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SQLite extends DBConnect {

    private static final String DB_NAME = "sd.db";

    private static final String DRIVER_CLASS = "org.sqldroid.SQLDroidDriver";
    private static String dbFolder;
    private static String dbPath;

    public static void initConnection(Context context){
        checkDbExist(context);
        DBConnect.load(DRIVER_CLASS, "jdbc:sqldroid:" + dbPath);
    }

    private static void checkDbExist(Context context) {

        dbFolder = context.getApplicationInfo().dataDir + "/"; // + "databases/";

        dbPath = dbFolder + DB_NAME;

        if (!checkDataBaseExists()) {
            copyDataBase(context);
            System.out.println("Coppy base");
        }
    }


    private static void copyDataBase(Context context){
        try {
            InputStream myInput = context.getAssets().open("database/" + DB_NAME);

            OutputStream myOutput = new FileOutputStream(dbPath);

            File databaseFolder = new File(dbFolder);
            databaseFolder.mkdir();

            byte[] buffer = new byte[1024];
            int length;
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }



        } catch (Exception e) {
            Log.e("СopyDatabase", e.getMessage());
        }
    }

    private static boolean checkDataBaseExists() {
        File dbFile = new File(dbPath);
        return dbFile.exists();
    }

}
