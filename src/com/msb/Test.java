package com.msb;

import java.util.Arrays;
import java.util.Date;
//import java.util.*;

public class Test {

    public static void main(String[] args){
//        String details = "";
//        int balance = 0;
//       while (true) {
//           System.out.println("----------欢迎使用系统------------");
//           System.out.println("1.收支明细");
//           System.out.println("2.登记收入");
//           System.out.println("3.登记支出");
//           System.out.println("4.退    出");
//           System.out.println("请输入你要选择的功能：");
//           Scanner sc = new Scanner(System.in);
//           int input = sc.nextInt();
//
//           while (input!=1&&input!=2&&input!=3&&input!=4) {
//               System.out.println("对不起，没有你要选择的功能,请重新录入：");
//               int newInput = sc.nextInt();
//               input = newInput;
//           }
//
//           if (input == 1) {
//               System.out.println("记账系统》》》收支明细");
//               if (details != "") {
//                   System.out.println(details.substring(0, details.length()-1));
//               }
//           } else if (input == 2) {
//               System.out.println("记账系统》》》登记收入");
//               System.out.println("请录入收入金额：");
//               int income = sc.nextInt();
//               balance += income;
//               System.out.println("请输入收入说明：");
//               String incomeDetail = sc.next();
//               details = details + "收入：" + income + "，收入说明：" + incomeDetail + ",账户余额：" + balance + "\n";
//           } else if (input == 3) {
//               System.out.println("记账系统》》》登记支出");
//               System.out.println("请录入支出金额：");
//               int expend = sc.nextInt();
//               System.out.println("请录入支出说明：");
//               String expendDetail = sc.next();
//               balance -= expend;
//               details = details + "支出：" + expend + "，支出说明：" + expendDetail + ",账户余额：" + balance + "\n";
//           } else if (input == 4) {
//               System.out.println("记账系统》》》退出");
//               System.out.println("确定要退出吗？Y/N");
//               String isExit = sc.next();
//               switch (isExit) {
//                   case "Y":
//                       System.out.println("系统退出，欢迎您下次继续使用!");
//                       return;
//               }
//           } else {
//               System.out.println("对不起，没有你要选择的功能");
//           }
//
//       }

//        int[] arr = new int[]{40,20,35,666,36};
//        int count = arr[0];
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i] > count) {
//                count = arr[i];
//            }
//        }
//        System.out.println(count);
        /*
        //删除元素
        int[] arr = new int[]{12,34,56,7,3,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的索引下标:");
        int index = sc.nextInt();

        delArrIndex(arr, index);

        System.out.print("替换后的数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }*/
//        双色球彩票系统
//        int[] balls = new int[7];
//        int note = 0;
//        boolean isBuy = false;//默认情况下没有买彩票
//
//        while (true) {
//            System.out.println("--------欢迎进入双色球彩票系统---------");
//            System.out.println("1.购买彩票");
//            System.out.println("2.查看开奖");
//            System.out.println("3.退出");
//            System.out.println("请选择你要完成的功能:");
//            Scanner sc = new Scanner(System.in);
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("双色球系统》》购买彩票");
//                    System.out.println("请选择你要购买几注：");
//                    note = sc.nextInt();
//
//                    for (int i=0; i < balls.length; i++) {
//                        if (i!=(balls.length-1)) {
//                            System.out.println("请录入第"+(i+1)+"个红球：");
//                            int redBall = sc.nextInt();
//                            balls[i] = redBall;
//                        } else {
//                            System.out.println("请录入一个蓝色球：");
//                            int bullBall = sc.nextInt();
//                            balls[i] = bullBall;
//                        }
//                    }
//                    System.out.println("您购买了"+note+"注彩票，一共消费了"+note*2+"元钱，您购买的彩票号码为：");
//                    for (int num : balls) {
//                        System.out.print(num+"\t");
//                    }
//                    System.out.println();
//                    isBuy = true;
//                    break;
//                case 2:
//                    if (isBuy==true) {
//                        System.out.println("双色球系统》》查看开奖");
//
//                        int[] luckyBall = getLuckyBall();
//
//                        int level = getLevel(balls, luckyBall);
//
//                        switch (level) {
//                            case 1:
//                                System.out.println("恭喜你，中了一等奖，1注奖金是500万，您一共获得："+500*note+"万元");
//                                break;
//                            case 2:
//                                System.out.println("恭喜你，中了二等奖，1注奖金是100万，您一共获得："+100*note+"万元");
//                                break;
//                            case 3:
//                                System.out.println("恭喜你，中了三等奖，1注奖金是30万，您一共获得："+30*note+"万元");
//                                break;
//                            case 4:
//                                System.out.println("恭喜你，中了四等奖，1注奖金是5万，您一共获得："+5*note+"万元");
//                                break;
//                            case 5:
//                                System.out.println("恭喜你，中了五等奖，1注奖金是2000元，您一共获得："+2000*note+"元");
//                                break;
//                            case 6:
//                                System.out.println("恭喜你，中了六等奖，1注奖金是5元，您一共获得："+5*note+"元");
//                                break;
//                            case 7:
//                                System.out.println("不好意思，你没有中奖！");
//                        }
//                    } else {
//                        System.out.println("对不起，请先购买彩票!");
//                    }
//                    break;
//                case 3:
//                    System.out.println("双色球系统》》退出");
//                    return;
//            }
//        }
        Date date = new Date();
//        Date date = new Date();
//        new ArrayList();
////        new HashMap();
        System.out.println(date);
        
        int[] a = new int[]{1,2,3};
        for (int i = 0; i < a.length; i++) {
            
        }
        for (int i = a.length - 1; i >= 0; i--) {
            
        }
        for (int i : a) {
            
        }

        if (a == null) {

        }
        if (a != null) {

        }
        /**
         * 功能描述:
         * @param: 
         * @return: 
         * @auther: 
         * @date:  
         */     
    }



    public static void delArrIndex(int[] arr, int index) {
        for (int i = index+1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
    }

    public static int[] getLuckyBall() {
//        int[] luckyBall = {1,2,3,4,5,6,7};
        int[] luckyBall = new int[7];
        for (int i = 0; i< luckyBall.length; i++) {
            if (i!=(luckyBall.length-1)) {
                luckyBall[i] = (int)(Math.random()*33)+1;
            } else {
                luckyBall[luckyBall.length-1] = (int)(Math.random()*16)+1;
            }
        }
        System.out.println("幸运号码是："+ Arrays.toString(luckyBall));
        return luckyBall;
    }

    public static int getLevel(int[] balls, int[] luckyBall) {
        int level = 0;

        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < balls.length; i++) {
            if (i != (balls.length-1)) {
//                for (int j = 0 ; j < (luckyBall.length-1); j++) {
//                    if (balls[i] == luckyBall[j]) {
//                        redCount++;
//                    }
//                }
                if (balls[i] == luckyBall[i]) {
                    redCount++;
                }
            } else {
                if (balls[balls.length-1]==luckyBall[luckyBall.length-1]) {
                    blueCount++;
                }
            }
        }
        System.out.println("红球有"+redCount+"个相等");
        System.out.println("蓝球有"+blueCount+"个相等");

        if (redCount==6&&blueCount==1) {
            level = 1;
        } else if (redCount==6) {
            level = 2;
        } else if (redCount==5&&blueCount==1) {
            level = 3;
        } else if (redCount==5||(redCount==4&&blueCount==1)) {
            level = 4;
        } else if (redCount==4||(redCount==3&&blueCount==1)) {
            level = 5;
        } else if (blueCount==1){
            level = 6;
        } else {
            level = 7;
        }
        return level;
    }
}
