package com.android_threefishes.threefish.a3fish.DB;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ARTICLE".
*/
public class ArticleDao extends AbstractDao<Article, Void> {

    public static final String TABLENAME = "ARTICLE";

    /**
     * Properties of entity Article.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", false, "ID");
        public final static Property UsrImg = new Property(1, byte[].class, "usrImg", false, "USR_IMG");
        public final static Property UsrName = new Property(2, String.class, "usrName", false, "USR_NAME");
        public final static Property ImageBig = new Property(3, byte[].class, "imageBig", false, "IMAGE_BIG");
        public final static Property ImageSmall = new Property(4, byte[].class, "imageSmall", false, "IMAGE_SMALL");
        public final static Property SoundsPath = new Property(5, String.class, "soundsPath", false, "SOUNDS_PATH");
        public final static Property Context = new Property(6, String.class, "context", false, "CONTEXT");
        public final static Property Frags = new Property(7, String.class, "frags", false, "FRAGS");
        public final static Property Comments = new Property(8, String.class, "comments", false, "COMMENTS");
        public final static Property AgreeNum = new Property(9, int.class, "agreeNum", false, "AGREE_NUM");
        public final static Property ContextColor = new Property(10, String.class, "contextColor", false, "CONTEXT_COLOR");
    }


    public ArticleDao(DaoConfig config) {
        super(config);
    }
    
    public ArticleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ARTICLE\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"USR_IMG\" BLOB," + // 1: usrImg
                "\"USR_NAME\" TEXT," + // 2: usrName
                "\"IMAGE_BIG\" BLOB," + // 3: imageBig
                "\"IMAGE_SMALL\" BLOB," + // 4: imageSmall
                "\"SOUNDS_PATH\" TEXT," + // 5: soundsPath
                "\"CONTEXT\" TEXT," + // 6: context
                "\"FRAGS\" TEXT," + // 7: frags
                "\"COMMENTS\" TEXT," + // 8: comments
                "\"AGREE_NUM\" INTEGER NOT NULL ," + // 9: agreeNum
                "\"CONTEXT_COLOR\" TEXT);"); // 10: contextColor
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ARTICLE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Article entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        byte[] usrImg = entity.getUsrImg();
        if (usrImg != null) {
            stmt.bindBlob(2, usrImg);
        }
 
        String usrName = entity.getUsrName();
        if (usrName != null) {
            stmt.bindString(3, usrName);
        }
 
        byte[] imageBig = entity.getImageBig();
        if (imageBig != null) {
            stmt.bindBlob(4, imageBig);
        }
 
        byte[] imageSmall = entity.getImageSmall();
        if (imageSmall != null) {
            stmt.bindBlob(5, imageSmall);
        }
 
        String soundsPath = entity.getSoundsPath();
        if (soundsPath != null) {
            stmt.bindString(6, soundsPath);
        }
 
        String context = entity.getContext();
        if (context != null) {
            stmt.bindString(7, context);
        }
 
        String frags = entity.getFrags();
        if (frags != null) {
            stmt.bindString(8, frags);
        }
 
        String comments = entity.getComments();
        if (comments != null) {
            stmt.bindString(9, comments);
        }
        stmt.bindLong(10, entity.getAgreeNum());
 
        String contextColor = entity.getContextColor();
        if (contextColor != null) {
            stmt.bindString(11, contextColor);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Article entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        byte[] usrImg = entity.getUsrImg();
        if (usrImg != null) {
            stmt.bindBlob(2, usrImg);
        }
 
        String usrName = entity.getUsrName();
        if (usrName != null) {
            stmt.bindString(3, usrName);
        }
 
        byte[] imageBig = entity.getImageBig();
        if (imageBig != null) {
            stmt.bindBlob(4, imageBig);
        }
 
        byte[] imageSmall = entity.getImageSmall();
        if (imageSmall != null) {
            stmt.bindBlob(5, imageSmall);
        }
 
        String soundsPath = entity.getSoundsPath();
        if (soundsPath != null) {
            stmt.bindString(6, soundsPath);
        }
 
        String context = entity.getContext();
        if (context != null) {
            stmt.bindString(7, context);
        }
 
        String frags = entity.getFrags();
        if (frags != null) {
            stmt.bindString(8, frags);
        }
 
        String comments = entity.getComments();
        if (comments != null) {
            stmt.bindString(9, comments);
        }
        stmt.bindLong(10, entity.getAgreeNum());
 
        String contextColor = entity.getContextColor();
        if (contextColor != null) {
            stmt.bindString(11, contextColor);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public Article readEntity(Cursor cursor, int offset) {
        Article entity = new Article( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1), // usrImg
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // usrName
            cursor.isNull(offset + 3) ? null : cursor.getBlob(offset + 3), // imageBig
            cursor.isNull(offset + 4) ? null : cursor.getBlob(offset + 4), // imageSmall
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // soundsPath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // context
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // frags
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // comments
            cursor.getInt(offset + 9), // agreeNum
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // contextColor
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Article entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setUsrImg(cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1));
        entity.setUsrName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImageBig(cursor.isNull(offset + 3) ? null : cursor.getBlob(offset + 3));
        entity.setImageSmall(cursor.isNull(offset + 4) ? null : cursor.getBlob(offset + 4));
        entity.setSoundsPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContext(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFrags(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setComments(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAgreeNum(cursor.getInt(offset + 9));
        entity.setContextColor(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(Article entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(Article entity) {
        return null;
    }

    @Override
    public boolean hasKey(Article entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
