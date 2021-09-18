package ncbai2;
import java.util.Scanner;

public class PhanSo{
    int tu,mau;
    Scanner input=new Scanner(System.in);
    public PhanSo()
    {
        
    }
    public static void main(String[] args){
        
        PhanSo ps1=new PhanSo();
        PhanSo ps2=new PhanSo();
        ps1.inputPS();
        ps2.inputPS();
        ps1.outputPS("Phan so 1 la: ");     
        ps2.outputPS("Phan so 2 la: ");
        ps1.nghichdao();
        ps1.outputPS("Phan so 1 sau khi nghich dao la: ");
        ps2.nghichdao();
        ps2.outputPS("Phan so 2 sau khi nghich dao la: ");
        ps1.tong(ps2).outputPS("Tong hai phan so la: ");
        ps1.hieu(ps2).outputPS("Hieu hai phan so la: ");
        ps1.tich(ps2).outputPS("Tich hai phan so la: ");
        ps1.thuong(ps2).outputPS("Thuong hai phan so la:");

        
    }
    
    public void inputPS()
    {
        System.out.print("Nhap tu so: ");
        this.tu=input.nextInt();
        do{
        System.out.print("Nhap mau so: ");
        this.mau=input.nextInt();
        } 
        while (this.mau==0);
    }
    public void outputPS(String y)
    {
        System.out.println(y+" " +this.tu+"/"+this.mau);
    }
    public int UCLN(int b,int c)
    {
        if ((b==0) || (c==0))
            return b+c;
        while(b!=c)
        {
            if(b>c)
                b=b-c;
            else
                c=c-b;
        }
        return b;
    }
    public void ToiGian() 
    {
        int i=UCLN(tu,mau);
        this.tu = this.tu/i;
        this.mau = this.mau/i;
    }
    public void nghichdao()
    {
        int tam =this.tu;
        this.tu = this.mau;
        this.mau = tam;
    }
    public PhanSo tong(PhanSo a)
    {
        PhanSo ps=new PhanSo();
        ps.tu = (this.tu*a.mau) + (this.mau*a.tu);
        ps.mau = (this.mau*a.mau);
        ps.ToiGian();
        return ps;
    }
    public PhanSo hieu(PhanSo a)
    {
        PhanSo ps=new PhanSo();
        ps.tu = (this.tu*a.mau) - (this.mau*a.tu);
        ps.mau = (this.mau*a.mau);
        ps.ToiGian();
        return ps;
    }
    public PhanSo tich(PhanSo a)
    {
        PhanSo ps=new PhanSo();
        ps.tu = this.tu*a.tu;
        ps.mau = this.mau*a.mau;
        ps.ToiGian();
        return ps;
    }
    public PhanSo thuong(PhanSo a)
    {
        PhanSo ps=new PhanSo();
        ps.tu = this.tu*a.mau;
        ps.mau = this.mau*a.tu;
        ps.ToiGian();
        return ps;
    }


}