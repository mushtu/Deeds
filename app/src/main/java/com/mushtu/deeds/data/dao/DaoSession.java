package com.mushtu.deeds.data.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.mushtu.deeds.data.model.UserOblation;
import com.mushtu.deeds.data.model.UserSin;
import com.mushtu.deeds.data.model.Sin;
import com.mushtu.deeds.data.model.User;
import com.mushtu.deeds.data.model.Oblation;

import com.mushtu.deeds.data.dao.UserOblationDao;
import com.mushtu.deeds.data.dao.UserSinDao;
import com.mushtu.deeds.data.dao.SinDao;
import com.mushtu.deeds.data.dao.UserDao;
import com.mushtu.deeds.data.dao.OblationDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userOblationDaoConfig;
    private final DaoConfig userSinDaoConfig;
    private final DaoConfig sinDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig oblationDaoConfig;

    private final UserOblationDao userOblationDao;
    private final UserSinDao userSinDao;
    private final SinDao sinDao;
    private final UserDao userDao;
    private final OblationDao oblationDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userOblationDaoConfig = daoConfigMap.get(UserOblationDao.class).clone();
        userOblationDaoConfig.initIdentityScope(type);

        userSinDaoConfig = daoConfigMap.get(UserSinDao.class).clone();
        userSinDaoConfig.initIdentityScope(type);

        sinDaoConfig = daoConfigMap.get(SinDao.class).clone();
        sinDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        oblationDaoConfig = daoConfigMap.get(OblationDao.class).clone();
        oblationDaoConfig.initIdentityScope(type);

        userOblationDao = new UserOblationDao(userOblationDaoConfig, this);
        userSinDao = new UserSinDao(userSinDaoConfig, this);
        sinDao = new SinDao(sinDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        oblationDao = new OblationDao(oblationDaoConfig, this);

        registerDao(UserOblation.class, userOblationDao);
        registerDao(UserSin.class, userSinDao);
        registerDao(Sin.class, sinDao);
        registerDao(User.class, userDao);
        registerDao(Oblation.class, oblationDao);
    }
    
    public void clear() {
        userOblationDaoConfig.getIdentityScope().clear();
        userSinDaoConfig.getIdentityScope().clear();
        sinDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        oblationDaoConfig.getIdentityScope().clear();
    }

    public UserOblationDao getUserOblationDao() {
        return userOblationDao;
    }

    public UserSinDao getUserSinDao() {
        return userSinDao;
    }

    public SinDao getSinDao() {
        return sinDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public OblationDao getOblationDao() {
        return oblationDao;
    }

}
