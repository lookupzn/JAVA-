package com.ningpr.service;

/*业务层：定义一个House[]保存House对象
1.响应HouseView的调用
2.完成对房屋信息的增（create）删（delete）改（update）查（read）
 */

import com.ningpr.model.House;

public class HouseService {

    //1.展示房屋列表信息（数组实现）
    //定义一个House[]保存House对象
    //各司其职
    private House[] houses;

    public HouseService(int size){
        //new houses
        houses = new House[size];//当创建HouseService对象时，指定数组大小
        //为了配合测试列表信息
        houses[0] = new House(1,"Wang","137","30 ZhongShan Rd",1400.0,"No");
    }

    public House[] list()
    {
    return houses;
    }



}
