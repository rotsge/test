package com.example.test.zuhe;

public abstract class OrganizationComponent {

    private String name;
    private String desc;
    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public OrganizationComponent() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected abstract void print();
}
