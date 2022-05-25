package com.example.todotasks;

import android.content.Context;

import androidx.room.Room;

public class DatabaseClient {
    private Context mCtx;
    private static DatabaseClient Instance;
    private AppDatabase appDatabase ;

    private DatabaseClient(Context mCtx) {
        this.mCtx = mCtx;

        appDatabase = Room.databaseBuilder(mCtx, AppDatabase.class,"Tasks").build();
    }
    public static synchronized  DatabaseClient getInstance(Context mCtx){
        if (Instance == null){
            Instance = new DatabaseClient(mCtx);
        }
        return Instance;
    }

    public AppDatabase getAppDatabase(){
        return appDatabase;
    }
}
