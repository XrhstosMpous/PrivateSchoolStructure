/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.models;

import java.util.Date;

/**
 *
 * @author PSO
 */
public class Assignment {

    //Member Variables of this class
    private int assId;
    private String title;
    private String description;
    private Date subDateTime;
    private int oralMark;
    private int totalMark;

    //Parameterized Constructor of this class
    public Assignment(int assId, String title, String description, Date subDateTime, int oralMark, int totalMark) {
        this.assId = assId;
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    //Getters and Setters of this class
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getAssId() {
        return assId;
    }

    public void setAssId(int assId) {
        this.assId = assId;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment{");
        sb.append("assId=").append(assId);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", subDateTime=").append(subDateTime);
        sb.append(", oralMark=").append(oralMark);
        sb.append(", totalMark=").append(totalMark);
        sb.append('}');
        return sb.toString();
    }

}
