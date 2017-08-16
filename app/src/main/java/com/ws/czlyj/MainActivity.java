package com.ws.czlyj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final List<Bean> list = getList();
        recyclerView.setAdapter(new MainAdapter(list));
        recyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void SimpleOnItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                startActivity(new Intent(MainActivity.this,WebViewActivity.class).putExtra("url",list.get(i).path));
            }
        });
    }

    public class MainAdapter extends BaseQuickAdapter<Bean> {

        public MainAdapter(List<Bean> data) {
            super(android.R.layout.simple_list_item_1, data);
        }

        @Override
        protected void convert(BaseViewHolder baseViewHolder, Bean bean) {
            baseViewHolder.setText(android.R.id.text1, bean.title);
        }
    }

    private class Bean {
        public String path;
        public String title;

        public Bean(String path, String title) {
            this.path = path;
            this.title = title;
        }
    }

    private List<Bean> getList() {
        List<Bean> list = new ArrayList<>();
        list.add(new Bean("http://www.runoob.com/python3/python3-basic-syntax.html", "Python3 基础语法"));
        list.add(new Bean("http://www.runoob.com/python3/python3-data-type.html", "Python3 基本数据类型"));
        list.add(new Bean("http://www.runoob.com/python3/python3-interpreter.html", "Python3 解释器"));
        list.add(new Bean("http://www.runoob.com/python3/python3-basic-operators.html", "Python3 运算符"));
        list.add(new Bean("http://www.runoob.com/python3/python3-number.html", "Python3 数字(Number)"));
        list.add(new Bean("http://www.runoob.com/python3/python3-string.html", "Python3 字符串"));
        list.add(new Bean("http://www.runoob.com/python3/python3-list.html", "Python3 列表"));
        list.add(new Bean("http://www.runoob.com/python3/python3-tuple.html", "Python3 元组"));
        list.add(new Bean("http://www.runoob.com/python3/python3-dictionary.html", "Python3 字典"));
        list.add(new Bean("http://www.runoob.com/python3/python3-step1.html", "Python3 编程第一步"));
        list.add(new Bean("http://www.runoob.com/python3/python3-conditional-statements.html", "Python3 条件控制"));
        list.add(new Bean("http://www.runoob.com/python3/python3-loop.html", "Python3 循环语句"));
        list.add(new Bean("http://www.runoob.com/python3/python3-iterator-generator.html", "Python3 迭代器与生成器"));
        list.add(new Bean("http://www.runoob.com/python3/python3-function.html", "Python3 函数"));
        list.add(new Bean("http://www.runoob.com/python3/python3-data-structure.html", "Python3 数据结构"));
        list.add(new Bean("http://www.runoob.com/python3/python3-module.html", "Python3 模块"));
        list.add(new Bean("http://www.runoob.com/python3/python3-inputoutput.html", "Python3 输入和输出"));
        list.add(new Bean("http://www.runoob.com/python3/python3-file-methods.html", "Python3 File(文件) 方法"));
        list.add(new Bean("http://www.runoob.com/python3/python3-os-file-methods.html", "Python3 OS 文件/目录方法"));
        list.add(new Bean("http://www.runoob.com/python3/python3-errors-execptions.html", "Python3 错误和异常"));
        list.add(new Bean("http://www.runoob.com/python3/python3-class.html", "Python3 面向对象"));
        list.add(new Bean("http://www.runoob.com/python3/python3-stdlib.html", "Python3 标准库概览"));
        list.add(new Bean("http://www.runoob.com/python3/python3-examples.html", "Python3 实例"));
        list.add(new Bean("http://www.runoob.com/python3/python3-reg-expressions.html", "Python3 正则表达式"));
        list.add(new Bean("http://www.runoob.com/python3/python3-cgi-programming.html", "Python CGI编程"));
        list.add(new Bean("http://www.runoob.com/python3/python3-mysql.html", "Python3 MySQL 数据库连接"));
        list.add(new Bean("http://www.runoob.com/python3/python3-socket.html", "Python3 网络编程"));
        list.add(new Bean("http://www.runoob.com/python3/python3-smtp.html", "Python3 SMTP发送邮件"));
        list.add(new Bean("http://www.runoob.com/python3/python3-multithreading.html", "Python3 多线程"));
        list.add(new Bean("http://www.runoob.com/python3/python3-xml-processing.html", "Python3 XML解析"));
        list.add(new Bean("http://www.runoob.com/python3/python3-json.html", "Python3 JSON 数据解析"));
        list.add(new Bean("http://www.runoob.com/python3/python3-date-time.html", "Python3 日期和时间"));
        return list;
    }
}
