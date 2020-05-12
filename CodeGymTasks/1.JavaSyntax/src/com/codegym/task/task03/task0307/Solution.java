package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg.name="Zerg1";
        zerg2.name="zerg2";
        zerg3.name="zerg3";
        zerg4.name="zerg4";
        zerg5.name="zerg5";
        Protoss protoss=new Protoss();
        Protoss protoss2=new Protoss();
        Protoss protoss3=new Protoss();
        protoss.name="protoss1";
        protoss2.name="protoss2";
        protoss3.name="protoss3";
        Terran terran=new Terran();
        Terran terran2=new Terran();
        Terran terran3=new Terran();
        Terran terran4=new Terran();
        terran.name="terran1";
        terran2.name="terran2";
        terran3.name="terran3";
        terran4.name="terran4";




    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
