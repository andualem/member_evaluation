package org.mk.evaluation.entity;

public enum MemberRole {

    LEADER(1),
    MEMBER(2),
    SUPERVISOR(3);

    private int id;
    MemberRole(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
