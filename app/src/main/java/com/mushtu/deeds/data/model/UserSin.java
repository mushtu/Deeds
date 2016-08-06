package com.mushtu.deeds.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import com.mushtu.deeds.data.dao.DaoSession;
import com.mushtu.deeds.data.dao.UserSinDao;
import com.mushtu.deeds.data.dao.UserDao;
import com.mushtu.deeds.data.dao.SinDao;

/**
 * Created by mushtu on 8/6/16.
 */
@Entity
public class UserSin {

    @Id(autoincrement = true)
    private Long id;
    private Long userId;
    private Long sinId;
    @ToOne(joinProperty = "userId")
    private User user;
    @ToOne(joinProperty = "sinId")
    private Sin sin;
    private double weight;
    private Long time;
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1087340721)
    public void setSin(Sin sin) {
        synchronized (this) {
            this.sin = sin;
            sinId = sin == null ? null : sin.getId();
            sin__resolvedKey = sinId;
        }
    }
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 930266192)
    public Sin getSin() {
        Long __key = this.sinId;
        if (sin__resolvedKey == null || !sin__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SinDao targetDao = daoSession.getSinDao();
            Sin sinNew = targetDao.load(__key);
            synchronized (this) {
                sin = sinNew;
                sin__resolvedKey = __key;
            }
        }
        return sin;
    }
    @Generated(hash = 1757938654)
    private transient Long sin__resolvedKey;
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1065606912)
    public void setUser(User user) {
        synchronized (this) {
            this.user = user;
            userId = user == null ? null : user.getId();
            user__resolvedKey = userId;
        }
    }
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 859885876)
    public User getUser() {
        Long __key = this.userId;
        if (user__resolvedKey == null || !user__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserDao targetDao = daoSession.getUserDao();
            User userNew = targetDao.load(__key);
            synchronized (this) {
                user = userNew;
                user__resolvedKey = __key;
            }
        }
        return user;
    }
    @Generated(hash = 251390918)
    private transient Long user__resolvedKey;
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 101565408)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserSinDao() : null;
    }
    /** Used for active entity operations. */
    @Generated(hash = 1355990545)
    private transient UserSinDao myDao;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    public Long getTime() {
        return this.time;
    }
    public void setTime(Long time) {
        this.time = time;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Long getSinId() {
        return this.sinId;
    }
    public void setSinId(Long sinId) {
        this.sinId = sinId;
    }
    public Long getUserId() {
        return this.userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1801555200)
    public UserSin(Long id, Long userId, Long sinId, double weight, Long time) {
        this.id = id;
        this.userId = userId;
        this.sinId = sinId;
        this.weight = weight;
        this.time = time;
    }
    @Generated(hash = 1459901026)
    public UserSin() {
    }
}
