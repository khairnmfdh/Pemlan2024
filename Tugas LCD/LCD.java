import java.util.Scanner;

public class LCD {
    private String Status;
    private int Volume;
    private int Bright;
    private String Cable;

    Scanner input = new Scanner(System.in);

    public LCD() {
        this.Status = "OFF";
        this.Volume = 50;
        this.Bright = 50;
        this.Cable = "HDMI";
    }
    public void statusInput() {
        System.out.print("Status:");
        String s = input.nextLine();
        setStatus(s);
        }
    public void volumeInput() {
        System.out.print("Volume:");
        int v = input.nextInt();
        setVolume(v);
    }
    public void brightInput() {
        System.out.print("Brightness:");
        int b = input.nextInt();
        setBright(b);
    }
    public void cableInput() {
        System.out.print("Cable:");
        String c = input.next();
        setCable(c);
    }
    public void turnOff() {
        Status = "OFF";
    }
    public void turnOn(){
        Status = "ON";
    }
    public void Freeze(){
        Status = "FREEZE";
    }
    public void setStatus(String s){
        switch (s) {
            case "ON" :
                turnOn();
                break;
            case "OFF" :
                turnOff();
                break;
            case "FREEZE" :
                Freeze();
                break;
            default :
            System.out.println("Error!");
        }
    }
    public void volumeUp(){
        if(Status.equals("ON")){
            Volume+=1;
            if(Volume > 100){
                Volume = 100;
            }
        }
    }
    public void volumeDown(){
        if(Status.equals("ON")){
            Volume-=1;
            if(Volume <  0){
                Volume = 0;
            }
        }
    }
    public void setVolume (int v){
        if(Status.equals("ON")){
            if (Volume >=0 && Volume <=100) {
                Volume = v;
            }else {
                System.out.print("Invalid Volume");
        }
    }
    }
    public void brightUp(){
        if(Status.equals("ON")){
            Bright+=10;
            if(Bright > 100){
            Bright = 100;
            }
        }
    }
    public void brightDown(){
        if(Status.equals("ON")){
            Bright-=10;
            if(Bright < 0){
            Bright = 0;
            }
        }
    }
    public void setBright(int b){
        if(Status.equals("ON")){
        if(Bright >= 0 && Bright <=100){
            Bright = b;
        }else {
            System.out.print("Brightness Invalid");
        }
    }
    }
    public void vgaCable() {
        Cable = "VGA";
    }
    public void dviCable(){
        Cable = "DVI";
    }
    public void hdmiCable(){
        Cable = "HDMI";
    }
    public void displayPortCable() {
        Cable = "Display Port";
    }
    public void setCable(String c) {
        if(Status.equals("ON")){
        switch (c) {
            case "VGA" :
                vgaCable();
                break;
            case "DVI" :
                dviCable();
                break;
            case "HDMI" :
                hdmiCable();
                break;
            case "DisplayPort" :
                displayPortCable();
                break;
            default :
                System.out.print("Invalid Cable Type!");
        }
    }
    } 
    public void  display() {
        System.out.println("LCD Status: "+Status);
        System.out.println("Volume: "+Volume);
        System.out.println("Brightness: "+Bright);
        System.out.println("Cable: "+Cable);
        volumeUp();
    }
}

    
