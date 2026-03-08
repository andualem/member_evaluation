package org.mk.evaluation.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "Departement")
public class Departement {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "main_departement_id")
    private Departement mainDepartement;

    @ManyToOne
    @JoinColumn(name = "department_head_id")
    private Member departmentHead;

    @CreatedBy
    private long createdBy;
    @LastModifiedDate
    private long lastModifiedDate;
    @LastModifiedBy
    private long lastModifiedBy;

    public Member getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(Member departmentHead) {
        this.departmentHead = departmentHead;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Departement getMainDepartement() {
        return mainDepartement;
    }

    public void setMainDepartement(Departement mainDepartement) {
        this.mainDepartement = mainDepartement;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
