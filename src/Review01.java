
public class Review01 {

    public static void main(String[] args) {
        int teika=1500;
        int taxRate=10;
        
        int syouhizei=tax(teika,taxRate);
        int zeikomi=teika+syouhizei;
        System.out.println(teika+"円の商品の税込価格は"+zeikomi+"円（消費税は"+syouhizei+"円）です。");
    }
    public static int tax(int teika,int taxRate) {
        int result=teika*taxRate/100;
        return result;
    }
    }

