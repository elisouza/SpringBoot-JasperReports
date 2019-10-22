package org.websparrow.report.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Cabecalho {

    @Id
    @Column(name = "empno")
    private Long empNo;
    @Column(name = "job")
    private String job;
}
