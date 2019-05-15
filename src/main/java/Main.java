public class Main {

    public static void main(String[] args) {
        String text = ComplexCalculator.add("gienek", "loska");
        System.out.println("text = " + text);
        double wynik = ComplexCalculator.add(1.0, 2.0);
        System.out.println("wynik = " + wynik);

        Product pr1 = new Product("koło", "kormoran", "automotive", 199.99);
        Product pr2 = new Product("Uszczelka", "kormoran", "automotive");

        System.out.println(pr1);
        System.out.println(pr2);

        Notebook l1 = new Notebook("Lenovo", "p52", 64, 3.6, true);
        Notebook l2 = new Notebook("Asus", "UX500v", 4.5, true);
        Notebook l3 = new Notebook("Acer", "x500", 48, 1.8);

        numberAnalysis(2);
        numberAnalysis(9);

        System.out.println(YearCheck.isLeap(2012));
        System.out.println(YearCheck.isLeap(2100));
    }

    public static void numberAnalysis(int number){
        System.out.println("liczba "+number+" jest");
        if( number % 2 ==0 ){
            System.out.println("parzysta");
        } else{
            System.out.println("nieparzysta");
        }

        if(number>-1){
            System.out.println("dodatnia");
        }else{
            System.out.println("ujemna");
        }

        if(((number * 9) % 6 )==0 ){
            System.out.println(number*9+" jet podzielna przez 6");
        } else{
            if(number*number < 100){
                System.out.println(number*number + " jest mniejsza od 100");
            }

        }



    }
}
