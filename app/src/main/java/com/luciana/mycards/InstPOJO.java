package com.luciana.mycards;

public class InstPOJO {

    String inst_title;
    String inst_text;
    int inst_image;

    public InstPOJO(String title, String text, int image){
        this.inst_title = title;
        this.inst_text = text;
        this.inst_image = image;
    }

    public String getInst_title() {
        return inst_title;
    }

    public void setInst_title(String inst_title) {
        this.inst_title = inst_title;
    }

    public String getInst_text() {
        return inst_text;
    }

    public void setInst_text(String inst_text) {
        this.inst_text = inst_text;
    }

    public int getInst_image() {
        return inst_image;
    }

    public void setInst_image(int inst_image) {
        this.inst_image = inst_image;
    }
}
