package com.example.test.zuhe;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> lists = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    public College() {
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        lists.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        lists.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("-----"+getName()+"--------");
        for (OrganizationComponent organizationComponent : lists) {
            organizationComponent.print();
        }
    }
}
