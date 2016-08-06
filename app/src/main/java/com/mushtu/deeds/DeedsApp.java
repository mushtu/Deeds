package com.mushtu.deeds;

import android.app.Application;

import com.mushtu.deeds.data.dao.DaoMaster;
import com.mushtu.deeds.data.dao.DaoSession;
import org.greenrobot.greendao.database.Database;
import com.mushtu.deeds.data.dao.DaoMaster.DevOpenHelper;
import com.mushtu.deeds.data.model.Sin;

/**
 * Created by mushtu on 8/6/16.
 */
public class DeedsApp extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DevOpenHelper helper = new DevOpenHelper(this,"deeds-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public void initializeDb()
    {
        // add sins

    }

    public boolean isApplicationInitialized()
    {
        //TODO
        return true;
    }
}
