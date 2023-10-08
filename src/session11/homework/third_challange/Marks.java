package session11.homework.third_challange;


public abstract class Marks {
    public abstract float getPercentage();

    public static void main(String[] args) {
           A studentA = new A(10, 82, 58);
            System.out.println("The firsts student marks are: " + studentA.getPercentage() + "%");
            B studentB = new B(53, 44, 97, 63);
            System.out.println("The second student marks are: " + studentB.getPercentage() + "%");
        }
    }


    class A extends Marks {
        private float marks1, marks2, marks3;

        public A(float marks1, float marks2, float marks3) {
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
        }

        @Override
        public float getPercentage() {
            return ((marks1 + marks2 + marks3 / 300) * 100);
        }
    }

    class B extends Marks {
        private float marks1, marks2, marks3, marks4;

        public B(float marks1, float marks2, float marks3, float marks4) {
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
            this.marks4 = marks4;
        }

        @Override
        public float getPercentage() {
            return ((marks1 + marks2 + marks3 + marks4 / 400) * 100);
        }
    }
