package org.mk.evaluation.entity;

public enum MemberStatus {

    ACTIVE(1),
    INACTIVE(2),
    SUSPENDED(3);

    private int id;

    MemberStatus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
