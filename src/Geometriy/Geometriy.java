package Geometriy;

public class Geometriy {

        public static void main(String[] args) {
                double b1=99;
                double b2=33;
                double b3=11;
                double s;
                double q;
         q=b2/b1;
                System.out.println("Знаменатель равен " + q);
          s=(b1-b3*q)/(1-q); //Sn = (b1 — bn ⋅ q) / (1 — q), где q ≠ 1
                System.out.println("Сумма геометрической прогресии равна " + s);
}}
