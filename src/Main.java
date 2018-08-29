import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // String s =JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        //JOptionPane.showMessageDialog(null,s,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans =JOptionPane.showConfirmDialog(null,"Do u love me?","title",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ้บๆ ");
        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลย ");
        }
    }
}
