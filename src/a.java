public class a {
    public static void main(String[] args) {
        System.out.println(fi(-3,-2));
        //String s = "NNYYYYYNNYY";
        //System.out.println(calDPDScore(s));
    }
    public static int  calDPDScore(String dpdInfo) {
        // write code here
        char[] chars = dpdInfo.toCharArray();
        int len = chars.length;
        int count=0;
        int res = 0;
        int i=0;
        while(i<len){
            while(chars[i++]=='Y'){
                count++;
            }
            if(count>0 && count<=3){
                res-=10;
                count=0;
            }else if(count>3 && count<=7){
                res-=15;
                count=0;
            }else if(count>7){
                res-=25;
                count=0;
            }
        }
        return res;
    }
    public static int fi(int x,int  y){
        if(x<0 && y<0){
            return fi(x+1,y)+fi(x,y+1);
        }
        return x+y;
    }

}
