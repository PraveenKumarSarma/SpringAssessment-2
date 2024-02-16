package com.praveen;

public class MobileService {

    private int modelNo;
    private String companyName;
    private double price;


    public MobileService() {
    }

    public MobileService(int modelNo, String companyName, double price) {
        this.modelNo = modelNo;
        this.companyName = companyName;
        this.price = price;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobileService{" +
                "modelNo=" + modelNo +
                ", companyName='" + companyName + '\'' +
                ", price=" + price +
                '}';
    }
}
