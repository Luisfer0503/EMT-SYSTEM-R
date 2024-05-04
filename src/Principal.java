import login.*;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.util.*;

public class Principal{
    public static void main(String []args){
        JFrame fr=new JFrame("EMT-SYSTEM");
        Dimension tam= Toolkit.getDefaultToolkit().getScreenSize();
        int x=(tam.width/2)-250;
        int y=(tam.height/2)-200;
        login lo=new login();
        fr.setContentPane(lo.getJpanel());
        fr.setSize(500,450);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocation(x,y);
        fr.setVisible(true);
    }
}