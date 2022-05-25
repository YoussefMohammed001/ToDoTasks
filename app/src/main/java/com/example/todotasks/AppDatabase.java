package com.example.todotasks;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Task.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}