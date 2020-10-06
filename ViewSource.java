package lab3.vd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class ViewSource {
public static void main(String[] args)
{
URL u;
String thisLine;
if(args.length>0){
try{
u = new URL(args[0]);

try{
BufferedReader br = new BufferedReader(new
InputStreamReader(u.openStream())); 
}
}
}
}