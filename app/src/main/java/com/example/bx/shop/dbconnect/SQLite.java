package com.example.bx.shop.dbconnect;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.example.core.dbase.DBConnect;
import com.example.core.enums.ConnectionDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static android.content.ContentValues.TAG;

public class SQLite extends DBConnect {

    private static final String DB_NAME = "shop.db";

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

    }
}
