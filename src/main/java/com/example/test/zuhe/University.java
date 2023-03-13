package com.example.test.zuhe;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    List<OrganizationComponent> collegeList = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    public University() {
    }

    @Override
    protected void print() {
        System.out.println("--------"+getName()+"------------");
        for (OrganizationComponent organizationComponent : collegeList) {
            organizationComponent.print();
        }
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        collegeList.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        collegeList.remove(organizationComponent);
    }
}
