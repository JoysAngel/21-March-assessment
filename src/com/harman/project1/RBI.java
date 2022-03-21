package com.harman.project1;


    public class RBI {
        float getInterestRate(){
            return 12;
        }
    }

    class SBI extends RBI{
        @Override
        float getInterestRate() {
            return 12.8F;
        }
    }
    class Axis extends RBI{
        @Override
        float getInterestRate() {
            return 16;
        }
    }
    class Icici extends RBI{
        @Override
        float getInterestRate() {
            return 16.2F;
        }
    }

    class Test extends RBI{
        public static void main(String[] args) {
            RBI obj = new RBI();
            System.out.println("The Interest Rate of RBI: " + obj.getInterestRate());
            SBI sbiobj = new SBI();
            System.out.println("The Interest Rate of SBI: " + sbiobj.getInterestRate());
            Axis axisobj = new Axis();
            System.out.println("The Interest Rate of Axis: " + axisobj.getInterestRate());
            Icici iciciobj = new Icici();
            System.out.println("The Interest Rate of ICICI: " + iciciobj.getInterestRate());


        }
    }


