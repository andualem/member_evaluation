package org.mk.evaluation.entity;

public enum EvaluationType {

    PEER_EVALUATION(1),
    SELF_EVALUATION (2),
    SUPERVISOR_EVALUATION (3),
    MANAGER_EVALUATION(4);

    private int id;

    EvaluationType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
