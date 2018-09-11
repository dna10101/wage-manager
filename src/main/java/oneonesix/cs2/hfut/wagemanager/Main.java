//package oneonesix.cs2.hfut.wagemanager;
//
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        int test = 0;
//        Scanner in = new Scanner(System.in);
//        test = in.nextInt();
////        int [][] map ;
//        int[] du;
//        for(int i =0;i<test;i++){
//            int n,m;
//            n = in.nextInt();
//            m = in.nextInt();
////            map = new int[n][n];
//            du = new int[n+1];
//            for(int j=0;i<m;i++){
//                int x=in.nextInt();
//                int y=in.nextInt();
////                map[x][y] = 1;
//                du[x]++;
//                du[y]++;
//            }
//            boolean isYes = false;
//            int two = 0;
//            for(int k=1;k<du.length;k++){
//                if(du[k]==n-1){
//                    isYes = true;
//                    break;
//                }
//                if(du[k]==2){
//                    two++;
//                }
//            }
//            if(isYes||two==n){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//        }
//        in.close();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////import java.util.*;
////
////public class Main{
////    public static void main(String[] args) {
////        Integer n = 0;
////        LinkedList<Thing> list = new LinkedList<Thing>();
////        Scanner in = new Scanner(System.in);
////        n = in.nextInt();
////        for(int i =0;i<n;i++){
////            insert(new Thing(in.nextInt(),in.nextInt(),in.nextInt()),list);
////        }
////        in.close();
////        System.out.println(n-list.size());
////    }
////    public static void insert(Thing thing,LinkedList<Thing> list){
////        boolean insertFlag = true;
////        boolean deleteFlag = false;
////        Collection collection = new LinkedList();
////        for(Iterator<Thing> it = list.iterator();it.hasNext();){
////            Thing thing1 = it.next();
////            if(thing.little(thing1)){
////                insertFlag = false;
////                break;
////            }else if(thing1.little(thing)){
////                collection.add(thing1);
////                deleteFlag = true;
////            }
////        }
////        if(deleteFlag){
////            list.removeAll(collection);
////        }
////        if(insertFlag){
////            list.addLast(thing);
////        }
////    }
////}
////class Thing{
////    Integer a;
////    Integer b;
////    Integer c;
////
////    public boolean little(Thing thing){
////        if(this.a<thing.getA()&&this.b<thing.getB()&&this.c<thing.getC()){
////            return true;
////        }
////        return false;
////    }
////
////    public Thing(Integer a, Integer b, Integer c) {
////        this.a = a;
////        this.b = b;
////        this.c = c;
////    }
////
////    public Integer getA() {
////        return a;
////    }
////
////    public void setA(Integer a) {
////        this.a = a;
////    }
////
////    public Integer getB() {
////        return b;
////    }
////
////    public void setB(Integer b) {
////        this.b = b;
////    }
////
////    public Integer getC() {
////        return c;
////    }
////
////    public void setC(Integer c) {
////        this.c = c;
////    }
////}
