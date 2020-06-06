package app;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class IssuedBook {
    private SimpleIntegerProperty id;
    private SimpleStringProperty bookCallNo;
    private SimpleStringProperty studentId;
    private SimpleStringProperty studentName;
    private SimpleStringProperty studentContact;
    private SimpleStringProperty issuedDate;

    public IssuedBook(int id, String callNo, String stuId, String stuName, String stuCont, String issuedDate) {
        this.id = new SimpleIntegerProperty(id);
        this.bookCallNo = new SimpleStringProperty(callNo);
        this.studentId = new SimpleStringProperty(stuId);
        this.studentName = new SimpleStringProperty(stuName);
        this.studentContact = new SimpleStringProperty(stuCont);
        this.issuedDate = new SimpleStringProperty(issuedDate);
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getBookCallNo() {
        return bookCallNo.get();
    }

    public SimpleStringProperty bookCallNoProperty() {
        return bookCallNo;
    }

    public void setBookCallNo(String bookCallNo) {
        this.bookCallNo.set(bookCallNo);
    }

    public String getStudentId() {
        return studentId.get();
    }

    public SimpleStringProperty studentIdProperty() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId.set(studentId);
    }

    public String getStudentName() {
        return studentName.get();
    }

    public SimpleStringProperty studentNameProperty() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName.set(studentName);
    }

    public String getStudentContact() {
        return studentContact.get();
    }

    public SimpleStringProperty studentContactProperty() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact.set(studentContact);
    }

    public String getIssuedDate() {
        return issuedDate.get();
    }

    public SimpleStringProperty issuedDateProperty() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate.set(issuedDate);
    }
}
