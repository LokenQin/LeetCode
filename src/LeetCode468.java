/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-09
 * @ClassName: LeetCode468
 * @Description: TODO
 */
public class LeetCode468 {
    public static void main(String[] args) {
        Solution468 solution468 = new Solution468();
        String s = solution468.validIPAddress("172..254.1");
        System.out.println(s);
    }
}
class Solution468 {
    public String validIPAddress(String IP) {
        boolean flag = true;
        String res = "Neither";
        if(IP.contains(".")){                   //判断是否为IPV4型
            if(IP.charAt(0)=='.'||IP.charAt(IP.length()-1)=='.'){
                flag = false;
            }else{
                String[] everyIP = IP.split("\\.");
                if(everyIP.length!=4){
                    flag  = false;
                }else{
                    for(int i=0;i<4;i++){
                        if(everyIP[i].length()>3||everyIP[i].length()<1){
                            flag=false;
                            break;
                        }else{
                            if(everyIP[i].length()==3){
                                if(everyIP[i].charAt(0)>'9'||everyIP[i].charAt(1)>'9'||everyIP[i].charAt(2)>'9'){
                                    flag=false;
                                    break;
                                }else{
                                    if(everyIP[i].charAt(0)=='0'){
                                        flag=false;
                                        break;
                                    }
                                    if(everyIP[i].charAt(0)>'2'){
                                        flag=false;
                                        break;
                                    }else if(everyIP[i].charAt(0)=='2'){
                                        if(everyIP[i].charAt(1)>'5'){
                                            flag=false;
                                            break;
                                        }else if(everyIP[i].charAt(1)=='5'){
                                            if(everyIP[i].charAt(2)>'5'){
                                                flag=false;
                                                break;
                                            }
                                        }
                                    }

                                }

                            }else if(everyIP[i].length()==2){
                                if(everyIP[i].charAt(0)>'9'||everyIP[i].charAt(1)>'9'){
                                    flag=false;
                                    break;
                                }else{
                                    if(everyIP[i].charAt(0)=='0'){
                                        flag=false;
                                        break;
                                    }
                                }
                            }else if(everyIP[i].length()==1){
                                if(everyIP[i].charAt(0)>'9'){
                                    flag=false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if(flag){
                res="IPv4";
            }
        }else if(IP.contains(":")){
            if(IP.charAt(0)==':'||IP.charAt(IP.length()-1)==':'){
                flag = false;
            }
            String[] everyIP = (IP.toUpperCase()).split(":");
            if(everyIP.length!=8){
                flag=false;
            }else{
                for(int i = 0;i<8;i++){
                    if(everyIP[i].length()>4){
                        flag=false;
                        break;
                    }else if(everyIP[i].length()==4){
                        if(everyIP[i].charAt(0)>'F'||everyIP[i].charAt(1)>'F'||everyIP[i].charAt(2)>'F'||everyIP[i].charAt(3)>'F'){
                            flag=false;
                            break;
                        }
                    }else if(everyIP[i].length()==3){
                        if(everyIP[i].charAt(0)>'F'||everyIP[i].charAt(1)>'F'||everyIP[i].charAt(2)>'F'){
                            flag=false;
                            break;
                        }
                    }else if(everyIP[i].length()==2){
                        if(everyIP[i].charAt(0)>'F'||everyIP[i].charAt(1)>'F'){
                            flag=false;
                            break;
                        }
                    }else if(everyIP[i].length()==1){
                        if(everyIP[i].charAt(0)>'F'){
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                res="IPv6";
            }
        }else{
            res = "Neither";
        }
        return res;
    }
}
