package model;

public class Address {
    String type;
    String addLine;
    String city;
    String state;

    public Address(String type, String addLine, String city, String state) {
        this.type = type;
        this.addLine = addLine;
        this.city = city;
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddLine() {
        return addLine;
    }

    public void setAddLine(String addLine) {
        this.addLine = addLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
