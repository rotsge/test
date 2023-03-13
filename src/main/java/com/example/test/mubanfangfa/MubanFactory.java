package com.example.test.mubanfangfa;

public abstract class MubanFactory {

    public void make(){
        select();
        if (jiaPeiLiao()){
            peiLiao();
        }
        jinPao();
        douJiangJi();
    }

    public void select(){
        System.out.println("选择黄豆");
    }

    public abstract void peiLiao();

    public void jinPao(){
        System.out.println("浸泡材料和配料");
    }

    public void douJiangJi(){
        System.out.println("将材料放入豆浆机制作");
    }
    //钩子函数，控制步骤
    boolean jiaPeiLiao(){
        return true;
    }
}
