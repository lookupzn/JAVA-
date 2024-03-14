package rentSys.houseData;

public class House {
    //房屋信息（包括：姓名，电话，地址，租金，状态）
    public int indexHouse;
    public String name;
    public String telNum;
    public String addressInfo;
    public double rentPrice;
    public boolean statusRental;

    public House(int indexHouse, String name, String telNum, String addressInfo, double rentPrice, boolean statusRental) {
        this.indexHouse = indexHouse;
        this.name = name;
        this.telNum = telNum;
        this.addressInfo = addressInfo;
        this.rentPrice = rentPrice;
        this.statusRental = statusRental;
    }

    public String info() {
        return "房产标号： \t" + indexHouse + "\t联系人： \t" + name + " \t电话：\t " + telNum + "\t地址： \t" + addressInfo + "\t租金： \t" +
                rentPrice + "\t租赁状态： \t" + statusRental;
    }

}
