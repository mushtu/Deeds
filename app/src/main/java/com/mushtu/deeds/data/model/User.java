package com.mushtu.deeds.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;
import com.mushtu.deeds.data.dao.DaoSession;
import com.mushtu.deeds.data.dao.UserDao;
import com.mushtu.deeds.data.dao.UserSinDao;
import com.mushtu.deeds.data.dao.UserOblationDao;

/**
 * Created by mushtu on 8/6/16.
 */
@Entity
public class User {

    @Id
    private Long id;
    @ToMany(referencedJoinProperty = "userId")
    private List<UserSin> sins;
    @ToMany(referencedJoinProperty = "userId")
    private List<UserOblation> oblations;
    /** Used for active entity operations. */
    @Generated(hash = 1507654846)
    private transient UserDao myDao;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 172520028)
    public synchronized void resetOblations() {
        oblations = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 534177376)
    public List<UserOblation> getOblations() {
        if (oblations == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserOblationDao targetDao = daoSession.getUserOblationDao();
            List<UserOblation> oblationsNew = targetDao._queryUser_Oblations(id);
            synchronized (this) {
                if(oblations == null) {
                    oblations = oblationsNew;
                }
            }
        }
        return oblations;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 287597010)
    public synchronized void resetSins() {
        sins = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1973539409)
    public List<UserSin> getSins() {
        if (sins == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserSinDao targetDao = daoSession.getUserSinDao();
            List<UserSin> sinsNew = targetDao._queryUser_Sins(id);
            synchronized (this) {
                if(sins == null) {
                    sins = sinsNew;
                }
            }
        }
        return sins;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2059241980)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }

    @Generated(hash = 1248599927)
    public User(Long id) {
        this.id = id;
    }

    @Generated(hash = 586692638)
    public User() {
    }

}
