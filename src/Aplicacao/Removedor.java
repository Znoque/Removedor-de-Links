/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

/**
 *
 * @author Znoque
 */
public class Removedor {
    int x=0;
    int y=0;
    int y2=0;
    int max=0;
    
    public String removeURL(String s){
        for(int i=0; i<s.length(); i++){
            if(s.contains("http")){
                x = s.indexOf("http");
            }
            
            if(s.contains(".com")){
                y = s.indexOf(".com")+4;
            }else if(s.contains(".com ")){
                y = s.indexOf(".com ")+4;
            }else if(s.contains(".org ")){
                y = s.indexOf(".org ")+4;
            }else if(s.contains(".org")){
                y = s.indexOf(".org")+4;
            }else if(s.contains(".net ")){
                y = s.indexOf(".net ")+4;
            }else if(s.contains(".net")){
                y = s.indexOf(".net")+4;
            }
        
            StringBuilder sb = new StringBuilder(s);
            if(x!=0 && y!=0){
                if(x<y){
                    sb.delete(x, y);
                    sb.insert(x,"[REMOVIDO]");
                    s=sb.toString();
                    x=0;
                    y=0;
                }else{
                    sb.delete(y, x);
                    sb.insert(y,"[REMOVIDO]");
                    s=sb.toString();
                    x=0;
                    y=0;
                }
            }
        }
        return s;
    }

    public String removeBR(String s){
        //Remove .br
        for(int i=0; i<s.length(); i++){
            if(s.contains(".br")){
               y = s.indexOf(".br");
               y2 = s.indexOf(".br")+3;
            }else if(s.contains(".br ")){
               y = s.indexOf(".br ");
               y2 = s.indexOf(".br ")+3;
            }
            
            StringBuilder sb = new StringBuilder(s);
            if(y!=0 && y2!=0){
                if(y<y2){
                   sb.delete(y, y2);
                   s=sb.toString();
                   x=0;
                   y=0;
                }
            }
        }
        return s;
    }
    
    public String removeBar(String s){
        int n=0;
        int n2=0;
        int n3=0;
        String s2 = "";
        StringBuilder s3 = new StringBuilder();
        StringBuilder sb = new StringBuilder(s);
        sb.append(" ");
        
        for(int z=0; z<s.length(); z++){
            //Remove Apenas a '/'
            if(s.contains("/ ")){
                n = s.indexOf("/ ");
                sb.delete(n, n+1);
                s=sb.toString();
            }else if(s.contains("/")){
                n = s.indexOf("/");
            }
        }
        
        for(int i=n; i<s.length(); i++){
                s2+= s.charAt(i);
        }
        
        //Remove da '/' ao Próximo ' '
        if(s2.contains("/")){
            n2 = s2.indexOf("/")+n;
            n3 = s2.indexOf(" ") + n2;
            sb.delete(n2, n3);
            s=sb.toString();
            n=n3;
        }
            
        for(int z=0; z<sb.length(); z++){
            n2=0;
            n3=0;    
            s2="";
            s3.delete(0, s3.length());
            for(int i=n; i<sb.length(); i++){
                s2+= s.charAt(i);
            }
            if(s2.contains("/")){
                int a=s2.indexOf("/");
                n2 = a+n;
                s3.append(s2);
                s3.delete(0, a);
                s2=s3.toString();
                n3 = s2.indexOf(" ") + n2;
                sb.delete(n2, n3);
                s=sb.toString();
                n=n3;
            }
        } 
        //Removendo espaço final
        StringBuilder r = new StringBuilder(s);
        max=s.length();
        r.delete(max-1, max);
        s=r.toString();
        return s;
    }
}
