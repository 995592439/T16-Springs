package test;

public class Spring {
    //等会使用spring依赖注入值
    private  String who;
    private String text;
    public void print(){
        System.out.println(who+"说："+text);
    }
     /*封装*/

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

