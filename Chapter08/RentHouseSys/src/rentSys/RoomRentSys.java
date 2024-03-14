package rentSys;

import rentSys.*;
import rentSys.view.HouseView;

public class RoomRentSys {
    public static void main(String[] args) {
        //1.需求分析
        //实现功能：查找，新增，删除房屋
        //修改房屋信息（包括：姓名，电话，地址，租金，状态）
        //房屋列表信息
        //退出系统

        HouseView houseView = new HouseView();
        houseView.showMenu();
        houseView.makeChoice();


    }
}
