package com.example.test.zuhe;

public class Test {
    public static void main(String[] args) {
        OrganizationComponent major = new Major("光电信息科学与工程", "光机电一体化");
        OrganizationComponent major1 = new Major("电子信息工程", "电子信息");
        OrganizationComponent college = new College("理学院", "理学");
        OrganizationComponent college1 = new College("电气信息学院", "电子信息");
        OrganizationComponent university = new University("北京大学", "顶尖大学");

        college.add(major);
        college.add(major1);
        college1.add(major);
        college1.add(major1);
        university.add(college);
        university.add(college1);
        university.print();
    }
}
