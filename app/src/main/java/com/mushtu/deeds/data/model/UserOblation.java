package com.mushtu.deeds.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import com.mushtu.deeds.data.dao.DaoSession;
import com.mushtu.deeds.data.dao.UserOblationDao;
import com.mushtu.deeds.data.dao.UserDao;
import com.mushtu.deeds.data.dao.OblationDao;

/**
 * Created by mushtu on 8/6/16.
 */
@Entity
public class UserOblation {

    @Id(autoincrement = true)
    private Long id;
    private Long userId;
    @ToOne(joinProperty = "userId")
    private User user;
    private Long oblationId;
    @ToOne(joinProperty = "oblationId")
    private Oblation oblation;
    private Double weight;
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
    @Generated(hash = 1112801453)
    public void setOblation(Oblation oblation) {
        synchronized (this) {
            this.oblation = oblation;
            oblationId = oblation == null ? null : oblation.getId();
            oblation__resolvedKey = oblationId;
        }
    }
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1249307052)
    public Oblation getOblation() {
        Long __key = this.oblationId;
        if (oblation__resolvedKey == null || !oblation__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OblationDao targetDao = daoSession.getOblationDao();
            Oblation oblationNew = targetDao.load(__key);
            synchronized (this) {
                oblation = oblationNew;
                oblation__resolvedKey = __key;
            }
        }
        return oblation;
    }
    @Generated(hash = 861122626)
    private transient Long oblation__resolvedKey;
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
    @Generated(hash = 709804592)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserOblationDao() : null;
    }
    /** Used for active entity operations. */
    @Generated(hash = 831209024)
    private transient UserOblationDao myDao;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    public Long getTime() {
        return this.time;
    }
    public void setTime(Long time) {
        this.time = time;
    }
    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Long getOblationId() {
        return this.oblationId;
    }
    public void setOblationId(Long oblationId) {
        this.oblationId = oblationId;
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
    @Generated(hash = 2054781452)
    public UserOblation(Long id, Long userId, Long oblationId, Double weight,
            Long time) {
        this.id = id;
        this.userId = userId;
        this.oblationId = oblationId;
        this.weight = weight;
        this.time = time;
    }
    @Generated(hash = 1558967338)
    public UserOblation() {
    }



}
