package com.czhhhb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionChange implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //实现图书信息修改功能，监听实现gui 并且调用数据库操作
        //先输入图书的编号，如果数据库有这本书则产生更新界面，去修改数据
        //如果编号不存在，则出现界面提示不存在
    }
}
