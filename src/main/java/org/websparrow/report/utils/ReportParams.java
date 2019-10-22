package org.websparrow.report.utils;

import org.springframework.context.annotation.Description;

@Description(value = "Funcionario")
public final class ReportParams {

    public static final String PARAM_EMPNO                  = "EMPNO";
    public static final String PARAM_EMPNAME                = "EMPNAME";
    public static final String PARAM_JOB                    = "JOB";
    public static final String PARAM_HIREDATE               = "HIREDATE";
    public static final String PARAM_SAL                    = "SALARY";
    public static final String PARAM_MANAGER                = "MANAGER";
    public static final String PARAM_COMM                   = "COMISSION";
    public static final String PARAM_DEPT_NR                = "DEPTNO";

    public static final String PARAM_CUSTOM_DATA_SOURCE = "CUSTOM_SOURCE_DATA";


    /**
     * Private constructor - can not be instantiated.
     */
    private ReportParams() { }
}
