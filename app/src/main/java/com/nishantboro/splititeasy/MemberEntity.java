package com.nishantboro.splititeasy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MemberEntity {
    MemberEntity(String name, String gName) {
        this.name = name;
        this.gName = gName;
    }
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "GroupName")
    public String gName;

    @ColumnInfo(name = "MemberName")
    public String name;
}