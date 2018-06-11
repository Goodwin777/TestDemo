 public class Program {
    public static void main(String[]arg){
//        Numbers numbers = new Numbers();
//        int result = numbers.sum(5);
//        System.out.println(result);
//        minus();
        open_page();

    }

    private static void minus() {
        NumbersMinus numbersMinus = new NumbersMinus();
        int result = numbersMinus.result(1,2);
        System.out.println(result);

        System.out.println(NumbersMinus.res2(2, 1));



    }

    private static void open_page() {
        Page page = new Page();
        page.OpenPage("https://google.com.ua");
    }
}
