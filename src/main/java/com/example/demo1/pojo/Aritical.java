package com.example.demo1.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aritical {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String author;
    private String time;
    private String title;
    private String content;
}
