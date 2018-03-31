package jp.techacademy.youichi.satou.taskapp;

/**
 * Created by Fujino_ya on 2018/03/31.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
