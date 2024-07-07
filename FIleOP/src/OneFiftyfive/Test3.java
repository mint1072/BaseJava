package OneFiftyfive;

public class Test3 {
    static int extraBottleNumber;
    static int extraCoverNumber;
    static int totalNumber;
    public static void main(String[] args) {
        //啤酒问题 啤酒2元一瓶 4个盖子可以换一瓶 2个空瓶可以换一瓶 请问10元可以喝多少
        buy(10);
        System.out.println("还剩瓶子:" + extraBottleNumber);
        System.out.println("还剩盖子:" + extraCoverNumber);
        System.out.println("喝了：" + totalNumber);

    }

    public static void buy(int money){
        int number = money / 2;
        totalNumber += number;
        int allMoney = 0;
        int allBottleNumber = number + extraBottleNumber;
        int allCoverNumber = number + extraCoverNumber;
        if (allBottleNumber >= 2){
            allMoney += (allBottleNumber / 2) * 2;
        }
        extraBottleNumber = allBottleNumber % 2;
        if (allCoverNumber >= 4){
            allMoney += (allCoverNumber / 4) * 2;
        }
        extraCoverNumber = allCoverNumber % 4;
        if (allMoney >= 2)
            buy(allMoney);

    }
}
