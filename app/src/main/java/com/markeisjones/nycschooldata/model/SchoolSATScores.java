package com.markeisjones.nycschooldata.model;


public class SchoolSATScores {
    private String dbn ;
    private int num_of_sat_test_takers;
    private int sat_critical_reading_avg_score ;
    private int sat_math_avg_score;
    private int sat_writing_avg_score;
    private String school_name;


    public SchoolSATScores() {
    }

    public SchoolSATScores(String dbn, int num_of_sat_test_takers, int sat_critical_reading_avg_score, int sat_math_avg_score, int sat_writing_avg_score, String school_name) {
        this.dbn = dbn;
        this.num_of_sat_test_takers = num_of_sat_test_takers;
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
        this.sat_math_avg_score = sat_math_avg_score;
        this.sat_writing_avg_score = sat_writing_avg_score;
        this.school_name = school_name;
    }

    public String getDbn() {
        return dbn;
    }

    public int getNum_of_sat_test_takers() {
        return num_of_sat_test_takers;
    }

    public int getSat_critical_reading_avg_score() {
        return sat_critical_reading_avg_score;
    }

    public int getSat_math_avg_score() {
        return sat_math_avg_score;
    }

    public int getSat_writing_avg_score() {
        return sat_writing_avg_score;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public void setNum_of_sat_test_takers(int num_of_sat_test_takers) {
        this.num_of_sat_test_takers = num_of_sat_test_takers;
    }

    public void setSat_critical_reading_avg_score(int sat_critical_reading_avg_score) {
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
    }

    public void setSat_math_avg_score(int sat_math_avg_score) {
        this.sat_math_avg_score = sat_math_avg_score;
    }

    public void setSat_writing_avg_score(int sat_writing_avg_score) {
        this.sat_writing_avg_score = sat_writing_avg_score;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
