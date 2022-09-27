package exercise2;

public class Sqrt {
    public static void main(String[] args) {
        sqrt(45);
    }
// т.к. здесь вычисление формулы детальное обозначение переменных не обязательна
// если не так, то простите :/
    static void sqrt(int x){
        double z = x;
        int i = 0;
        while ((z * z > x)&&(i < 200)){
            z = (z + x / z) /2;
            i++;
        }
        System.out.println(z);
    }
}
