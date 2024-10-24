
import Main1;
public class Calculator {
        @FunctionalInterface
        interface Function2 {
            int perform(int a, int b);
        }
        private boolean isStarted=false;
        public int operate(String operation,int first, int second){
            switch (operation){
                case "+":
                    return operate((a,b)->a+b,first,second);
                case "-":
                    return operate((a,b)->a-b,first,second);
                case "":
                    return operate((a,b)->ab,first,second);
                case "/":
                    if (second == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    return operate((a,b)->a/b,first,second);
                case "^":
                    return operate((a,b)->{
                        int res=1;
                        for(int i=0;i<b;i++){
                            res*=a;
                        }
                        return res;
                    },first,second);
                default:
                    throw new RuntimeException("Operation not supported");
            }
        }
        private int operate(Function2 operation, int a, int b){
            return operation.perform(a,b);
        }
        public void start(){
            if(isStarted==false) {
                System.out.println("Calculator Started");
                isStarted=true;
            } else {
                throw new RuntimeException("Calculator is already on");
            }
        }
        public void stop(){
            if(isStarted==true) {
                System.out.println("Calculator is stopped");
                isStarted=false;
            } else {
                throw new RuntimeException("Calculator is already stopped");
            }
        }
    }

}
