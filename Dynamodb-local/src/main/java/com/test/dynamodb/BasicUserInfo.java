package com.test.dynamodb;

public class BasicUserInfo {
    private  String firstName;
    private  String lastName;
    private  String contactNumber;

    public BasicUserInfo(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastNae() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "BasicUserInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
